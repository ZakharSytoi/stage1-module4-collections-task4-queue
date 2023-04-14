package com.epam.collections.queue;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> strQueue = new PriorityQueue<>(new MyComp());
        LinkedList<String> tmpList = Stream.concat(firstList.stream(), secondList.stream())
                .sorted(new MyComp()).collect(Collectors.toCollection(LinkedList::new));
        strQueue.addAll(tmpList);
        return strQueue;
    }

    class MyComp implements Comparator<String>{


        @Override
        public int compare(String o1, String o2) {
            return o2.compareTo(o1);
        }
    }
}
