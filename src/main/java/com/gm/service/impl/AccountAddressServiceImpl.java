package com.gm.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.gm.dao.IAccountAddressDao;
import com.gm.entity.AccountAddressDO;
import com.gm.service.IAccountAddressService;

/**
 * 客户地址Service服务层接口实现
 * @author MC
 * @date 2017-6-6
 */
@Service
public class AccountAddressServiceImpl extends ServiceImpl<IAccountAddressDao, AccountAddressDO> implements IAccountAddressService {

}
