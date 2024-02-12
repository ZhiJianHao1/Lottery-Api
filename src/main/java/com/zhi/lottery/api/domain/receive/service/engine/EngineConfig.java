package com.zhi.lottery.api.domain.receive.service.engine;

import com.zhi.lottery.api.domain.receive.service.logic.LogicFilter;
import com.zhi.lottery.api.domain.receive.service.logic.impl.SubscribeFilter;
import com.zhi.lottery.api.domain.receive.service.logic.impl.UnsubscribeFilter;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @description: 消息配置
 * @author：zhijianhao
 * @date: 2024/2/7
 */
public class EngineConfig {
    @Resource
    private LogicFilter lotteryLogicFilter;

    @Resource
    private SubscribeFilter subscribeFilter;

    @Resource
    private UnsubscribeFilter unsubscribeFilter;

    protected static Map<String, Map<String, LogicFilter>> logicFilterMap = new HashMap<>();

    @PostConstruct
    public void init() {

        logicFilterMap.put("text", new HashMap<String, LogicFilter>() {{
            put("lottery", lotteryLogicFilter);
        }});

        logicFilterMap.put("event", new HashMap<String, LogicFilter>() {
            {
                put("subscribe", subscribeFilter);
                put("unsubscribe", unsubscribeFilter);
            }
        });
    }
}
