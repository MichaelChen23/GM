package com.gm.controller.account;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baomidou.mybatisplus.service.IService;
import com.gm.common.BaseController;
import com.gm.entity.account.AccountFavoriteProductDO;

/**
 * 客户商品收藏Controller控制层
 * @author MC
 * @date 2017-6-6
 */
@Controller
@RequestMapping("/account-favor-prod")
public class AccountFavoriteProductController extends BaseController<IService<AccountFavoriteProductDO>, AccountFavoriteProductDO> {
	
}
