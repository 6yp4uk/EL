import java.util.Scanner;
public class Task_221_41 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        String main_string = in.nextLine();
        System.out.println("Введите подстроку");
        String sub_string = in.nextLine();
        int i = 0;
        int index = 0;
        while ((index = main_string.indexOf(sub_string,index)) != -1) {
            i++;
            index += sub_string.length();
            }
        System.out.printf(" Подстрока '%s' встречается %d раза", sub_string,i);
    }
}


