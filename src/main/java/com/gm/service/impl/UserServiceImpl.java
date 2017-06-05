package com.gm.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.gm.dao.IUserDao;
import com.gm.entity.UserDO;
import com.gm.service.IUserService;

/**
 * 用户Service服务层接口实现
 * @author MC
 * @date 2017-5-19
 */
@Service
public class UserServiceImpl extends ServiceImpl<IUserDao, UserDO> implements IUserService {

}
