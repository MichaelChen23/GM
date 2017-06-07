package com.gm.service.message.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.gm.dao.message.IPrivateNoticeDao;
import com.gm.entity.message.PrivateNoticeDO;
import com.gm.service.message.IPrivateNoticeService;

/**
 * 私人通知Service服务层接口实现
 * @author MC
 * @date 2017-6-7
 */
@Service
public class PrivateNoticeServiceImpl extends ServiceImpl<IPrivateNoticeDao, PrivateNoticeDO> implements IPrivateNoticeService {

}
