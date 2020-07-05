package com.bookshop.control;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bookshop.pojo.Book;
import com.bookshop.server.BookMapperServer;

@Controller
public class BookContrl {
	@Autowired
	BookMapperServer bookMapperServer;

	@RequestMapping("tobuy")
	public String olderBook(Integer id, Model model, HttpSession session) {
		if (session.getAttribute("user") == null) {
			return "redirect:login";
		}
		Book book = bookMapperServer.selectById(id);
		model.addAttribute("book", book);
		return "orderform";
	}

	@RequestMapping("lookupBook")
	public ModelAndView lookupBook(String authorOrBookname) {
		ModelAndView modelAndView = new ModelAndView("booklist");
		List<Book> books = bookMapperServer.seleceBooksWithAutorOrBookname(authorOrBookname);
		modelAndView.addObject("books", books);
		return modelAndView;
	}

	@RequestMapping("findBycategory")
	public ModelAndView findBycategory(String category) {
		ModelAndView modelAndView = new ModelAndView("booklist");
		List<Book> books = bookMapperServer.selectBooksByCategory(category);
		modelAndView.addObject("books", books);
		return modelAndView;
	}

}
