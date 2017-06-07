package com.gm.service.message.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.gm.dao.message.INotifyTemplateDao;
import com.gm.entity.message.NotifyTemplateDO;
import com.gm.service.message.INotifyTemplateService;

/**
 * 通知内容模板Service服务层接口实现
 * @author MC
 * @date 2017-6-7
 */
@Service
public class NotifyTemplateServiceImpl extends ServiceImpl<INotifyTemplateDao, NotifyTemplateDO> implements INotifyTemplateService {

}
