package com.bookshop.control;

import java.security.MessageDigest;
import java.util.Base64;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bookshop.pojo.Book;
import com.bookshop.pojo.User;
import com.bookshop.server.BookMapperServer;
import com.bookshop.server.UserMapperServer;

@Controller
public class LoginContrl {
	@Autowired
	UserMapperServer userMapperServer;

	@Autowired
	BookMapperServer bookMapperServer;

	@RequestMapping("login")
	public String loginfrom() {
		return "login";
	}

	@RequestMapping(value = "tologin", method = RequestMethod.POST)
	public String login(String username, String password, HttpSession session, Model model) throws Exception {
		MessageDigest md5 = MessageDigest.getInstance("md5");
		byte[] digest = md5.digest(password.getBytes("utf-8"));
		String encodePassword = Base64.getEncoder().encodeToString(digest);
		List<User> login = userMapperServer.login(username);
		if (login.size() > 0) {
			User user = login.get(0);
			if (user.getPassword().equals(encodePassword)) {
				session.setAttribute("user", user);
				return "redirect:index";
			} else {
				model.addAttribute("message", "密码错误！");
				return "login";
			}
		} else {
			model.addAttribute("message", "用户名不存在！");
			return "login";
		}
	}

	@RequestMapping("logout")
	public String logout(HttpSession session) {
		session.removeAttribute("user");
		return "login";
	}

	@RequestMapping("index")
	public String index(Model model) {
		List<Book> books = bookMapperServer.selectBooksOneToNeight();
		model.addAttribute("books", books);
		return "index";
	}

}
