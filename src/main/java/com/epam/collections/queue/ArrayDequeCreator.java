package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {

       ArrayDeque<Integer>a = new ArrayDeque<>();
        a.addLast(firstQueue.poll());
        a.addLast(firstQueue.poll());
        a.addLast(secondQueue.poll());
        a.addLast(secondQueue.poll());
        while(!firstQueue.isEmpty() && !secondQueue.isEmpty()){
           firstQueue.add(a.pollLast());
           a.addLast(firstQueue.poll());
           a.addLast(firstQueue.poll());
            secondQueue.add(a.pollLast());
            a.addLast(secondQueue.poll());
            a.addLast(secondQueue.poll());

        }


        return a;
    }
}
