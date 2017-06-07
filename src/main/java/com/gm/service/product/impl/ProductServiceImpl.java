package com.gm.service.product.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.gm.dao.product.IProductDao;
import com.gm.entity.product.ProductDO;
import com.gm.service.product.IProductService;

/**
 * 商品Service服务层接口实现
 * @author MC
 * @date 2017-6-7
 */
@Service
public class ProductServiceImpl extends ServiceImpl<IProductDao, ProductDO> implements IProductService {

}
