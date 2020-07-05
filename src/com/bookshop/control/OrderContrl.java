package com.bookshop.control;

import java.math.BigDecimal;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bookshop.pojo.Book;
import com.bookshop.pojo.Order;
import com.bookshop.pojo.User;
import com.bookshop.server.BookMapperServer;
import com.bookshop.server.OrderMapperServer;
import com.bookshop.server.UserMapperServer;

@Controller
public class OrderContrl {
	@Autowired
	BookMapperServer bookMapperServer;
	@Autowired
	OrderMapperServer orderMapperServer;
	@Autowired
	UserMapperServer userMapperServer;

	@RequestMapping(value = "order", method = RequestMethod.POST)
	public String orderFrom(Integer id, Model model, HttpSession session) {
		User user = (User) session.getAttribute("user");
		if (user == null) {
			return "login";
		}
		Book book = bookMapperServer.selectById(id);
		model.addAttribute("book", book);
		model.addAttribute("name", user.getName());
		return "placeorder";
	}

	@ResponseBody
	@RequestMapping(value = "changprince")
	public String changePrice(int num, Integer id) {
		Book book = bookMapperServer.selectById(id);
		BigDecimal totalPrince = book.getPrice().multiply(new BigDecimal(num));
		return totalPrince.toString();
	}

	@RequestMapping(value = "saveolder", method = RequestMethod.POST)
	@Transactional
	public String saveOder(Integer bookid, int booknum, String receivingaddress, String receiver, HttpSession session,
			Model model) {
		User user = (User) session.getAttribute("user");
		if (user == null) {
			return "login";
		}
		Book book = bookMapperServer.selectById(bookid);
		BigDecimal totalBigDecimal = book.getPrice().multiply(new BigDecimal(booknum));
		if (totalBigDecimal.compareTo(user.getBlance()) == 1) {
			model.addAttribute("message", "余额不足，请充值！");
			return "userinfo";
		} else if (book.getStock() < booknum) {
			model.addAttribute("message", "库存不足！");
			return "forward:tobuy?id=" + bookid;
		} else {
			book.setStock(book.getStock() - booknum);
			bookMapperServer.updateBookNum(book);
			user.setBlance(user.getBlance().subtract(totalBigDecimal));
			userMapperServer.updateUser(user);
			Order order = new Order(null, user.getId(), bookid, receivingaddress, booknum, user.getPhone(),
					totalBigDecimal, receiver, book.getBookname());
			orderMapperServer.insetOrder(order);
			return "redirect:index";
		}
	}

	@RequestMapping("orderlist")
	public String orderList(HttpSession session, Model model) {
		User user = (User) session.getAttribute("user");
		if (user == null) {
			return "login";
		}
		List<Order> orders = orderMapperServer.selectOrderByUserId(user.getId());
		model.addAttribute("orders", orders);
		return "orderlist";

	}

}
