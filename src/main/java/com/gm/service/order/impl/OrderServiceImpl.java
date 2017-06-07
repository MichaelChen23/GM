package com.gm.service.order.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.gm.dao.order.IOrderDao;
import com.gm.entity.order.OrderDO;
import com.gm.service.order.IOrderService;

/**
 * 订单Service服务层接口实现
 * @author MC
 * @date 2017-6-7
 */
@Service
public class OrderServiceImpl extends ServiceImpl<IOrderDao, OrderDO> implements IOrderService {

}
