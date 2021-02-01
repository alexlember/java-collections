package ru.lember.collections.queue;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Deque;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedDequeTest {

    @Test
    void initTest() {

        Deque<String> deque = new ConcurrentLinkedDeque<>();
        Assertions.assertThat(deque).isNotNull();
        Assertions.assertThat(deque).isEmpty();

    }
}
