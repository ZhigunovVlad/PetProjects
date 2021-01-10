import java.util.ArrayList;
import java.util.Scanner;
public class ToDo {
    private String thingToDo;
    private boolean status;
    private String dateToBeDone;
    ArrayList<ToDo> list = new ArrayList<>();

    ToDo(){
    }
    ToDo(String thingToDo,String dateToBeDone){
        this.thingToDo=thingToDo;
        this.dateToBeDone=dateToBeDone;
        this.status=false;
    }
    public void Show(){
        for (ToDo toDo : list) {
            System.out.println("----------------------\n"+
                    toDo+"\n----------------------");

        }
    }
    public void addThingToDo(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input thing to do : ");
        String thing=scanner.nextLine();
        System.out.println("Input date : ");
        String date=scanner.nextLine();
        list.add(new ToDo(thing,date));
    }


    public String getThingToDo(){
        return this.thingToDo;
    }

    public void setStatus() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input thing to do where " +
                "you want to change status : ");
        String thingToDo=scanner.next();
        for (ToDo toDo : list) {
            if (toDo.getThingToDo().equals(thingToDo)) {
                toDo.setStatusTrue();
                break;
            }
        }

    }
    private void setStatusTrue(){
        this.status=true;
    }
    public boolean getStatus(){
        return this.status;
    }
    public void getCompletedThings(){
        for(ToDo todo : list){
            if (todo.getStatus()) {
                System.out.println(todo);
            }
        }
    }
    @Override
    public String toString(){
        return "Задача : "+this.thingToDo+"\nДата выполнения : "+this.dateToBeDone+"\nСтатус выполнения : "+this.status;
    }
}
