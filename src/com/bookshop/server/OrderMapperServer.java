package com.bookshop.server;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookshop.dao.OrderMapper;
import com.bookshop.pojo.Order;
import com.bookshop.pojo.OrderExample;
import com.bookshop.pojo.OrderExample.Criteria;

@Service
public class OrderMapperServer {

	@Autowired
	OrderMapper ordermapper;

	public int insetOrder(Order order) {
		return ordermapper.insert(order);
	}

	public List<Order> selectOrderByUserId(Integer id) {
		OrderExample example = new OrderExample();
		Criteria criteria = example.createCriteria();
		criteria.andUseridEqualTo(id);
		return ordermapper.selectByExample(example);
	}
}
