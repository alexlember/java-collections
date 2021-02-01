package ru.lember.collections.set;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SynchronizedNavigableSetTest {

    @Test
    void initTest() {

        Set<String> set = Collections.synchronizedNavigableSet(new TreeSet<>());
        Assertions.assertThat(set).isNotNull();
        Assertions.assertThat(set).isEmpty();

    }
}
