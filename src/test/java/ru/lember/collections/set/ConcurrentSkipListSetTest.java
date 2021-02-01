package ru.lember.collections.set;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListSetTest {

    @Test
    void initTest() {

        Set<String> set = new ConcurrentSkipListSet<>();
        Assertions.assertThat(set).isNotNull();
        Assertions.assertThat(set).isEmpty();

    }
}
