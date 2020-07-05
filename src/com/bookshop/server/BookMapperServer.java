package com.bookshop.server;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookshop.dao.BookMapper;
import com.bookshop.pojo.Book;
import com.bookshop.pojo.BookExample;
import com.bookshop.pojo.BookExample.Criteria;

@Service
public class BookMapperServer {
	@Autowired
	BookMapper bookMapper;

	public List<Book> selectBooksOneToNeight() {
		BookExample example = new BookExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdBetween(1, 8);
		List<Book> books = bookMapper.selectByExample(example);
		return books;
	}

	public Book selectById(Integer id) {
		return bookMapper.selectByPrimaryKey(id);
	}

	public int updateBookNum(Book book) {
		return bookMapper.updateByPrimaryKeySelective(book);
	}

	public List<Book> seleceBooksWithAutorOrBookname(String authorOrBookname) {
		BookExample example = new BookExample();
		Criteria criteria = example.createCriteria();
		criteria.andAuthorLike("%" + authorOrBookname + "%");
		BookExample example2 = new BookExample();
		Criteria criteria2 = example2.createCriteria();
		criteria2.andBooknameLike("%" + authorOrBookname + "%");
		example.or(criteria2);
		return bookMapper.selectByExample(example);
	}

	public List<Book> selectBooksByCategory(String category) {
		BookExample example = new BookExample();
		Criteria criteria = example.createCriteria();
		criteria.andCategoryEqualTo(category);
		return bookMapper.selectByExample(example);
	}

}
