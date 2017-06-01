package com.gm.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.gm.common.BaseResponse;
import com.gm.common.Constant;
import com.gm.common.StringUtil;
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
	
	private static final Logger logger = LoggerFactory.getLogger(AccountController.class);
	
	@Autowired
	private IAccountService accountService;
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@ResponseBody
	public BaseResponse<Boolean> saveAccount(@RequestBody AccountDO accountDO){
		try {
			Boolean result = accountService.insert(accountDO);
			return new BaseResponse<>(Constant.SUCCESS_CODE, Constant.SUCCESS_MSG, result);
		} catch (Exception e) {
			logger.error(e.getMessage());
			return null;
		}
	}
	
	@RequestMapping(value = "/remove", method = RequestMethod.POST)
	@ResponseBody
	public BaseResponse<Boolean> removeAccount(@RequestBody AccountDO accountDO) {
		try {
			Boolean result = accountService.delete(new EntityWrapper<AccountDO>(accountDO));
			return new BaseResponse<>(Constant.SUCCESS_CODE, Constant.SUCCESS_MSG, result);
		} catch (Exception e) {
			logger.error(e.getMessage());
			return null;
		}
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	@ResponseBody
	public BaseResponse<Boolean> updateAccount(@RequestBody AccountDO accountDO) {
		try {
			Boolean result = accountService.updateById(accountDO);
			return new BaseResponse<>(Constant.SUCCESS_CODE, Constant.SUCCESS_MSG, result);
		} catch (Exception e) {
			logger.error(e.getMessage());
			return null;
		}
	}
	
	@RequestMapping(value = "/get", method = RequestMethod.POST)
	@ResponseBody
	public BaseResponse<AccountDO> getAccount(@RequestBody AccountDO accountDO) {
		try {
			AccountDO account = accountService.selectOne(new EntityWrapper<AccountDO>(accountDO));
			return new BaseResponse<AccountDO>(Constant.SUCCESS_CODE, Constant.SUCCESS_MSG, account);
		} catch (Exception e) {
			logger.error(e.getMessage());
			return null;
		}
	}
	
	@RequestMapping(value = "/pagelist", method = RequestMethod.POST)
	@ResponseBody
	public BaseResponse<Page<AccountDO>> pageListAccount(HttpServletRequest request, @RequestBody AccountDO accountDO) {
		String currentPage = request.getParameter("currentpage");
		String pageSize = request.getParameter("pagesize");
		try {
			Page<AccountDO> accountDOs = accountService.selectPage(new Page<AccountDO>(StringUtil.checkPageOrDefault(currentPage, Constant.DEFAULT_CURRENT_PAGE), 
					StringUtil.checkPageOrDefault(pageSize, Constant.DEFAULT_PAGE_SIZE)), new EntityWrapper<AccountDO>(accountDO));
			return new BaseResponse<>(Constant.SUCCESS_CODE, Constant.SUCCESS_MSG, accountDOs);
		} catch (Exception e) {
			logger.error(e.getMessage());
			return null;
		}
	}
}
