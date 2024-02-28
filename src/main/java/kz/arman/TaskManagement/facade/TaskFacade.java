package kz.arman.TaskManagement.facade;

import kz.arman.TaskManagement.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TaskFacade {
    private TaskService taskService;

    public TaskFacade(TaskService taskService) {
        this.taskService = taskService;
    }

    public String createdNormalTask() {
        return taskService.createNormalTask().showType();
    }

    public String createdUrgentTask() {
        return taskService.createUrgentTask().showType();
    }
}
