package com.gm.service.product.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.gm.dao.product.IProductCommentDao;
import com.gm.entity.product.ProductCommentDO;
import com.gm.service.product.IProductCommentService;

/**
 * 商品评论Service服务层接口实现
 * @author MC
 * @date 2017-6-7
 */
@Service
public class ProductCommentServiceImpl extends ServiceImpl<IProductCommentDao, ProductCommentDO> implements IProductCommentService {

}
