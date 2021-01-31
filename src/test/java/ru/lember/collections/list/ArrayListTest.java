package ru.lember.collections.list;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

    @Test
    void initTest() {

        List<String> list = new ArrayList<>();
        Assertions.assertThat(list).isNotNull();
        Assertions.assertThat(list).isEmpty();

    }
}
