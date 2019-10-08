package hometask.hometask11.merge;

import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.Collections;
import java.util.Map;

import static hometask.hometask11.merge.Main.mergeByCounter;
import static hometask.hometask11.merge.Main.mergeByMapMethod;
import static org.junit.Assert.assertThat;

public class MergeTest {


    @Test
    public void shouldReturnCounterOfCharByCounterMethod() {
        Map<Character, Integer> charToCounters = mergeByCounter("Hello");
        assertThat(charToCounters, Matchers.hasEntry('e', 1));
        assertThat(charToCounters, Matchers.hasEntry('l', 2));
        assertThat(charToCounters, Matchers.hasEntry('H', 1));
        assertThat(charToCounters, Matchers.hasEntry('o', 1));
        assertThat(charToCounters.values(), Matchers.hasSize(4));
    }

    @Test
    public void shouldReturnCounterOfCharByMapMethod() {
        Map<Character, Integer> charToCounters = mergeByMapMethod("Hello");
        assertThat(charToCounters, Matchers.hasEntry('e', 1));
        assertThat(charToCounters, Matchers.hasEntry('l', 2));
        assertThat(charToCounters, Matchers.hasEntry('H', 1));
        assertThat(charToCounters, Matchers.hasEntry('o', 1));
        assertThat(charToCounters.values(), Matchers.hasSize(4));
    }
}