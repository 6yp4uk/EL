package Task3_6_8;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

class User {

    private String name;
    private int age;

    //конструктор класса User
    public User(String name,int age){

        this.name = name;
        this.age = age;
    }

    // Методы

    public static class UserComparatorName implements Comparator<User>{
        @Override
        public int compare(User last_name, User next_name) {
            //System.out.println(last_name.getName().compareTo(next_name.getName()));
            return last_name.getName().compareTo(next_name.getName());
        }
    }

    @Override
    public String toString() {

        return String.format("%s, возраст %d лет", name, age);
    }

    public String getName() {

        return this.name;
    }

    public Integer getAge() {

        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {

        this.age = age;
    }
}


public class Task_3_6_8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<Integer, List<User>> array_object = new HashMap<Integer, List<User>>();
        //ArrayList<User> array = new ArrayList<User>();
        for (int i = 0; i <= 5; i ++){
            System.out.println("Введите имя пользователя " + (i+1));
            String name_user = in.nextLine();
            System.out.println("Введите возраст пользователя "+ (i+1));
            int age_user = in.nextInt();
            in.nextLine();
            User user = new User(name_user, age_user);
            //array.add(user);
            array_object.computeIfAbsent(user.getAge(), k -> new ArrayList<>()).add(user);
            //System.out.println(array_object);
        }
        System.out.println("Введите требуемый возраст");
        int request_age = in.nextInt();
        if(array_object.containsKey(request_age)){
            List item = array_object.get(request_age);
            Collections.sort(item, new User.UserComparatorName());
            for (int i = 0; i<item.size(); i++){
                System.out.println(item.get(i));
            }
        }
        else {
            System.out.printf(" Пользователь с возрастом '%d' не найден", request_age);
        }
    }
}
