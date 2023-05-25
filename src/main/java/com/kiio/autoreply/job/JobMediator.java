package com.kiio.autoreply.job;

import com.kiio.autoreply.answerer.Answerer;
import com.kiio.autoreply.factory.AnswererFactory;
import com.kiio.autoreply.factory.MonitorFactory;
import com.kiio.autoreply.model.TaskListItem;
import com.kiio.autoreply.monitor.Monitor;

/**
 * 任务中介（负责协调监控者和回答者，把参数传给他们）
 * @author kiio
 */
public class JobMediator implements Runnable {

    private final TaskListItem taskListItem;

    public JobMediator(TaskListItem taskListItem) {
        this.taskListItem = taskListItem;
    }

    @Override
    public void run() {
        // 根据配置选择 monitor 和 answerer
        Monitor monitor = MonitorFactory.createMonitor(taskListItem.getMonitor(), taskListItem);
        Answerer answerer = AnswererFactory.createAnswerer(taskListItem.getAnswerer());
        // 监控并回答
        monitor.onMonitor(answerer);
    }
}
