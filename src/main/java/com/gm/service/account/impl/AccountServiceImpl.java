package com.gm.service.account.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.gm.dao.account.IAccountDao;
import com.gm.entity.account.AccountDO;
import com.gm.service.account.IAccountService;

/**
 * 客户Service服务层接口实现
 * @author MC
 * @date 2017-5-18
 */
@Service
public class AccountServiceImpl extends ServiceImpl<IAccountDao, AccountDO> implements IAccountService {

}
