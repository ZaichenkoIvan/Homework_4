package hometask.parser.json;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ParseFromJson {
    public static void main(String[] args) {

        Gson gson = new Gson();

        try (Reader reader = new FileReader("c:\\log\\staff.json")) {

            User user = gson.fromJson(reader, User.class);

            System.out.println(user);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
