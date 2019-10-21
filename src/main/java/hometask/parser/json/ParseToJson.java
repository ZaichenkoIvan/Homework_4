package hometask.parser.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import hometask.parser.User;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class ParseToJson {

    public static void parseToJson(User userToParse, String fileName, Gson gson) {


        try (FileWriter writer = new FileWriter(fileName)) {
            gson.toJson(userToParse, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String parseFromJson(String fileName, Gson gson) {

        try (Reader reader = new FileReader(fileName)) {

            User user = gson.fromJson(reader, User.class);

            return user.toString();

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
