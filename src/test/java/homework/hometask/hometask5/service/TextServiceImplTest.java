package homework.hometask.hometask5.service;

import hometask.hometask5.service.TextServiceImpl;
import hometask.hometask5.domain.Letter;
import hometask.hometask5.domain.Sentence;
import hometask.hometask5.domain.Symbol;
import hometask.hometask5.domain.Text;
import hometask.hometask5.domain.Word;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class TextServiceImplTest {
    private final TextServiceImpl textService = new TextServiceImpl();


    @Test
    public void shouldReturnNullStringForNullText() {
        String expectedResult = null;
        String actualResult = textService.convertTextToString(null);
//        assertEquals(expectedResult,actualResult);
        assertNull("", actualResult);
    }

    @Test
    public void shouldReturnTextFromString() {
        String expectedResult = "Hello Hello4." + "\n" + "Hello Hello4.Hello2.  Hello5.";
        Text text = new TextServiceImpl().convertStringToText("Hello Hello4.Hello2.  Hello5.");
        String actualResult = text.toString();
        assertEquals(expectedResult, actualResult);
    }

//    @Test
//    public void shouldReturnStringForTextWithOutBody() {
//        String expectedResult = "Hello";
//        List<Symbol> symbols = asList(new Letter('H'), new Letter('e'), new Letter('l'),
//                new Letter('l'), new Letter('o'));
//        Sentence header = new Sentence(asList(new Word(symbols)));
//        Text text = new Text(header, null);
//        String actualResult = textService.convertTextToString(text);
//        assertEquals(expectedResult, actualResult);
//    }

}
