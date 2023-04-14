package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> resultDeque = new ArrayDeque<>();
        if(firstQueue.poll() != null){
            resultDeque.add(firstQueue.poll());
        }
        if(firstQueue.poll() != null){
            resultDeque.add(firstQueue.poll());
        }
        if(secondQueue.poll() != null){
            resultDeque.add(secondQueue.poll());
        }
        if(secondQueue.poll() != null){
            resultDeque.add(secondQueue.poll());
        }
        boolean flagMove = true;
        while(firstQueue.poll() != null && secondQueue.poll() != null){
            if(flagMove){
                firstQueue.add(resultDeque.poll());
                if(firstQueue.poll() != null){
                    resultDeque.add(firstQueue.poll());
                }
                if(firstQueue.poll() != null){
                    resultDeque.add(firstQueue.poll());
                }
                flagMove = false;
            }else {
                secondQueue.add(resultDeque.poll());
                if(secondQueue.poll() != null){
                    resultDeque.add(secondQueue.poll());
                }
                if(secondQueue.poll() != null){
                    resultDeque.add(secondQueue.poll());
                }
                flagMove = true;
            }

        }

        return resultDeque;
    }
}
