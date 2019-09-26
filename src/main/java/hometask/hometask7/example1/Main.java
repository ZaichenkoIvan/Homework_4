package hometask.hometask7.example1;

import java.util.*;

public class Main {

    private static List<User> users = new ArrayList<>();

    public static void main(String[] args) {
        chooseMenuLang();
    }

    static void menu() {
        System.out.println("Menu");
        System.out.println("1 - View all Student");
        System.out.println("2 - Add new Student");
        System.out.println("3 - Sort Student");
        Scanner in = new Scanner(System.in);

        int choice;
        try {
            choice = in.nextInt();
        } catch (Exception e) {
            throw new IllegalArgumentException("Uncorrected argument");
        }

        switch (choice) {
            case 1:
                printAllUsers();
                break;
            case 2:
                createUserFromConsole();
                break;
            case 3:
                sortUser();
                break;
        }
        menu();
    }

    static void sortUser(){
        users.sort(users.get(0).getUserComparator());
    }


    static void createUserFromConsole() {
        String nameStudent;
        String surnameStudent;
        int age;
        String email;

        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Name Student : ");
            nameStudent = in.nextLine();

            System.out.println("Surname Student : ");
            surnameStudent = in.nextLine();

            System.out.println("Age Student : ");
            age = in.nextInt();

            System.out.println("Email Student : ");
            email = in.nextLine();
        } catch (Exception e) {
            throw new IllegalArgumentException("Uncorrected argument");
        }
        users.add(new User(nameStudent, surnameStudent, age, email));
        System.out.println("Student created\n");

        menu();
    }

    static void chooseLang(int in) {

        String lang;

        try {
            if (in == 1) {
                lang = "Eng";
            } else if (in == 2) {
                lang = "Ua";
            } else
                chooseMenuLang();
        } catch (Exception e) {
            throw new IllegalArgumentException("Uncorrected argument");
        }
        menu();
    }

    static void chooseMenuLang() {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose language/Оберіть мову");
        System.out.println("English (1)");
        System.out.println("Українська (2)");
        int chooseLanguage = in.nextInt();

        chooseLang(chooseLanguage);
    }

    static void printAllUsers() {
        if (users.isEmpty())
            System.out.println("No students yet");
        else {
            System.out.println("\n" + "List of students");
            for (User user : users
            ) {
                System.out.println(user);
            }
            System.out.println();
        }
    }

}
