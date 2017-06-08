package com.gm.service.custom.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.gm.dao.custom.ICustomDao;
import com.gm.entity.custom.CustomDO;
import com.gm.service.custom.ICustomService;

/**
 * 客户Service服务层接口实现
 * @author MC
 * @date 2017-5-18
 */
@Service
public class CustomServiceImpl extends ServiceImpl<ICustomDao, CustomDO> implements ICustomService {

}
