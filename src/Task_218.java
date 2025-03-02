import java.util.Scanner;
public class Task_218 {
    public static void main (String[] args){
        System.out.println("Как тебя зовут?");
        System.out.print("Введи свое имя: ");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println("Привет, " + name + "!");

    }

}
