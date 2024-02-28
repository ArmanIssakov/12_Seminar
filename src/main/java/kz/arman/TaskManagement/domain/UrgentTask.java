package kz.arman.TaskManagement.domain;

import lombok.Setter;


@Setter
public class UrgentTask implements Task{
    private int id;
    private String name;
    private String description;

    @Override
    public String showType() {
        return "Срочное задание";
    }

    public static class TaskBuilder {
        private final UrgentTask urgentTask = new UrgentTask();

        public TaskBuilder id(int id) {
            urgentTask.setId(id);
            return this;
        }

        public TaskBuilder name(String name) {
            urgentTask.setName(name);
            return this;
        }

        public TaskBuilder description(String description) {
            urgentTask.setDescription(description);
            return this;
        }
         public UrgentTask build() {
            return urgentTask;
         }
    }
}
