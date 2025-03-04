import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
public class Task_220 {
    public static void main (String[] args){
        Map<Integer,Integer> map_for_array = new HashMap<Integer,Integer>();
        ArrayList<Integer> array = new ArrayList<>();
        Random random = new Random();
        int i = 0;
        int j = 0;
        while (i < 20) {
            i++;
            array.add(random.nextInt(15) + 1);
            };
        System.out.println(array);
        for (i = 0 ; i < array.size(); i++) {
            //System.out.println(array.get(i));
            int k = array.get(i);
            if (map_for_array.containsKey(k)){
                Integer value = map_for_array.get(k);
                value = value + 1;
                map_for_array.put(k,value);
                //System.out.println("!!!!!!!____" + k +" = "+ map_for_array.get(k));
            }
            else map_for_array.put(k,1);
            //System.out.println(map_for_array);
        }

        //System.out.println (map_for_array);
        for(Map.Entry<Integer, Integer> items : map_for_array.entrySet()){
                if (items.getValue() > 1 ){
                    System.out.println("Число " + "'" +items.getKey() + "'" + " встречается " +items.getValue() + " раза");
                }
            //System.out.printf("%s:%s, ", items.getKey(),items.getValue());
                }
        }
    }

