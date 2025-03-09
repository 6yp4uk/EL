package Task3_4_6;
import java.util.Scanner;

class User {

    private String name;
    private int age;



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

class Task_3_4{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите имя первого пользователя");
        String name_first_user = in.nextLine();
        System.out.println("Введите возраст первого пользователя");
        int age_first_user = in.nextInt();
        in.nextLine();
        User user_first  = new User(name_first_user, age_first_user);

        System.out.println("Введите имя второго пользователя");
        String name_second_user = in.nextLine();
        System.out.println("Введите возраст второго пользователя");
        int age_second_user = in.nextInt();
        User user_second = new User(name_second_user, age_second_user);

        if (user_first.getAge() < user_second.getAge()) {
            System.out.print (user_first.toString());
        }
        else {
            System.out.print(user_second.toString());
        }
    }
}