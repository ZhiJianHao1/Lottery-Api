package com.zhi.lottery.api.domain.receive.service.engine.impl;

import com.zhi.lottery.api.domain.receive.model.BehaviorMatter;
import com.zhi.lottery.api.domain.receive.model.MessageTextEntity;
import com.zhi.lottery.api.domain.receive.service.engine.EngineBase;
import com.zhi.lottery.api.domain.receive.service.logic.LogicFilter;
import com.zhi.lottery.api.infrastructure.utils.XmlUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @description: 消息处理
 * @author：zhijianhao
 * @date: 2024/2/7
 */
@Service("msgEngineHandle")
public class MsgEngineHandle extends EngineBase {

    @Value("${wx.config.originalid:gh_48d07e7d6c5e}")
    private String originalId;

    @Override
    public String process(BehaviorMatter request) throws Exception {
        LogicFilter router = super.router(request);
        if (null == router) {
            return null;
        }
        String resultStr = router.filter(request);
        if (StringUtils.isBlank(resultStr)) {
            return "";
        }

        MessageTextEntity res = new MessageTextEntity();
        res.setToUserName(request.getOpenId());
        res.setFromUserName(originalId);
        res.setCreateTime(String.valueOf(System.currentTimeMillis() / 10000L));
        res.setMsgType("text");
        res.setContent(resultStr);
        return XmlUtil.beanToXml(res);
    }
}
