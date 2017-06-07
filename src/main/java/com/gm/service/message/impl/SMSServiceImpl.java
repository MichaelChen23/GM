package com.gm.service.message.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.gm.dao.message.ISMSDao;
import com.gm.entity.message.SMSDO;
import com.gm.service.message.ISMSService;

/**
 * 短信Service服务层接口实现
 * @author MC
 * @date 2017-6-7
 */
@Service
public class SMSServiceImpl extends ServiceImpl<ISMSDao, SMSDO> implements ISMSService {

}
