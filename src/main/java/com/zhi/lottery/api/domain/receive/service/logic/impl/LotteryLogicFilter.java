package com.zhi.lottery.api.domain.receive.service.logic.impl;

import com.zhi.lottery.api.domain.receive.model.BehaviorMatter;
import com.zhi.lottery.api.domain.receive.service.logic.LogicFilter;
import com.zhi.lottery.rpc.booth.ILotteryActivityBooth;
import com.zhi.lottery.rpc.booth.dto.AwardDTO;
import com.zhi.lottery.rpc.booth.req.DrawReq;
import com.zhi.lottery.rpc.booth.res.DrawRes;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * @description: 抽奖服务
 * @author：zhijianhao
 * @date: 2024/2/7
 */
@Service
public class LotteryLogicFilter implements LogicFilter {

    @DubboReference
    private ILotteryActivityBooth lotteryActivityBooth;

    @Override
    public String filter(BehaviorMatter request) {
        DrawReq drawReq = new DrawReq();
        drawReq.setuId(request.getOpenId().substring(1, 11));
        drawReq.setActivityId(100001L);

        DrawRes drawRes = lotteryActivityBooth.doDraw(drawReq);
        AwardDTO awardDTO = drawRes.getAwardDTO();

        if (!"0000".equals(drawRes.getCode())) {
            return "抽奖💐 提示：" + drawRes.getInfo();
        }

        return "恭喜💐 您已中奖：" + awardDTO.getAwardName() + " - Lottery 抽奖系统测试";
    }
}
