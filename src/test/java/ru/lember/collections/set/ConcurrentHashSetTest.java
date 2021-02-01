package ru.lember.collections.set;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentHashSetTest {

    @Test
    void initTest() {

        Set<String> set = ConcurrentHashMap.newKeySet();
        Assertions.assertThat(set).isNotNull();
        Assertions.assertThat(set).isEmpty();

    }
}
