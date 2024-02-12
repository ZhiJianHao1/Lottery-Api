package com.zhi.lottery.api.application;

import com.zhi.lottery.api.domain.receive.model.BehaviorMatter;

/**
 * @description: 处理接收信息
 * @author：zhijianhao
 * @date: 2024/2/7
 */
public interface IWxReceiveService {

    /**
     * 接收信息
     * @param behaviorMatter 入参
     * @return               出参
     * @throws Exception     异常
     */
    String doReceive(BehaviorMatter behaviorMatter) throws Exception;
}
