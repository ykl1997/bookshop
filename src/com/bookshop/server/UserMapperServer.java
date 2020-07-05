package com.bookshop.server;

import java.math.BigDecimal;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookshop.control.CodeEn;
import com.bookshop.dao.UserMapper;
import com.bookshop.pojo.User;
import com.bookshop.pojo.UserExample;
import com.bookshop.pojo.UserExample.Criteria;

@Service
public class UserMapperServer {
	@Autowired
	UserMapper userdao;

	public List<User> login(String username) {

		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(username);
		return userdao.selectByExample(example);
	}

	public int signup(User user) throws Exception {
		user.setBlance(new BigDecimal(100.00));
		MessageDigest md5 = MessageDigest.getInstance("md5");
		byte[] digest = md5.digest(user.getPassword().getBytes("utf-8"));
		String encodePassword = Base64.getEncoder().encodeToString(digest);
		user.setPassword(encodePassword);
		return userdao.insert(user);
	}

	public int updateUser(User user) {
		return userdao.updateByPrimaryKeySelective(user);
	}

	public User selectUserById(Integer id) {
		return userdao.selectByPrimaryKey(id);
	}

	public int alterpassword(String newpassword, Integer id) {
		User user = new User();
		String password = CodeEn.encode(newpassword);
		user.setPassword(password);
		user.setId(id);
		return userdao.updateByPrimaryKeySelective(user);
	}

	public boolean isExistUser(String username) {
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(username);
		List<User> list = userdao.selectByExample(example);
		if (list.size() >= 1) {
			return true;
		} else {
			return false;
		}

	}
}
