package com.kiio.autoreply.monitor;

import com.kiio.autoreply.answerer.Answerer;
import com.kiio.autoreply.model.TaskListItem;

/**
 * @author kiio
 */
public abstract class Monitor {

    TaskListItem taskListItem;

    Monitor(TaskListItem taskListItem) {
        this.taskListItem = taskListItem;
    }

    /**
     * 触发监控
     * @param answerer
     */
    public abstract void onMonitor(Answerer answerer);
}
