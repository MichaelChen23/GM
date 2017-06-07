package com.gm.controller.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baomidou.mybatisplus.service.IService;
import com.gm.common.BaseController;
import com.gm.entity.system.RoleDO;

/**
 * 角色Controller控制层
 * @author MC
 * @date 2017-6-8
 */
@Controller
@RequestMapping("/role")
public class RoleController extends BaseController<IService<RoleDO>, RoleDO> {
	
}
