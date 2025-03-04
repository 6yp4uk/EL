import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
public class Task_220 {
    public static void main (String[] args){
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        ArrayList<Integer> array = new ArrayList<>();
        Random random = new Random();
        int i = 0;
        int j = 0;
        while (i < 20) {
            i++;
            array.add(random.nextInt(15) + 1);
            };
        System.out.print(array);
        for (j = 0 ; j < 15; j++) {
            map.merge();
            System.out.println ("!" + array.get(j));
        }
    }
}
