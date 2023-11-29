package views;

import models.Task;

import java.util.List;

public class TaskView {
    public void displayTasks(List<Task> tasks) {
        System.out.println("To-Do List:");
        //show index of task
        for (Task task : tasks) {
            System.out.println(tasks.indexOf(task) + " - " +task.getDescription() + " - " + (task.isCompleted() ? "Completed" : "Not Completed"));
        }
        System.out.println();
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}

