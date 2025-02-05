//Mariah Dungey 02/05/2025
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner myIn = new Scanner(System.in);
    static ArrayList<String> tasks = new ArrayList<>();
    public static void main(String[] args) {
        taskDisplay();

        Integer taskNum = myIn.nextInt();
        myIn.nextLine();
        while (taskNum != 0){
            switch (taskNum){
                case 1:
                    taskAdd(tasks);
                    break;
                case 2:
                    taskRemove(tasks);
                    break;
                case 3:
                    taskUpdate(tasks);
                    break;
                case 4:
                    taskList(tasks);
                    break;
            }

            taskDisplay();
            if (myIn.hasNextInt()) {
                taskNum = myIn.nextInt();
                myIn.nextLine();
            } else {
                System.out.println("Invalid input. Exiting.");
                break;
            }
        }
        System.out.println("You are exiting.");



    }

    static void taskDisplay(){
        System.out.println("Choose an option");
        System.out.println("(1) add a task");
        System.out.println("(2) remove a task");
        System.out.println("(3) update a task");
        System.out.println("(4) list out tasks");
        System.out.println("(0) exit");
    }


    static void taskAdd(ArrayList<String> tasks) {
        System.out.println("Add your task.");
        String userInp = myIn.nextLine();
        tasks.add(userInp);
        System.out.println("task added.");

    }

    static void taskRemove(ArrayList<String> tasks) {
        System.out.println("Which task do you want to remove?");
        taskList(tasks);
        int userInp = myIn.nextInt() - 1;
        myIn.nextLine();
        tasks.remove(userInp);
        System.out.println("Task removed.");
        taskList(tasks);

    }

    static void taskUpdate(ArrayList<String> tasks){
        for (int i = 0; i < tasks.size(); i++){
            System.out.println(tasks.get(i));
        }
        System.out.println("What task number do you want to update?");
        int taskIndex = myIn.nextInt() - 1;
        myIn.nextLine();
        System.out.println("What do you want to update it to?");
        String userInp = myIn.nextLine();
        tasks.set(taskIndex, userInp);
        System.out.println("Task updated.");
    }

    static void taskList(ArrayList<String> tasks){
        for (int i = 0; i < tasks.size(); i++){
            System.out.println(tasks.get(i));
        }
    }

}
