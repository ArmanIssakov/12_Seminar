package kz.arman.TaskManagement.factory;

import kz.arman.TaskManagement.domain.NormalTask;
import kz.arman.TaskManagement.domain.Task;
import org.springframework.stereotype.Component;

@Component
public class NormalTaskFactory implements TaskFactory{
    @Override
    public Task createTask() {
        return new NormalTask();
    }
}
