package com.gm.controller.message;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baomidou.mybatisplus.service.IService;
import com.gm.common.BaseController;
import com.gm.entity.message.PrivateNoticeDO;

/**
 * 私人通知Controller控制层
 * @author MC
 * @date 2017-6-7
 */
@Controller
@RequestMapping("/pri-notice")
public class PrivateNoticeController extends BaseController<IService<PrivateNoticeDO>, PrivateNoticeDO> {
	
}
