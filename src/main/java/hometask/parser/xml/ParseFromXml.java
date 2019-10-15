package hometask.parser.xml;

import hometask.parser.User;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class ParseFromXml {
        public static void main(String[] args) {
            try {
                File file = new File("c:\\log\\user.xml");
                JAXBContext context = JAXBContext.newInstance(User.class);
                Unmarshaller unmarshaller = context.createUnmarshaller();
                User user = (User) unmarshaller.unmarshal(file);
                System.out.println(user);
            } catch (JAXBException ex) {
                ex.printStackTrace();
            }
        }
}
