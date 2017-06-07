package com.gm.controller.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baomidou.mybatisplus.service.IService;
import com.gm.common.BaseController;
import com.gm.entity.product.ProductActivityLinkDO;

/**
 * 商品活动关联Controller控制层
 * @author MC
 * @date 2017-6-7
 */
@Controller
@RequestMapping("/activ-link")
public class ProductActivityLinkController extends BaseController<IService<ProductActivityLinkDO>, ProductActivityLinkDO> {
	
}
