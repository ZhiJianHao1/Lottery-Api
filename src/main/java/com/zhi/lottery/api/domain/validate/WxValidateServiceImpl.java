package com.zhi.lottery.api.domain.validate;

import com.zhi.lottery.api.application.IWxValidateService;
import com.zhi.lottery.api.infrastructure.utils.sdk.SignatureUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author：zhijianhao
 * @date: 2024/2/7
 */
@Service
public class WxValidateServiceImpl implements IWxValidateService {

    @Value("${wx.config.token}")
    private String token;

    @Override
    public boolean checkSign(String signature, String timestamp, String nonce) {
        return SignatureUtil.check(token, signature, timestamp, nonce);
    }
}
