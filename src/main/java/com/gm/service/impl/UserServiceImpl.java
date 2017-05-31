package com.gm.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.gm.dao.IUserDao;
import com.gm.entity.UserDO;
import com.gm.service.IUserService;

@Service
public class UserServiceImpl extends ServiceImpl<IUserDao, UserDO> implements IUserService {

}
