// package com.mycompany.app;

// public class App {
//     public static void main(String[] args) {
//         System.out.println("Hello, World!");
//     }
// }
// // My first java application

// // Package declaration to group related classes together
// package com.mycompany.app;

// // Declaration of the public class named App
// public class App {
//     // Main method: the entry point of the Java application
//     public static void main(String[] args) {
//         // Print the text "Hello, World!" to the console
//         System.out.println("Hello, World!");
//     } // Closing brace for the main method
// } // Closing brace for the App class

package com.mycompany.app;

public class App {
    public static void main(String[] args) {
        Task task = new Task("Learn Java");
        System.out.println(task);
        task.markAsCompleted();
        System.out.println(task);
    }
}
