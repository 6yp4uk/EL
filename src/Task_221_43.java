import java.util.Scanner;
public class Task_221_43 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите дату в формате 'дд.мм.гггг'");
        String main_string = in.nextLine();
        //String main_string = "31.12.2020";
        String day = main_string.substring(0,2);
        String month = main_string.substring(3,5);
        String year = main_string.substring(6,10);
        System.out.printf("%s-%s-%s", year,month,day);
    }
}
