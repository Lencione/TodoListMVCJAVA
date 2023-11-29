package views;
import controllers.TaskController;
import java.util.Scanner;

public class Menu {
    public void showMenu(){
        TaskView taskView = new TaskView();
        TaskController taskController = new TaskController(taskView);

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===== ToDo List Menu =====");
            System.out.println("1. Add Task");
            System.out.println("2. Display Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            System.out.println("===================\n\n");

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    taskController.addTask(description);
                    System.out.println("===================\n\n");
                    break;

                case 2:
                    taskController.displayTasks();
                    System.out.println("===================\n\n");
                    break;

                case 3:
                    System.out.print("Enter task index to mark as completed: ");
                    int index = scanner.nextInt();
                    taskController.markTaskAsCompleted(index);
                    System.out.println("===================\n\n");
                    break;

                case 0:
                    System.out.println("Exiting ToDo List. Goodbye!");
                    System.out.println("===================\n\n");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    System.out.println("===================\n\n");
                    break;
            }

        } while (choice != 0);

        scanner.close();
    }
}
