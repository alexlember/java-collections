package ru.lember.collections.map;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * threshold - The next size value at which to resize (capacity * load factor)
 *
 * get O(1)
 * put O(1)
 * remove O(1)
 * contains O(1)
 */
public class HashMapTest {

    @Test
    void initTest() {

        Map<String, String> map = new HashMap<>(4);
        Assertions.assertThat(map).isNotNull();
        Assertions.assertThat(map).isEmpty();

        map.put("1", "A");
        map.put("2", "A");
        map.put("3", "A");
        map.put("4", "A");
        map.put("5", "A");

    }
}
