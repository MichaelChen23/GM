package com.gm.controller.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baomidou.mybatisplus.service.IService;
import com.gm.common.BaseController;
import com.gm.entity.product.ProductDO;

/**
 * 商品Controller控制层
 * @author MC
 * @date 2017-6-7
 */
@Controller
@RequestMapping("/product")
public class ProductController extends BaseController<IService<ProductDO>, ProductDO> {
	
}
