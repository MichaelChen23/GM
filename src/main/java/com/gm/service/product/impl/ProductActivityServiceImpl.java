package com.gm.service.product.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.gm.dao.product.IProductActivityDao;
import com.gm.entity.product.ProductActivityDO;
import com.gm.service.product.IProductActivityService;

/**
 * 商品活动Service服务层接口实现
 * @author MC
 * @date 2017-6-7
 */
@Service
public class ProductActivityServiceImpl extends ServiceImpl<IProductActivityDao, ProductActivityDO> implements IProductActivityService {

}
