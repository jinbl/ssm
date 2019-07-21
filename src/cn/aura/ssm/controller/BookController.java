package cn.aura.ssm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.aura.ssm.entity.Book;
import cn.aura.ssm.service.BookService;

@Controller
public class BookController {

	@Autowired
	BookService service;
	
	@RequestMapping("/queryAll.do")
	public String queryAll(int id,Model model, HttpServletRequest request,HttpSession session) {
		List<Book> books = service.findAll();
		model.addAttribute("books", books);
		model.addAttribute("id", id);
		System.out.println(session.getAttribute("user"));
		
		return "show";
	}
	
}
