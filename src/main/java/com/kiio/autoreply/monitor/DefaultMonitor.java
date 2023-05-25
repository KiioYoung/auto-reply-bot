package com.kiio.autoreply.monitor;

import com.kiio.autoreply.answerer.Answerer;
import com.kiio.autoreply.model.TaskListItem;

/**
 * @author kiio
 */
public class DefaultMonitor extends Monitor {

    public DefaultMonitor(TaskListItem taskListItem) {
        super(taskListItem);
    }

    @Override
    public void onMonitor(Answerer answerer) {
        String mockMessage = "这是一条默认消息";
        System.out.println(answerer.doAnswer(mockMessage));
    }
}
