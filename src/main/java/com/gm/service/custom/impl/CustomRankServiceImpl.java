package com.gm.service.custom.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.gm.dao.custom.ICustomRankDao;
import com.gm.entity.custom.CustomRankDO;
import com.gm.service.custom.ICustomRankService;

/**
 * 客户等级Service服务层接口实现
 * @author MC
 * @date 2017-6-6
 */
@Service
public class CustomRankServiceImpl extends ServiceImpl<ICustomRankDao, CustomRankDO> implements ICustomRankService {

}
