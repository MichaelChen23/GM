package com.gm.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.gm.dao.IAccountFavoriteProductDao;
import com.gm.entity.AccountFavoriteProductDO;
import com.gm.service.IAccountFavoriteProductService;

/**
 * 客户商品收藏Service服务层接口实现
 * @author MC
 * @date 2017-6-6
 */
@Service
public class AccountFavoriteProductServiceImpl extends ServiceImpl<IAccountFavoriteProductDao, AccountFavoriteProductDO> implements IAccountFavoriteProductService {

}
