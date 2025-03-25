package Task4_9_12;
import java.util.Scanner;
public class Main {

    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число a с плавающей точкой");
        double a = in.nextDouble();
        System.out.println("Введите число a с плавающей точкой");
        double b = in.nextDouble();
        Calculator calculator = new Calculator(new Adder());
        System.out.print ( "Результат сложения a и b: " );
        calculator.calc(a,b);
        calculator = new Calculator(new Subtractor());
        System.out.print ( "Результат вычитания a и b: " );
        calculator.calc(a,b);
        calculator = new Calculator(new Multiplier());
        System.out.print ( "Результат умножения a и b: " );
        calculator.calc(a,b);
        calculator = new Calculator(new Divider());
        System.out.print ( "Результат деления a и b: " );
        calculator.calc(a,b);


    }
}
