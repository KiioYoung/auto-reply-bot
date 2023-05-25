package com.kiio.autoreply.factory;

import com.kiio.autoreply.answerer.Answerer;
import com.kiio.autoreply.answerer.DefaultAnswerer;

/**
 * 简单工厂模式，回答者工厂
 * @author kiio
 */
public class AnswererFactory {

    /**
     * 创建回答者
     *
     * @param answerer
     * @return
     */
    public static Answerer createAnswerer(String answerer) {
        switch (answerer) {
            case "openai":
                return null;
            default:
                return new DefaultAnswerer();
        }
    }
}
