package com.gm.service.message.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.gm.dao.message.IAdvertDao;
import com.gm.entity.message.AdvertDO;
import com.gm.service.message.IAdvertService;

/**
 * 广告Service服务层接口实现
 * @author MC
 * @date 2017-6-7
 */
@Service
public class AdvertServiceImpl extends ServiceImpl<IAdvertDao, AdvertDO> implements IAdvertService {

}
