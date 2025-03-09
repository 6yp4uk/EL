package Task_3_5_7;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.ArrayList;
 class User {

    private String name;
    private int age;

public static class UserComparator implements Comparator<User>{
    @Override
    public int compare(User user_last, User user_next){
        return user_last.getAge() - user_next.getAge();
    }
}

    //конструктор класса User
    public User(String name,int age){

        this.name = name;
        this.age = age;
    }

    // Методы
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

class Task_3_5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<User> array = new ArrayList<User>();
        for (int i = 0; i <= 5; i ++){
            System.out.println("Введите имя пользователя " + (i+1));
            String name_user = in.nextLine();
            System.out.println("Введите возраст пользователя "+ (i+1));
            int age_user = in.nextInt();
            in.nextLine();
            User user = new User(name_user, age_user);
            array.add(user);
        }

    Collections.sort(array, new User.UserComparator());
    for(int i = 0; i < array.size(); i++){
        System.out.println(array.get(i));
         }
    }
}
