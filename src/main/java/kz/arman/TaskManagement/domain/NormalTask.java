package kz.arman.TaskManagement.domain;

import lombok.Setter;

@Setter
public class NormalTask implements Task{

    private int id;
    private String name;
    private String description;
    @Override
    public String showType() {
        return "Обычное задание";
    }

    public static class TaskBuilder {
        private final NormalTask normalTask = new NormalTask();

        public TaskBuilder id(int id) {
            normalTask.setId(id);
            return this;
        }

        public TaskBuilder name(String name) {
            normalTask.setName(name);
            return this;
        }

        public TaskBuilder description(String description) {
            normalTask.setDescription(description);
            return this;
        }
        public NormalTask build() {
            return normalTask;
        }
    }
}
