package com.gm.service.order.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.gm.dao.order.IOrderDeliveryDao;
import com.gm.entity.order.OrderDeliveryDO;
import com.gm.service.order.IOrderDeliveryService;

/**
 * 订单配送Service服务层接口实现
 * @author MC
 * @date 2017-6-7
 */
@Service
public class OrderDeliveryServiceImpl extends ServiceImpl<IOrderDeliveryDao, OrderDeliveryDO> implements IOrderDeliveryService {

}
