package com.bookshop.control;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bookshop.pojo.User;
import com.bookshop.server.UserMapperServer;

@Controller
public class UserInfo {
	@Autowired
	UserMapperServer userMapperServer;

	@RequestMapping("userinfo")
	public String userform(HttpSession session) {
		if (session.getAttribute("user") == null) {
			return "login";
		} else {
			return "userinfo";
		}
	}

	@RequestMapping(value = "updateuser", method = RequestMethod.POST)
	public String updateUser(User user, HttpSession session) {
		if (session.getAttribute("user") == null) {
			return "login";
		}
		User user2 = (User) session.getAttribute("user");
		user.setId(user2.getId());
		user.setBlance(user2.getBlance());
		user.setPassword(user2.getPassword());
		if (userMapperServer.updateUser(user) > 0) {
			session.setAttribute("user", userMapperServer.selectUserById(user.getId()));
			return "index";
		} else {
			return "404";
		}
	}

	@RequestMapping("alterpassform")
	public String alterPasswordform(HttpSession session) {
		if (session.getAttribute("user") == null) {
			return "login";
		}
		return "alterpassword";
	}

	@RequestMapping(value = "alterpass", method = RequestMethod.POST)
	public String alterPassword(String oldpassword, String newpassword, String newpassword2, HttpSession session,
			Model model) {
		User user = (User) session.getAttribute("user");
		if (user == null) {
			return "login";
		}
		if (!CodeEn.encode(oldpassword).equals(user.getPassword())) {
			model.addAttribute("message1", "原密码不正确");
			return "alterpassword";
		} else if (!newpassword2.equals(newpassword)) {
			model.addAttribute("message2", "两次密码不一致");
			return "alterpassword";
		} else {
			userMapperServer.alterpassword(newpassword, user.getId());
		}
		session.removeAttribute("user");
		return "redirect:login";
	}
}
