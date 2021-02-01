package ru.lember.collections.map;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapTest {

    @Test
    void initTest() {

        Map<String, String> map = new ConcurrentSkipListMap<>();
        Assertions.assertThat(map).isNotNull();
        Assertions.assertThat(map).isEmpty();

    }
}
