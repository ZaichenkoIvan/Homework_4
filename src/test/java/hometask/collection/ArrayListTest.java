package hometask.collection;

import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;
import java.util.Optional;

import static java.util.Optional.ofNullable;
import static org.junit.Assert.*;

public class ArrayListTest {
    ArrayList<Double> doubles;

    @Before
    public void setUp(){
        doubles = new ArrayList<>();
        doubles.add(4D);
        doubles.add(2D);
        doubles.add(8D);
    }

    @Test
    public void shouldAddElementToArrayListInTheEnd() {
        doubles.add(5D);
        assertEquals(doubles.size(),4);
        assertEquals(Optional.of(5.0), ofNullable(doubles.get(3)));

    }

    @Test
    public void shouldAddElementToArrayListByIndex() {
        doubles.add(1,5D);
        assertEquals(doubles.size(),4);
        assertEquals(Optional.of(5.0), ofNullable(doubles.get(1)));
    }

    @Test
    public void shouldRemoveElementInArrayListByIndex() {
        doubles.remove(1);
        assertEquals(doubles.size(),2);
        assertEquals(Optional.of(8.0), ofNullable(doubles.get(1)));
    }

    @Test
    public void shouldGetElementInArrayListByIndex() {
        doubles.add(1,5D);
        assertEquals(doubles.size(),4);
        assertEquals(Optional.of(5.0), ofNullable(doubles.get(1)));
    }

    @Test
    public void shouldSetElementInArrayListByIndex() {
        doubles.set(1,5D);
        assertEquals(doubles.size(),3);
        assertEquals(Optional.of(5.0), ofNullable(doubles.get(1)));
    }

    @Test
    public void shouldReturnSizeOfArrayList() {
        assertEquals(doubles.size(),3);
        doubles.add(1,5D);
        assertEquals(doubles.size(),4);
    }

    @Test
    public void shouldReturnTrueIfEmptyArrayList() {
        doubles.remove(0);
        doubles.remove(0);
        doubles.remove(0);
        assertTrue(doubles.isEmpty());
    }

    @Test
    public void shouldRemoveArrayList() {
        doubles.clean();
        assertTrue(doubles.isEmpty());
    }

    @Test
    public void shouldReturnCorrectIterator() {
        Iterator<Double> iterator = doubles.iterator();
        iterator.next();
        while(iterator.hasNext())
        {
            iterator.remove();
        }
        assertEquals(doubles.size(),1);
    }
}