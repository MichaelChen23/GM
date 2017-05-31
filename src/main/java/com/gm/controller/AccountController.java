package com.gm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gm.entity.AccountDO;
import com.gm.service.IAccountService;

/**
 * ¿Í»§Controller¿ØÖÆ²ã
 * @author MC
 * @date 2017-5-18
 */
@Controller
@RequestMapping("/account")
public class AccountController {
	
	@Autowired
	private IAccountService accountService;
	
	@RequestMapping("/getAccount")
	public String getUser(HttpServletRequest request, Model model) {
		long accountId = Long.parseLong(request.getParameter("id"));
		AccountDO account = accountService.selectById(accountId);
		model.addAttribute("account", account);
		return "getAccount";
	}
}
