package com.gm.service.system.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.gm.dao.system.IRoleDao;
import com.gm.entity.system.RoleDO;
import com.gm.service.system.IRoleService;

/**
 * 角色Service服务层接口实现
 * @author MC
 * @date 2017-6-8
 */
@Service
public class RoleServiceImpl extends ServiceImpl<IRoleDao, RoleDO> implements IRoleService {

}
