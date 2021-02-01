package ru.lember.collections.map;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class EnumMapTest {

    @Test
    void initTest() {

        Map<Type, String> map = new EnumMap<>(Type.class);
        Assertions.assertThat(map).isNotNull();
        Assertions.assertThat(map).isEmpty();

    }
}


enum Type {
    A,
    B,
    C
}