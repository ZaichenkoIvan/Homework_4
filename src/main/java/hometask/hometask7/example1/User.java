package hometask.hometask7.example1;

import java.util.Comparator;

public class User {
    private final Comparator<User> USER_COMPARATOR_BY_AGE =
            (user1, user2) -> user1.age - user2.age;

    private final Comparator<User> USER_COMPARATOR_BY_NANE =
            (user1, user2) -> user1.name.compareTo(user2.name);

    private final Comparator<User> USER_COMPARATOR_BY_SURNAME =
            (user1, user2) -> user1.surname.compareTo(user2.surname);

    private String name;
    private String surname;
    private int age;
    private String email;

    public User(String name, String surname, int age, String email) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
    }

    public Comparator<User> getUserComparator() {
        return USER_COMPARATOR_BY_NANE.thenComparing(USER_COMPARATOR_BY_SURNAME.thenComparing(USER_COMPARATOR_BY_AGE));
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
//
//final class  Utility{
//    private Utility() {
//    }
//
//    public void swap(User[]users,int i, int j){
////        if(users[i]>users[j])
//        if(USER_COMPARATOR_BY_AGE.compare(users[i],users[j])>0){
//            //
//        }
//    }
//}


