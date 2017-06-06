package com.gm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baomidou.mybatisplus.service.IService;
import com.gm.common.BaseController;
import com.gm.entity.UserDO;

/**
 * 用户Controller控制层
 * @author MC
 * @date 2017-5-19
 */
@Controller
@RequestMapping("/user")
public class UserController extends BaseController<IService<UserDO>, UserDO> {
	
}
