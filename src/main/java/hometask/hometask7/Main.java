package hometask.hometask7;

public class Main {
    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Hello");
                continue outer;
            }
            System.out.println("outer");
        }
        switch (new Integer(4)) {
            case 4:
                System.out.println("4");
                break;
            default:
                System.out.println("default");
        }
    }
}
