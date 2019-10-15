package hometask.parser.xml;

import hometask.parser.User;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.Arrays;

public class ParseToXml {
    public static void main(String[] args)
    {
        User userToParse = new User("Ivan", "Zaichenko", 20, Arrays.asList("Maybe Java", "Maybe SQL"));

        jaxbObjectToXML(userToParse);
    }

    private static void jaxbObjectToXML(User user)
    {
        try
        {
            JAXBContext jaxbContext = JAXBContext.newInstance(User.class);

            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            File file = new File("c:\\log\\user.xml");

            jaxbMarshaller.marshal(user, file);
        }
        catch (JAXBException e)
        {
            e.printStackTrace();
        }
    }
}
