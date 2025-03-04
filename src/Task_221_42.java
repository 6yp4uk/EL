import java.util.Scanner;
public class Task_221_42 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        String main_string = in.nextLine();
        String repl_main_string= main_string.replace("бяка","вырезано цензурой").replace("кака","вырезано цензурой");
        System.out.println(repl_main_string);

    }
}
