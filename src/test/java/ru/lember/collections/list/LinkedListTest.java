package ru.lember.collections.list;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

    @Test
    void initTest() {

        List<String> list = new LinkedList<>();
        Assertions.assertThat(list).isNotNull();
        Assertions.assertThat(list).isEmpty();

    }
}
