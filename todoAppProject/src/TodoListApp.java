import java.util.Scanner;

public class TodoListApp {
    private static ToDoList toDoList = new ToDoList();

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add task");
            System.out.println("2. View tasks");
            System.out.println("3. Mark task as completed");
            System.out.println("4. Delete task");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("Enter task description:");
                    String description = scanner.nextLine();
                    toDoList.addTask(description);
                    break;
                case 2:
                    toDoList.viewTasks();
                    break;
                case 3:
                    System.out.println("Enter task number to mark as completed:");
                    int taskNumber = scanner.nextInt();
                    toDoList.markTaskAsCompleted(taskNumber);
                    break;
                case 4:
                    System.out.println("Enter task number to delete:");
                    int taskNumberToDelete = scanner.nextInt();
                    toDoList.deleteTask(taskNumberToDelete);
                    break;
                case 5:
                    System.out.println("Exiting the application.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
}
