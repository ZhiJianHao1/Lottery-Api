package com.zhi.lottery.api.domain.receive.service.logic.impl;

import com.zhi.lottery.api.domain.receive.model.BehaviorMatter;
import com.zhi.lottery.api.domain.receive.service.logic.LogicFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @description: 取消关注微信公众号
 * @author：zhijianhao
 * @date: 2024/2/7
 */
@Service("unsubscribe")
public class UnsubscribeFilter implements LogicFilter {

    private Logger logger = LoggerFactory.getLogger(UnsubscribeFilter.class);

    @Override
    public String filter(BehaviorMatter request) {
        logger.info("用户{}已取消关注:", request.getOpenId());
        return null;
    }
}
