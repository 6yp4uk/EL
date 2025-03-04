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
            double d = Float.valueOf(a) /Float.valueOf(b);
            Map<String,Integer> abc = new HashMap<String,Integer>();
            if (a != 0 && a % 5 == 0 ) abc.put("a", a);//System.out.print("a:" + a);
            if (b != 0 && b % 5 == 0 ) abc.put("b", b);//System.out.print("b:" + b);
            if (c != 0 && c % 5 == 0 ) abc.put("c", c);//System.out.print("c:" + c);
            String string_abc = abc.toString().replace("{","").replace("}","");
            System.out.println(string_abc);
            //for(Map.Entry<String, Integer> items : abc.entrySet()){
               //System.out.printf("%s:%s, ", items.getKey(),items.getValue());
                        //}
            if ((((a % 5 ) != 0) && ((b % 5) !=0) && ((c % 5) !=0)) ||
                    (a == 0 && b == 0 && c == 0)) System.out.println("нет значений, кратных 5");
            System.out.println("Результат целочисленного деления a на b: " + a / b);
            System.out.println("Результат деления a на b: " + d );
            System.out.println("Результат деления a на b с округлением в большую сторону: " + String.format("%.0f", Math.ceil(d)));
            System.out.println("Результат деления a на b с округлением в меньшую сторону: "  + String.format("%.0f", Math.floor(d)));
            System.out.println("Результат деления a на b с математическим округлением: " + Math.round(d));
            System.out.println("Остаток от деления b на c: " + (b % c));
            System.out.println("Наименьшее значение из a и b: " + Math.min(a,b));
            System.out.println("Наибольшее значение из b и c: "+ Math.max(b,c));

        }
}