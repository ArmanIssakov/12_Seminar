package kz.arman.TaskManagement.service;

import kz.arman.TaskManagement.domain.Task;
import kz.arman.TaskManagement.factory.NormalTaskFactory;
import kz.arman.TaskManagement.factory.UrgentTaskFactory;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    private NormalTaskFactory normalTaskFactory;

    private UrgentTaskFactory urgentTaskFactory;

    public TaskService(NormalTaskFactory normalTaskFactory, UrgentTaskFactory urgentTaskFactory) {
        this.normalTaskFactory = normalTaskFactory;
        this.urgentTaskFactory = urgentTaskFactory;
    }

    public Task createNormalTask() {
         return normalTaskFactory.createTask();
    }

    public Task createUrgentTask() {
        return urgentTaskFactory.createTask();
    }
}
