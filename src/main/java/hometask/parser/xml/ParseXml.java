package hometask.parser.xml;

import hometask.parser.User;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.Arrays;

public class ParseXml {

    public static String parseFromXml(JAXBContext context, String nameFile) {
        try {
            File file = new File(nameFile);

            Unmarshaller unmarshaller = context.createUnmarshaller();
            User user = (User) unmarshaller.unmarshal(file);
            return user.toString();
        } catch (JAXBException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public static void parseToXml(User user, JAXBContext context, String nameFile) {
        try {
            Marshaller jaxbMarshaller = context.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            File file = new File(nameFile);

            jaxbMarshaller.marshal(user, file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
