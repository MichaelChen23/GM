package com.gm.controller.order;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baomidou.mybatisplus.service.IService;
import com.gm.common.BaseController;
import com.gm.entity.order.OrderDetailDO;

/**
 * 订单明细Controller控制层
 * @author MC
 * @date 2017-6-7
 */
@Controller
@RequestMapping("/order-detail")
public class OrderDetailController extends BaseController<IService<OrderDetailDO>, OrderDetailDO> {
	
}
