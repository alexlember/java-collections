package ru.lember.collections.list;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListTest {

    @Test
    void initTest() {

        List<String> list = new CopyOnWriteArrayList<>();
        Assertions.assertThat(list).isNotNull();
        Assertions.assertThat(list).isEmpty();

    }
}
