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
import com.gm.entity.UserDO;
import com.gm.service.IUserService;

/**
 * 用户Controller控制层
 * @author MC
 * @date 2017-5-19
 */
@Controller
@RequestMapping("/user")
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private IUserService userService;
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@ResponseBody
	public BaseResponse<Boolean> saveUser(@RequestBody UserDO userDO){
		try {
			Boolean result = userService.insert(userDO);
			return new BaseResponse<>(Constant.SUCCESS_CODE, Constant.SUCCESS_MSG, result);
		} catch (Exception e) {
			logger.error(e.getMessage());
			return null;
		}
	}
	
	@RequestMapping(value = "/remove", method = RequestMethod.POST)
	@ResponseBody
	public BaseResponse<Boolean> removeUser(@RequestBody UserDO userDO) {
		try {
			Boolean result = userService.delete(new EntityWrapper<UserDO>(userDO));
			return new BaseResponse<>(Constant.SUCCESS_CODE, Constant.SUCCESS_MSG, result);
		} catch (Exception e) {
			logger.error(e.getMessage());
			return null;
		}
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	@ResponseBody
	public BaseResponse<Boolean> updateUser(@RequestBody UserDO userDO) {
		try {
			Boolean result = userService.updateById(userDO);
			return new BaseResponse<>(Constant.SUCCESS_CODE, Constant.SUCCESS_MSG, result);
		} catch (Exception e) {
			logger.error(e.getMessage());
			return null;
		}
	}
	
	@RequestMapping(value = "/get", method = RequestMethod.POST)
	@ResponseBody
	public BaseResponse<UserDO> getUser(@RequestBody UserDO userDO) {
		try {
			UserDO user = userService.selectOne(new EntityWrapper<UserDO>(userDO));
			return new BaseResponse<UserDO>(Constant.SUCCESS_CODE, Constant.SUCCESS_MSG, user);
		} catch (Exception e) {
			logger.error(e.getMessage());
			return null;
		}
	}
	
	@RequestMapping(value = "/pagelist", method = RequestMethod.POST)
	@ResponseBody
	public BaseResponse<Page<UserDO>> pageListUser(HttpServletRequest request, @RequestBody UserDO userDO) {
		String currentPage = request.getParameter("currentpage");
		String pageSize = request.getParameter("pagesize");
		try {
			Page<UserDO> userDOs = userService.selectPage(new Page<UserDO>(StringUtil.checkPageOrDefault(currentPage, Constant.DEFAULT_CURRENT_PAGE), 
					StringUtil.checkPageOrDefault(pageSize, Constant.DEFAULT_PAGE_SIZE)), new EntityWrapper<UserDO>(userDO));
			return new BaseResponse<>(Constant.SUCCESS_CODE, Constant.SUCCESS_MSG, userDOs);
		} catch (Exception e) {
			logger.error(e.getMessage());
			return null;
		}
	}
	
}
