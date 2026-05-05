package org.example;
import java.util.*;
class Task{
    int id;
    String task;
    boolean isCompleted;
    Task(int id,String task) {
        this.id = id;
        this.task = task;
        this.isCompleted = false;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Task> tasks = new ArrayList<>();
        int idCounter = 1;
        while (true) {
            System.out.println("----- TO-DO LIST APPLICATION -----");
            System.out.println(" 1. Add Task \n 2. View Tasks \n 3. Delete Task \n 4. Mark Task as Complete \n 5. Exit");
            int choice = scn.nextInt();
            switch (choice) {
                case 1:
                    scn.nextLine();
                    System.out.println("Enter task name: ");
                    String task_name_add = scn.nextLine();
                    boolean isCompleted = false;
                    Task t1 = new Task(idCounter++, task_name_add);
                    tasks.add(t1);
                    System.out.println("Task added successfully");
                    break;
                case 2:
                    System.out.println("----- Tasks -----");
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available");
                        break;
                    }
                    for (Task t : tasks) {
                        System.out.println(t.id + ". " + t.task + " [" +
                                (t.isCompleted ? "Completed" : "Pending") + "]");
                    }
                    break;
                case 3:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available");
                        break;
                    }
                    for (Task t : tasks) {
                        System.out.println(t.id + ". " + t.task + " [" +
                                (t.isCompleted ? "Completed" : "Pending") + "]");
                    }
                    System.out.println("Enter task ID to delete: ");
                    int del_id = scn.nextInt();
                    boolean deleted = false;
                    Iterator<Task> it = tasks.iterator();
                    while (it.hasNext()) {
                        Task t = it.next();
                        if (t.id == del_id) {
                            it.remove();
                            deleted = true;
                            System.out.println("Task deleted successfully");
                            break;
                        }
                    }
                    if(!deleted){
                        System.out.println("Invalid Task");
                    }
                    break;
                case 4:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available");
                        break;
                    }
                    for (Task t : tasks) {
                        System.out.println(t.id + ". " + t.task + " [" +
                                (t.isCompleted ? "Completed" : "Pending") + "]");
                    }
                    System.out.println("Enter task ID to mark complete/pending: ");
                    int id = scn.nextInt();
                    boolean found = false;
                    for (Task search : tasks) {
                        if (search.id == id) {
                            search.isCompleted = !search.isCompleted;
                            found = true;
                            System.out.println(" Marked "+id+" as Completed ");
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Invalid Task ID");
                    }
                    break;
                case 5:
                    System.out.println("Exiting..........");   
                    return; 
                default:
                    System.out.println("Enter valid choice");
            }
        }
    }
}