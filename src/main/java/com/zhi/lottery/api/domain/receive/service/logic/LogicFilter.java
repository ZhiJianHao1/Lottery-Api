package com.zhi.lottery.api.domain.receive.service.logic;

import com.zhi.lottery.api.domain.receive.model.BehaviorMatter;

/**
 * @description: 逻辑接口
 * @author：zhijianhao
 * @date: 2024/2/7
 */
public interface LogicFilter {

    String filter(BehaviorMatter request);
}
