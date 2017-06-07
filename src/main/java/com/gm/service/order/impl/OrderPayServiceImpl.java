package com.gm.service.order.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.gm.dao.order.IOrderPayDao;
import com.gm.entity.order.OrderPayDO;
import com.gm.service.order.IOrderPayService;

/**
 * 支付记录Service服务层接口实现
 * @author MC
 * @date 2017-6-7
 */
@Service
public class OrderPayServiceImpl extends ServiceImpl<IOrderPayDao, OrderPayDO> implements IOrderPayService {

}
