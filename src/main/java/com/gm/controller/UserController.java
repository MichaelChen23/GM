package com.gm.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gm.entity.UserDO;
import com.gm.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private IUserService userService;

	@RequestMapping("/saveUser")
	public String saveUser(HttpServletRequest request, Model model) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		UserDO user = new UserDO();
		user.setUsername(username);
		user.setPassword(password);
		user.setCreateTime(new Date());
		user.setUserType(3);
		user.setIslock(0);
		boolean status = userService.insert(user);
		model.addAttribute("status", status);
		return "status";
	}
	
	@RequestMapping("/getUser")
	public String getUser(HttpServletRequest request, Model model) {
		long userId = Long.parseLong(request.getParameter("id"));
		UserDO user = userService.selectById(userId);
		model.addAttribute("user", user);
		return "getUser";
	}
	
	@RequestMapping("/removeUser")
	public String removeUser(HttpServletRequest request, Model model) {
		long userId = Long.parseLong(request.getParameter("id"));
		boolean status = userService.deleteById(userId);
		model.addAttribute("status", status);
		return "status";
	}
	
	
}
