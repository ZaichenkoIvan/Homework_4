package hometask.parser.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class ParseToJson {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        User userToParse = new User("Ivan", "Zaichenko", 20, Arrays.asList("Maybe Java", "Maybe SQL"));

        try (FileWriter writer = new FileWriter("c:\\log\\staff.json")) {
            gson.toJson(userToParse, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
