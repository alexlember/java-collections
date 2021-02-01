package ru.lember.collections.stack;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class StackTest {

    @Test
    void initTest() {

        Stack<String> list = new Stack<>();
        Assertions.assertThat(list).isNotNull();
        Assertions.assertThat(list).isEmpty();

    }
}
