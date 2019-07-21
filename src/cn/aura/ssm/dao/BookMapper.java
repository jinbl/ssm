package cn.aura.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import cn.aura.ssm.entity.Book;

public interface BookMapper {

	@Select("select * from book")
	List<Book> findAll();
	
}
