package cn.aura.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.aura.ssm.dao.BookMapper;
import cn.aura.ssm.entity.Book;
import cn.aura.ssm.service.BookService;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	BookMapper mapper;
	
	@Override
	public List<Book> findAll() {
		return mapper.findAll();
	}

	
}
