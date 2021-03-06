package com.gm.controller.order;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baomidou.mybatisplus.service.IService;
import com.gm.common.BaseController;
import com.gm.entity.order.OrderDO;

/**
 * 订单Controller控制层
 * @author MC
 * @date 2017-6-7
 */
@Controller
@RequestMapping("/order")
public class OrderController extends BaseController<IService<OrderDO>, OrderDO> {
	
}
