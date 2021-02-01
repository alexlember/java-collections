package ru.lember.collections.map;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapTest {

    @Test
    void initTest() {

        Map<String, String> map = new HashMap<>();
        Assertions.assertThat(map).isNotNull();
        Assertions.assertThat(map).isEmpty();

    }
}
