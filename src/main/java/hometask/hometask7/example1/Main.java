package hometask.hometask7.example1;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {

    public static void main(String[] args) throws UnsupportedEncodingException {
        ResourceBundle resources = ResourceBundle.getBundle("resources", new Locale("ua"), new UTF8Control());
        String language = resources.getString("menu");
        System.out.println(language);
        new Menu().chooseMenuLang();
    }
}
