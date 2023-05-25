package com.kiio.autoreply.answerer;

/**
 * @author kiio
 */
public interface Answerer {

    /**
     * 回答
     * @param prompt 提示词
     * @return 回答结果
     */
    String doAnswer(String prompt);
}
