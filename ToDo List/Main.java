import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToDo toDoList=new ToDo();
        Scanner scanner=new Scanner(System.in);
        int choice=0;
    while(choice!=-1) {
        System.out.println("Menu : \n" +
                "[1]-Add action\n" +
                "[2]-Show list\n" +
                "[3]-Set status complete\n" +
                "[4]-Get completed things\n"+
                "[-1]-Finish\nYour choice : ");
        choice = scanner.nextInt();
        switch (choice) {
            case 1 -> toDoList.addThingToDo();
            case 2 -> toDoList.Show();
            case 3 -> toDoList.setStatus();
            case 4 -> toDoList.getCompletedThings();
            case -1 -> System.out.println("Done!");
            default -> System.out.println("Wrong input.Try again!");
        }

    }
    }
}
