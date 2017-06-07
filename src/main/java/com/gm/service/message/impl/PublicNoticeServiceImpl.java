package com.gm.service.message.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.gm.dao.message.IPublicNoticeDao;
import com.gm.entity.message.PublicNoticeDO;
import com.gm.service.message.IPublicNoticeService;

/**
 * 公告Service服务层接口实现
 * @author MC
 * @date 2017-6-7
 */
@Service
public class PublicNoticeServiceImpl extends ServiceImpl<IPublicNoticeDao, PublicNoticeDO> implements IPublicNoticeService {

}
