package ru.lember.collections.map;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

    @Test
    void initTest() {

        Map<String, String> map = new TreeMap<>();
        Assertions.assertThat(map).isNotNull();
        Assertions.assertThat(map).isEmpty();

    }
}
