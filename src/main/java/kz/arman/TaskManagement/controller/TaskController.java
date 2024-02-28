package kz.arman.TaskManagement.controller;

import kz.arman.TaskManagement.facade.TaskFacade;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private TaskFacade taskFacade;

    public TaskController(TaskFacade taskFacade) {
        this.taskFacade = taskFacade;
    }

    @GetMapping
    public String homePage() {
        return "Главная страница";
    }

    @GetMapping("/normal")
    public String normalPage() {
        return taskFacade.createdNormalTask();
    }

    @GetMapping("/urgent")
    public String urgentPage() {
        return taskFacade.createdUrgentTask();
    }

}
