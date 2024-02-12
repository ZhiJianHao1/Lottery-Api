package com.zhi.lottery.api.domain.lucky.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author：zhijianhao
 * @date: 2024/2/7
 */
public class Prize {
    private List<Strategy> fonts = new ArrayList<>();
    private String background;

    public Prize(Strategy fonts, String background) {
        this.fonts.add(fonts);
        this.background = background;
    }

    public Prize(List<Strategy> fonts, String background) {
        this.fonts = fonts;
        this.background = background;
    }

    public List<Strategy> getFonts() {
        return fonts;
    }

    public void setFonts(List<Strategy> fonts) {
        this.fonts = fonts;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }
}
