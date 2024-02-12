package com.zhi.lottery.api.domain.receive.service;

import com.zhi.lottery.api.application.IWxReceiveService;
import com.zhi.lottery.api.domain.receive.model.BehaviorMatter;
import com.zhi.lottery.api.domain.receive.service.engine.Engine;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description: 处理接收信息
 * @author：zhijianhao
 * @date: 2024/2/7
 */
@Service
public class WxReceiveServiceImpl implements IWxReceiveService {

    @Resource(name = "msgEngineHandle")
    private Engine msgEngineHandle;

    @Override
    public String doReceive(BehaviorMatter behaviorMatter) throws Exception {
        return msgEngineHandle.process(behaviorMatter);
    }
}
