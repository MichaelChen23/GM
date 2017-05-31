package com.gm.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.gm.dao.IAccountDao;
import com.gm.entity.AccountDO;
import com.gm.service.IAccountService;

/**
 * �ͻ�Service�����ӿ�ʵ��
 * @author MC
 * @date 2017-5-18
 */
@Service
public class AccountServiceImpl extends ServiceImpl<IAccountDao, AccountDO> implements IAccountService {

}
