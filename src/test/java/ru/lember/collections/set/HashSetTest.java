package ru.lember.collections.set;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashSetTest {

    @Test
    void initTest() {

        Set<String> set = new HashSet<>();
        Assertions.assertThat(set).isNotNull();
        Assertions.assertThat(set).isEmpty();

    }
}
