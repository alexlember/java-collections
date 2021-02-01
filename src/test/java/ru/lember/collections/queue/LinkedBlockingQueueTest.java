package ru.lember.collections.queue;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueueTest {

    @Test
    void initTest() {

        Queue<String> queue = new LinkedBlockingQueue<>(100);
        Assertions.assertThat(queue).isNotNull();
        Assertions.assertThat(queue).isEmpty();

    }
}
