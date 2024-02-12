package com.zhi.lottery.api.application;

/**
 * @description: 验证
 * @author：zhijianhao
 * @date: 2024/2/7
 */
public interface IWxValidateService {
    /**
     * 验签
     * @param signature 签名
     * @param timestamp 时间
     * @param nonce     当前
     * @return          结果
     */
    boolean checkSign(String signature, String timestamp, String nonce);
}
