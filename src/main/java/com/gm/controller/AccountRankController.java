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
import com.gm.entity.AccountRankDO;
import com.gm.service.IAccountRankService;

/**
 * 客户等级Controller控制层
 * @author MC
 * @date 2017-6-6
 */
@Controller
@RequestMapping("/account-rank")
public class AccountRankController {
	
	private static final Logger logger = LoggerFactory.getLogger(AccountRankController.class);
	
	@Autowired
	private IAccountRankService accountRankService;
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@ResponseBody
	public BaseResponse<Boolean> saveAccountRank(@RequestBody AccountRankDO accountRankDO){
		try {
			Boolean result = accountRankService.insert(accountRankDO);
			return new BaseResponse<Boolean>(Constant.SUCCESS_CODE, Constant.SUCCESS_MSG, result);
		} catch (Exception e) {
			logger.error(e.getMessage());
			return null;
		}
	}
	
	@RequestMapping(value = "/remove", method = RequestMethod.POST)
	@ResponseBody
	public BaseResponse<Boolean> removeAccountRank(@RequestBody AccountRankDO accountRankDO) {
		try {
			Boolean result = accountRankService.delete(new EntityWrapper<AccountRankDO>(accountRankDO));
			return new BaseResponse<Boolean>(Constant.SUCCESS_CODE, Constant.SUCCESS_MSG, result);
		} catch (Exception e) {
			logger.error(e.getMessage());
			return null;
		}
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	@ResponseBody
	public BaseResponse<Boolean> updateAccountRank(@RequestBody AccountRankDO accountRankDO) {
		try {
			Boolean result = accountRankService.updateById(accountRankDO);
			return new BaseResponse<Boolean>(Constant.SUCCESS_CODE, Constant.SUCCESS_MSG, result);
		} catch (Exception e) {
			logger.error(e.getMessage());
			return null;
		}
	}
	
	@RequestMapping(value = "/get", method = RequestMethod.POST)
	@ResponseBody
	public BaseResponse<AccountRankDO> getAccountRank(@RequestBody AccountRankDO accountRankDO) {
		try {
			AccountRankDO accountRank = accountRankService.selectOne(new EntityWrapper<AccountRankDO>(accountRankDO));
			return new BaseResponse<AccountRankDO>(Constant.SUCCESS_CODE, Constant.SUCCESS_MSG, accountRank);
		} catch (Exception e) {
			logger.error(e.getMessage());
			return null;
		}
	}
	
	@RequestMapping(value = "/pagelist", method = RequestMethod.POST)
	@ResponseBody
	public BaseResponse<Page<AccountRankDO>> pageListAccount(HttpServletRequest request, @RequestBody AccountRankDO accountRankDO) {
		String currentPage = request.getParameter("currentpage");
		String pageSize = request.getParameter("pagesize");
		try {
			Page<AccountRankDO> accountRankDOs = accountRankService.selectPage(new Page<AccountRankDO>(StringUtil.checkPageOrDefault(currentPage, Constant.DEFAULT_CURRENT_PAGE), 
					StringUtil.checkPageOrDefault(pageSize, Constant.DEFAULT_PAGE_SIZE)), new EntityWrapper<AccountRankDO>(accountRankDO));
			return new BaseResponse<Page<AccountRankDO>>(Constant.SUCCESS_CODE, Constant.SUCCESS_MSG, accountRankDOs);
		} catch (Exception e) {
			logger.error(e.getMessage());
			return null;
		}
	}
}
