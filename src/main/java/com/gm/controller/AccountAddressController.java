package com.gm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baomidou.mybatisplus.service.IService;
import com.gm.common.BaseController;
import com.gm.entity.AccountAddressDO;

/**
 * 客户地址Controller控制层
 * @author MC
 * @date 2017-6-6
 */
@Controller
@RequestMapping("/account-address")
public class AccountAddressController extends BaseController<IService<AccountAddressDO>, AccountAddressDO> {
	
}
