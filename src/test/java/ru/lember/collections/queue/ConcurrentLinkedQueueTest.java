package ru.lember.collections.queue;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ConcurrentLinkedQueueTest {

    @Test
    void initTest() {

        Queue<String> queue = new ConcurrentLinkedQueue<>();
        Assertions.assertThat(queue).isNotNull();
        Assertions.assertThat(queue).isEmpty();

    }
}
