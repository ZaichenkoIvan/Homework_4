package homework.homework5;

public class Main {

    public static void main(String[] args) {
        String inputText = "Козачок у шароварах! Ішов козак по полю.";
        Text text = new Text(inputText);
        System.out.println(text.toString());
        System.out.println(text.getTitle());
        text.suppText("І побачив свого коня!");
        System.out.println(text.toString());

    }
}
