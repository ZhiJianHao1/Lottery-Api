package com.zhi.lottery.api.domain.lucky.model;

/**
 * @description:
 * @author：zhijianhao
 * @date: 2024/2/7
 */
public class Strategy {
    private String text;
    private String top;

    public Strategy(String text, String top) {
        this.text = text;
        this.top = top;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = top;
    }
}
