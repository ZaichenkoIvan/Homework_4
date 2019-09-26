package hometask.hometask7.example1;

import hometask.hometask7.example1.sort.BubbleSort;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private static ArrayList<User> users = new ArrayList<>();

    void chooseMenuLang() {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose language/Оберіть мову");
        System.out.println("English (1)");
        System.out.println("Українська (2)");
        int chooseLanguage = in.nextInt();

        chooseLang(chooseLanguage);
    }

    void chooseLang(int in) {

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

    void menu() {
        System.out.println("Menu");
        System.out.println("1 - View all Student");
        System.out.println("2 - Add new Student");
        System.out.println("3 - Sort Student");
        System.out.println("4 - Choose language");
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
            case 4:
                chooseMenuLang();
                break;
        }
        menu();
    }

    void printAllUsers() {
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

    void createUserFromConsole() {
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

            email = writeEmail(in);

            System.out.println("Age Student : ");
            age = in.nextInt();

        } catch (Exception e) {
            throw new IllegalArgumentException("Uncorrected argument");
        }
        users.add(new User(nameStudent, surnameStudent, age, email));
        System.out.println("Student created\n");

        menu();
    }

    void sortUser() {
        //users.sort(users.get(0).getUserComparator());
        BubbleSort.sort(users);
        System.out.println("Users are sorted\n");
    }

    private String writeEmail(Scanner in) {

        System.out.println("Email Student : ");
        String email = in.nextLine();

        if (!EmailValidator.validate(email)) {
            System.out.println("Uncorrected email!!!!");
            writeEmail(in);
        }

        return email;
    }
}