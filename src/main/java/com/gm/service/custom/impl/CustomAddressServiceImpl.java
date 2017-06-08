package com.gm.service.custom.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.gm.dao.custom.ICustomAddressDao;
import com.gm.entity.custom.CustomAddressDO;
import com.gm.service.custom.ICustomAddressService;

/**
 * 客户地址Service服务层接口实现
 * @author MC
 * @date 2017-6-6
 */
@Service
public class CustomAddressServiceImpl extends ServiceImpl<ICustomAddressDao, CustomAddressDO> implements ICustomAddressService {

}
