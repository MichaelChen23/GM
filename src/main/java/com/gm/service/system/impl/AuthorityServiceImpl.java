package com.gm.service.system.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.gm.dao.system.IAuthorityDao;
import com.gm.entity.system.AuthorityDO;
import com.gm.service.system.IAuthorityService;

/**
 * 权限Service服务层接口实现
 * @author MC
 * @date 2017-6-8
 */
@Service
public class AuthorityServiceImpl extends ServiceImpl<IAuthorityDao, AuthorityDO> implements IAuthorityService {

}
