package ru.lember.collections.map;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;

public class WeakHashMapTest {

    @Test
    void initTest() {

        Map<String, String> map = new WeakHashMap<>();
        Assertions.assertThat(map).isNotNull();
        Assertions.assertThat(map).isEmpty();

    }
}
