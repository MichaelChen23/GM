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
import com.gm.entity.AccountAddressDO;
import com.gm.service.IAccountAddressService;

/**
 * 客户地址Controller控制层
 * @author MC
 * @date 2017-6-6
 */
@Controller
@RequestMapping("/account-address")
public class AccountAddressController {
	
	private static final Logger logger = LoggerFactory.getLogger(AccountAddressController.class);
	
	@Autowired
	private IAccountAddressService accountAddressService;
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@ResponseBody
	public BaseResponse<Boolean> saveAccountAddress(@RequestBody AccountAddressDO accountAddressDO){
		try {
			Boolean result = accountAddressService.insert(accountAddressDO);
			return new BaseResponse<Boolean>(Constant.SUCCESS_CODE, Constant.SUCCESS_MSG, result);
		} catch (Exception e) {
			logger.error(e.getMessage());
			return null;
		}
	}
	
	@RequestMapping(value = "/remove", method = RequestMethod.POST)
	@ResponseBody
	public BaseResponse<Boolean> removeAccountAddress(@RequestBody AccountAddressDO accountAddressDO) {
		try {
			Boolean result = accountAddressService.delete(new EntityWrapper<AccountAddressDO>(accountAddressDO));
			return new BaseResponse<Boolean>(Constant.SUCCESS_CODE, Constant.SUCCESS_MSG, result);
		} catch (Exception e) {
			logger.error(e.getMessage());
			return null;
		}
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	@ResponseBody
	public BaseResponse<Boolean> updateAccountAddress(@RequestBody AccountAddressDO accountAddressDO) {
		try {
			Boolean result = accountAddressService.updateById(accountAddressDO);
			return new BaseResponse<Boolean>(Constant.SUCCESS_CODE, Constant.SUCCESS_MSG, result);
		} catch (Exception e) {
			logger.error(e.getMessage());
			return null;
		}
	}
	
	@RequestMapping(value = "/get", method = RequestMethod.POST)
	@ResponseBody
	public BaseResponse<AccountAddressDO> getAccountAddress(@RequestBody AccountAddressDO accountAddressDO) {
		try {
			AccountAddressDO accountAddress = accountAddressService.selectOne(new EntityWrapper<AccountAddressDO>(accountAddressDO));
			return new BaseResponse<AccountAddressDO>(Constant.SUCCESS_CODE, Constant.SUCCESS_MSG, accountAddress);
		} catch (Exception e) {
			logger.error(e.getMessage());
			return null;
		}
	}
	
	@RequestMapping(value = "/pagelist", method = RequestMethod.POST)
	@ResponseBody
	public BaseResponse<Page<AccountAddressDO>> pageListAccount(HttpServletRequest request, @RequestBody AccountAddressDO accountAddressDO) {
		String currentPage = request.getParameter("currentpage");
		String pageSize = request.getParameter("pagesize");
		try {
			Page<AccountAddressDO> accountAddressDOs = accountAddressService.selectPage(new Page<AccountAddressDO>(StringUtil.checkPageOrDefault(currentPage, Constant.DEFAULT_CURRENT_PAGE), 
					StringUtil.checkPageOrDefault(pageSize, Constant.DEFAULT_PAGE_SIZE)), new EntityWrapper<AccountAddressDO>(accountAddressDO));
			return new BaseResponse<Page<AccountAddressDO>>(Constant.SUCCESS_CODE, Constant.SUCCESS_MSG, accountAddressDOs);
		} catch (Exception e) {
			logger.error(e.getMessage());
			return null;
		}
	}
}
