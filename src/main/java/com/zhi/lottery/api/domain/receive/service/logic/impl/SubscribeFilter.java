package com.zhi.lottery.api.domain.receive.service.logic.impl;

import com.zhi.lottery.api.domain.receive.model.BehaviorMatter;
import com.zhi.lottery.api.domain.receive.service.logic.LogicFilter;
import org.springframework.stereotype.Service;

/**
 * @description: 关注微信公众号
 * @author：zhijianhao
 * @date: 2024/2/7
 */
@Service("subscribe")
public class SubscribeFilter implements LogicFilter {
    @Override
    public String filter(BehaviorMatter request) {
        return "感谢关注，快来回复抽奖，参与活动吧！";
    }
}
