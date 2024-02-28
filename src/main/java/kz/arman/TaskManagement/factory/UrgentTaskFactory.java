package kz.arman.TaskManagement.factory;

import kz.arman.TaskManagement.domain.Task;
import kz.arman.TaskManagement.domain.UrgentTask;
import org.springframework.stereotype.Component;

@Component
public class UrgentTaskFactory implements TaskFactory{
    @Override
    public Task createTask() {
        return new UrgentTask();
    }
}
