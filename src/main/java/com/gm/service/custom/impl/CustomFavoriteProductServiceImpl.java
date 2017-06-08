package com.gm.service.custom.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.gm.dao.custom.ICustomFavoriteProductDao;
import com.gm.entity.custom.CustomFavoriteProductDO;
import com.gm.service.custom.ICustomFavoriteProductService;

/**
 * 客户商品收藏Service服务层接口实现
 * @author MC
 * @date 2017-6-6
 */
@Service
public class CustomFavoriteProductServiceImpl extends ServiceImpl<ICustomFavoriteProductDao, CustomFavoriteProductDO> implements ICustomFavoriteProductService {

}
