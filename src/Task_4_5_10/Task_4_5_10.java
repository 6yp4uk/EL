package Task_4_5_10;

import java.util.Scanner;
import java.util.stream.IntStream;

class  ArithmeticProgressionSum {
    public static long getArithmeticProgressionSum(int a, int b) {
        int difference = Math.abs(a - b);
        return IntStream.range(0, difference)
                .map(i -> a < b ? a + i : a - i).asLongStream().sum();
    }
}

public class Task_4_5_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число a: ");
        int a = in.nextInt();
        System.out.println("Введите число b: ");
        int b = in.nextInt();
        System.out.println(ArithmeticProgressionSum.getArithmeticProgressionSum(a,b));

    }
}

