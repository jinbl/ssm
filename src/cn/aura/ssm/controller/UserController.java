package cn.aura.ssm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import cn.aura.ssm.entity.User;
import cn.aura.ssm.result.CodeMsg;
import cn.aura.ssm.service.UserService;

@Controller
public class UserController {
	
	@Autowired 
	UserService service;
	@Autowired
	HttpServletRequest request;
	
	@RequestMapping(value="/login.do",method = RequestMethod.POST)
	public String login(User user,Model model) {
		CodeMsg codeMsg = service.login(user);
		if(codeMsg.getCode() == 0) {//µÇÂ¼³É¹¦
			HttpSession session = request.getSession();
			User u=(User)codeMsg.getObj();
			session.setAttribute("u", u);
			return "forward:queryAll.do?id="+user.getUid();
		}else {
			model.addAttribute("msg", codeMsg.getMsg());
			return "login";
		}
	}

}
