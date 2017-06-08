package com.gm.controller.custom;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baomidou.mybatisplus.service.IService;
import com.gm.common.BaseController;
import com.gm.entity.custom.CustomDO;

/**
 * 客户Controller控制层
 * @author MC
 * @date 2017-5-18
 */
@Controller
@RequestMapping("/custom")
public class CustomController extends BaseController<IService<CustomDO>, CustomDO> {
	
}
