import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Task_219 {
        public static void main (String[] args){
            System.out.println("Введите 3 числа");
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            Map<String,Integer> abc = new HashMap<String,Integer>();
            if (a != 0 && a % 5 == 0 ) abc.put("a", a);//System.out.print("a:" + a);
            if (b != 0 && b % 5 == 0 ) abc.put("b", b);//System.out.print("b:" + b);
            if (c != 0 && c % 5 == 0 ) abc.put("c", c);//System.out.print("c:" + c);
            String string_abc = abc.toString().replace("{","").replace("}","");
            System.out.print(string_abc);
            //for(Map.Entry<String, Integer> items : abc.entrySet()){
               //System.out.printf("%s:%s, ", items.getKey(),items.getValue());
                        //}
            if ((((a % 5 ) != 0) && ((b % 5) !=0) && ((c % 5) !=0)) ||
                    (a == 0 && b == 0 && c == 0)) System.out.println("нет значений, кратных 5");
           // if (a == 0 && b == 0 && c == 0) System.out.println("!!!!!");

        }
}