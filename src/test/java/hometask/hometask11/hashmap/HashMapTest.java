package hometask.hometask11.hashmap;


import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class HashMapTest {
    private Map<String, String> surnameToNames;

    @Before
    public void setUp() {
        surnameToNames = new HashMap<>();
        surnameToNames.put("ZaichenkoFirst", "Ivan");
        surnameToNames.put("Zaichenko", "Vasyl");
        surnameToNames.put("Tsaruk", "Vova");
    }

    @Test
    public void shouldReturnPutedNodeToHashMap() {
        assertThat(surnameToNames.values(), Matchers.hasItems("Vasyl", "Vova", "Ivan"));
        assertThat(surnameToNames.values(), Matchers.hasSize(3));
        assertThat(surnameToNames.keys(), Matchers.hasItems("ZaichenkoFirst", "Zaichenko"));
        assertThat(surnameToNames.keys(), Matchers.hasSize(2));
    }

    @Test
    public void shouldReturnValueByKeyFromHashMap() {
        assertThat("Ivan", is(surnameToNames.getByKey("ZaichenkoFirst")));
        assertThat("Vasyl", is(surnameToNames.getByKey("Zaichenko")));
        assertThat("Vova", is(surnameToNames.getByKey("Tsaruk")));
    }

    @Test
    public void shouldReturnSizeHashMap() {
        assertThat(2, is(surnameToNames.size()));
        surnameToNames.put("Tsaruk1111", "Vova");
        assertThat(3, is(surnameToNames.size()));
    }

    @Test
    public void shouldReturnTrueIfEmptyList() {
        surnameToNames = new HashMap<>();
        assertThat(true, is(surnameToNames.isEmpty()));
    }

    @Test
    public void shouldReturnCollectionOfValuesHashMap() {
        assertThat(surnameToNames.values(), Matchers.hasItems("Vasyl", "Vova", "Ivan"));
        assertThat(surnameToNames.values(), Matchers.hasSize(3));
    }

    @Test
    public void shouldReturnSetOfKeysHashMap() {
        assertThat(surnameToNames.keys(), Matchers.hasItems("ZaichenkoFirst", "Zaichenko"));
        assertThat(surnameToNames.keys(), Matchers.hasSize(2));
    }

    @Test
    public void shouldGrowHashMapForMoreThanEightNode() {
        surnameToNames.put ("wrhwerwerwerwerwe", "NewName1");
        surnameToNames.put ("rwerwerjwejrwejrejwrjwe", "NewName2");
        surnameToNames.put ("rwejrewhjrhewjrhwehrrrweewewew", "NewName3");
        surnameToNames.put ("rekwrewjjewj", "NewName4");
        surnameToNames.put ("fdsjkfjsdjfjdsjfsdjsdjfjsdjjdsjdsjsjs", "NewName5");
        surnameToNames.put ("refdjsjfdfdsdsjjsjswjw", "NewName6");
        surnameToNames.put ("rfdjsjdsjdsjdsjsdjsdjewjw", "NewName7");
        surnameToNames.put ("rewkdskskskskskskskskskskjw", "NewName8");
        surnameToNames.put ("11111111111111111111111", "NewName9");
        surnameToNames.put ("2222222222222222222222", "NewName10");
        surnameToNames.put ("3333333333333333333", "NewName11");
        assertThat(14, is(surnameToNames.size()));
    }
}