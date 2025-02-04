import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Choose an option");
        System.out.println("(1) add a task");
        System.out.println("(2) remove a task");
        System.out.println("(3) update a task");
        System.out.println("(4) list out tasks");
        System.out.println("(0) exit");

        ArrayList<String> tasks = new ArrayList<>();
        System.out.println(taskAdd());


    }

    static String userInput(){
        Scanner myIn = new Scanner(System.in);
        System.out.println("Enter");
        String userInp = myIn.nextLine();
        return userInp;
    }

    static void taskAdd(ArrayList<String> tasks){
        tasks.add(userInput());
        System.out.println(tasks);
    }

    static void taskRemove (ArrayList<String> tasks){
        System.out.println("Which task do you want to remove?");
        System.out.println(tasks);
        tasks.remove(userInput());

    }


