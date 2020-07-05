package com.bookshop.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TopupControl {

	@RequestMapping("topuppage")
	public String topuppage() {
		return "topup";
	}
}
