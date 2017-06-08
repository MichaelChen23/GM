package com.gm.controller.custom;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baomidou.mybatisplus.service.IService;
import com.gm.common.BaseController;
import com.gm.entity.custom.CustomAddressDO;

/**
 * 客户地址Controller控制层
 * @author MC
 * @date 2017-6-6
 */
@Controller
@RequestMapping("/cust-address")
public class CustomAddressController extends BaseController<IService<CustomAddressDO>, CustomAddressDO> {
	
}
