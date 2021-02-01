package ru.lember.collections.map;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SynchronizedNavigableMapTest {

    @Test
    void initTest() {

        Map<String, String> map = Collections.synchronizedNavigableMap(new TreeMap<>());
        Assertions.assertThat(map).isNotNull();
        Assertions.assertThat(map).isEmpty();

    }
}
