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
import com.gm.entity.AccountFavoriteProductDO;
import com.gm.service.IAccountFavoriteProductService;

/**
 * 客户商品收藏Controller控制层
 * @author MC
 * @date 2017-6-6
 */
@Controller
@RequestMapping("/account-favor-prod")
public class AccountFavoriteProductController {
	
	private static final Logger logger = LoggerFactory.getLogger(AccountFavoriteProductController.class);
	
	@Autowired
	private IAccountFavoriteProductService accountFavoriteProductService;
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@ResponseBody
	public BaseResponse<Boolean> saveAccountFavoriteProduct(@RequestBody AccountFavoriteProductDO accountFavoriteProductDO){
		try {
			Boolean result = accountFavoriteProductService.insert(accountFavoriteProductDO);
			return new BaseResponse<Boolean>(Constant.SUCCESS_CODE, Constant.SUCCESS_MSG, result);
		} catch (Exception e) {
			logger.error(e.getMessage());
			return null;
		}
	}
	
	@RequestMapping(value = "/remove", method = RequestMethod.POST)
	@ResponseBody
	public BaseResponse<Boolean> removeAccountFavoriteProduct(@RequestBody AccountFavoriteProductDO accountFavoriteProductDO) {
		try {
			Boolean result = accountFavoriteProductService.delete(new EntityWrapper<AccountFavoriteProductDO>(accountFavoriteProductDO));
			return new BaseResponse<Boolean>(Constant.SUCCESS_CODE, Constant.SUCCESS_MSG, result);
		} catch (Exception e) {
			logger.error(e.getMessage());
			return null;
		}
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	@ResponseBody
	public BaseResponse<Boolean> updateAccountFavoriteProduct(@RequestBody AccountFavoriteProductDO accountFavoriteProductDO) {
		try {
			Boolean result = accountFavoriteProductService.updateById(accountFavoriteProductDO);
			return new BaseResponse<Boolean>(Constant.SUCCESS_CODE, Constant.SUCCESS_MSG, result);
		} catch (Exception e) {
			logger.error(e.getMessage());
			return null;
		}
	}
	
	@RequestMapping(value = "/get", method = RequestMethod.POST)
	@ResponseBody
	public BaseResponse<AccountFavoriteProductDO> getAccountFavoriteProduct(@RequestBody AccountFavoriteProductDO accountFavoriteProductDO) {
		try {
			AccountFavoriteProductDO accountFavoriteProduct = accountFavoriteProductService.selectOne(new EntityWrapper<AccountFavoriteProductDO>(accountFavoriteProductDO));
			return new BaseResponse<AccountFavoriteProductDO>(Constant.SUCCESS_CODE, Constant.SUCCESS_MSG, accountFavoriteProduct);
		} catch (Exception e) {
			logger.error(e.getMessage());
			return null;
		}
	}
	
	@RequestMapping(value = "/pagelist", method = RequestMethod.POST)
	@ResponseBody
	public BaseResponse<Page<AccountFavoriteProductDO>> pageListAccount(HttpServletRequest request, @RequestBody AccountFavoriteProductDO accountFavoriteProductDO) {
		String currentPage = request.getParameter("currentpage");
		String pageSize = request.getParameter("pagesize");
		try {
			Page<AccountFavoriteProductDO> accountFavoriteProductDOs = accountFavoriteProductService.selectPage(new Page<AccountFavoriteProductDO>(StringUtil.checkPageOrDefault(currentPage, Constant.DEFAULT_CURRENT_PAGE), 
					StringUtil.checkPageOrDefault(pageSize, Constant.DEFAULT_PAGE_SIZE)), new EntityWrapper<AccountFavoriteProductDO>(accountFavoriteProductDO));
			return new BaseResponse<Page<AccountFavoriteProductDO>>(Constant.SUCCESS_CODE, Constant.SUCCESS_MSG, accountFavoriteProductDOs);
		} catch (Exception e) {
			logger.error(e.getMessage());
			return null;
		}
	}
}
