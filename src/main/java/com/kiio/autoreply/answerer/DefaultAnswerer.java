package com.kiio.autoreply.answerer;

/**
 * 默认回答方式
 * @author kiio
 */
public class DefaultAnswerer implements Answerer {

    @Override
    public String doAnswer(String prompt) {
        return "很抱歉，我暂时还不能理解你的问题：" + prompt;
    }
}
