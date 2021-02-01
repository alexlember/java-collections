package ru.lember.collections.set;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class LinkedHashSetTest {

    @Test
    void initTest() {

        Set<String> set = new LinkedHashSet<>();
        Assertions.assertThat(set).isNotNull();
        Assertions.assertThat(set).isEmpty();

    }
}
