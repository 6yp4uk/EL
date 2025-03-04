import java.util.*;
import java.text.*;
import java.util.Scanner;
public class Task_221_44 {
    public static void main(String args[]) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите дату в формате 'дд.мм.гггг'");
        String main_string = in.nextLine();
        {
            System.out.println(new SimpleDateFormat("yyyy-MM-dd")
                    .format(new SimpleDateFormat("dd.MM.yyyy").parse(main_string)));
        }
    }
}