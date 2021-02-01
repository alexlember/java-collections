package ru.lember.collections.queue;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Deque;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;
import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueTest {

    @Test
    void initTest() {

        Queue<String> queue = new ArrayBlockingQueue<>(100);
        Assertions.assertThat(queue).isNotNull();
        Assertions.assertThat(queue).isEmpty();

    }
}
