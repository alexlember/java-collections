package ru.lember.collections.queue;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueTest {

    @Test
    void initTest() {

        Queue<String> queue = new PriorityBlockingQueue<>(100);
        Assertions.assertThat(queue).isNotNull();
        Assertions.assertThat(queue).isEmpty();

    }
}
