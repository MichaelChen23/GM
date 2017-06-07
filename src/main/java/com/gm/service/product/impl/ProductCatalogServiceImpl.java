package com.gm.service.product.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.gm.dao.product.IProductCatalogDao;
import com.gm.entity.product.ProductCatalogDO;
import com.gm.service.product.IProductCatalogService;

/**
 * 商品目录Service服务层接口实现
 * @author MC
 * @date 2017-6-7
 */
@Service
public class ProductCatalogServiceImpl extends ServiceImpl<IProductCatalogDao, ProductCatalogDO> implements IProductCatalogService {

}
