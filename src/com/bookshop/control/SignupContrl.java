package com.bookshop.control;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bookshop.pojo.User;
import com.bookshop.server.UserMapperServer;

@Controller
public class SignupContrl {
	@Autowired
	UserMapperServer userdao;

	@RequestMapping(value = "tosignup", method = RequestMethod.POST)
	public String singup(User user, Model model) throws Exception {
		if (userdao.isExistUser(user.getUsername())) {
			model.addAttribute("error", "oc");
			model.addAttribute("errorusername", "该用户已注册");
			return "login";
		} else if (user.getPassword().isBlank() || user.getPassword().length() < 6) {
			model.addAttribute("error", "oc");
			model.addAttribute("errorpassword", "密码不能为空格且密码要大于等于6位");
			return "login";
		} else if (user.getName().isBlank()) {
			model.addAttribute("error", "oc");
			model.addAttribute("errorname", "姓名不能为空");
			return "login";
		} else if ("^[1][3,4,5,7,8][0-9]{9}$".matches(user.getPhone())) {
			model.addAttribute("error", "oc");
			model.addAttribute("errorphone", "电话号码不正确");
			return "login";
		}
		userdao.signup(user);
		return "redirect:login";
	}

	@ResponseBody
	@RequestMapping("checksignup")
	public String checksignup(String username) throws UnsupportedEncodingException {
		if (userdao.isExistUser(username)) {
			return URLEncoder.encode("该账号已注册", "utf-8");
		} else {
			return URLEncoder.encode("", "utf-8");
		}

	}

}
