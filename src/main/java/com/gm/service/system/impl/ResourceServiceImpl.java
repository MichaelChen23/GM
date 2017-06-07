package com.gm.service.system.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.gm.dao.system.IResourceDao;
import com.gm.entity.system.ResourceDO;
import com.gm.service.system.IResourceService;

/**
 * 资源Service服务层接口实现
 * @author MC
 * @date 2017-6-8
 */
@Service
public class ResourceServiceImpl extends ServiceImpl<IResourceDao, ResourceDO> implements IResourceService {

}
