package com.kiio.autoreply.factory;

import com.kiio.autoreply.model.TaskListItem;
import com.kiio.autoreply.monitor.DefaultMonitor;
import com.kiio.autoreply.monitor.Monitor;

/**
 * 简单工厂模式，监控者工厂
 * @author kiio
 */
public class MonitorFactory {

    public static Monitor createMonitor(String monitor, TaskListItem taskListItem) {
        switch (monitor) {
            case "zsxq":
                return null;
            default:
                return new DefaultMonitor(taskListItem);
        }
    }
}
