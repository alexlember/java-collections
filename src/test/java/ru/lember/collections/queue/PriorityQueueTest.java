package ru.lember.collections.queue;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityQueueTest {

    @Test
    void initTest() {

        Queue<String> queue = new PriorityQueue<>(100);
        Assertions.assertThat(queue).isNotNull();
        Assertions.assertThat(queue).isEmpty();

    }
}
