package ru.lember.collections.queue;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class ArrayDequeTest {

    @Test
    void initTest() {

        Deque<String> deque = new ArrayDeque<>(100);
        Assertions.assertThat(deque).isNotNull();
        Assertions.assertThat(deque).isEmpty();

    }
}
