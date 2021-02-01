package ru.lember.collections.set;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class SynchronizedHashSetTest {

    @Test
    void initTest() {

        Set<String> set = Collections.synchronizedSet(new HashSet<>());
        Assertions.assertThat(set).isNotNull();
        Assertions.assertThat(set).isEmpty();

    }
}
