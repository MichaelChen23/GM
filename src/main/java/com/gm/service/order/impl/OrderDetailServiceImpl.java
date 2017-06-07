package com.gm.service.order.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.gm.dao.order.IOrderDetailDao;
import com.gm.entity.order.OrderDetailDO;
import com.gm.service.order.IOrderDetailService;

/**
 * 订单明细Service服务层接口实现
 * @author MC
 * @date 2017-6-7
 */
@Service
public class OrderDetailServiceImpl extends ServiceImpl<IOrderDetailDao, OrderDetailDO> implements IOrderDetailService {

}
