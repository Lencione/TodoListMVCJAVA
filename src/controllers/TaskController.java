package controllers;
import models.Task;
import views.TaskView;

import java.util.ArrayList;
import java.util.List;

public class TaskController {
    private List<Task> taskList;
    private TaskView taskView;

    public TaskController(TaskView taskView) {
        this.taskList = new ArrayList<>();
        this.taskView = taskView;
    }

    public void addTask(String description) {
        Task newTask = new Task(description);
        taskList.add(newTask);
        taskView.displayMessage("Task added successfully!");
    }

    public void markTaskAsCompleted(int index) {
        if (index >= 0 && index < taskList.size()) {
            taskList.get(index).setCompleted(true);
            taskView.displayMessage("Task marked as completed!");
        } else {
            taskView.displayMessage("Invalid task index.");
        }
    }

    public void displayTasks() {
        taskView.displayTasks(taskList);
    }
}

