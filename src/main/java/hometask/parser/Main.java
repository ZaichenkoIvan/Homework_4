package hometask.parser;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import hometask.parser.json.ParseToJson;
import hometask.parser.xml.ParseXml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.util.Arrays;

public class Main {
    private static final String fileNameJson = "src/main/resources/file/user.json";
    private static final String fileNameXml = "src/main/resources/file/user.xml";

    public static void main(String[] args) throws JAXBException {
        init();
    }

    private static void init() throws JAXBException {
        User userToParse = new User("Ivan", "Zaichenko", 20, Arrays.asList("First 111", "Second 222"));

        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
        Gson gson = new Gson();
        JAXBContext context = JAXBContext.newInstance(User.class);

        ParseToJson.parseToJson(userToParse, fileNameJson, gsonBuilder);
        System.out.println("gson " + ParseToJson.parseFromJson(fileNameJson, gson));

        ParseXml.parseToXml(userToParse, context, fileNameXml);
        System.out.println("xml " + ParseXml.parseFromXml(context, fileNameXml));
    }
}
