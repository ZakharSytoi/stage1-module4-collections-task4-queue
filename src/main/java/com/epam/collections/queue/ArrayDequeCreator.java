package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> resultDeque = new ArrayDeque<>();

        resultDeque.add(firstQueue.poll());
        resultDeque.add(firstQueue.poll());
        resultDeque.add(secondQueue.poll());
        resultDeque.add(secondQueue.poll());

        boolean flagMove = true;
        while (firstQueue.peek() != null || secondQueue.peek() != null) {
            if (flagMove) {
                firstQueue.add(resultDeque.pollLast());
                resultDeque.add(firstQueue.poll());
                resultDeque.add(firstQueue.poll());
                flagMove = false;
            } else {
                secondQueue.add(resultDeque.pollLast());
                resultDeque.add(secondQueue.poll());
                resultDeque.add(secondQueue.poll());
                flagMove = true;
            }

        }

        return resultDeque;
    }
}
