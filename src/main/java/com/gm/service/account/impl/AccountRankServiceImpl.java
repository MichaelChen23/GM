package com.gm.service.account.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.gm.dao.account.IAccountRankDao;
import com.gm.entity.account.AccountRankDO;
import com.gm.service.account.IAccountRankService;

/**
 * 客户等级Service服务层接口实现
 * @author MC
 * @date 2017-6-6
 */
@Service
public class AccountRankServiceImpl extends ServiceImpl<IAccountRankDao, AccountRankDO> implements IAccountRankService {

}
