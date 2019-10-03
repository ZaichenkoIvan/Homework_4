package hometask.collection;

import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;
import java.util.Optional;

import static java.util.Optional.ofNullable;
import static org.junit.Assert.*;

public class LinkedListTest {
    private LinkedList<Double> doubles;

    @Before
    public void setUp() {
        doubles = new LinkedList<>();
        doubles.add(4D);
        doubles.add(2D);
        doubles.add(8D);
    }

    @Test
    public void shouldAddElementToLinkedListInTheEnd() {
        doubles.add(5D);
        assertEquals(doubles.size(), 4);
        assertEquals(Optional.of(5.0), ofNullable(doubles.get(3)));

    }

    @Test
    public void shouldAddElementToLinkedListByIndex() {
        doubles.add(1, 5D);
        assertEquals(doubles.size(), 4);
        assertEquals(Optional.of(5.0), ofNullable(doubles.get(1)));
    }

    @Test
    public void shouldRemoveElementInLinkedListByIndex() {
        doubles.remove(1);
        assertEquals(doubles.size(), 2);
        assertEquals(Optional.of(8.0), ofNullable(doubles.get(1)));
    }

    @Test
    public void shouldGetElementInLinkedListByIndex() {
        doubles.add(1, 5D);
        assertEquals(doubles.size(), 4);
        assertEquals(Optional.of(5.0), ofNullable(doubles.get(1)));
    }

    @Test
    public void shouldSetElementInLinkedListByIndex() {
        doubles.set(1, 5D);
        assertEquals(doubles.size(), 3);
        assertEquals(Optional.of(5.0), ofNullable(doubles.get(1)));
    }

    @Test
    public void shouldReturnSizeOfLinkedList() {
        assertEquals(doubles.size(), 3);
        doubles.add(1, 5D);
        assertEquals(doubles.size(), 4);
    }

    @Test
    public void shouldReturnTrueIfEmptyLinkedList() {
        doubles.remove(0);
        doubles.remove(0);
        doubles.remove(0);
        assertTrue(doubles.isEmpty());
    }

    @Test
    public void shouldRemoveLinkedList() {
        doubles.clean();
        assertTrue(doubles.isEmpty());
    }

    @Test
    public void shouldReturnCorrectIterator() {
        Iterator<Double> iterator = doubles.iterator();

        iterator.next();
        if (iterator.hasNext()) {
            iterator.remove();
        }

        assertEquals(2, doubles.size());
    }
}