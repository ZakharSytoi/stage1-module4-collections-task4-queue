package com.epam.collections.queue;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        ArrayList<Integer> result = new ArrayList<>();
        ArrayDeque<Integer> dishQueue = IntStream.rangeClosed(1, numberOfDishes).boxed().collect(Collectors.toCollection(ArrayDeque::new));

        int counter = 0;
        int tmpInt;
        while (result.size() < numberOfDishes){
            tmpInt = dishQueue.poll();
            counter++;
            if(counter % everyDishNumberToEat == 0){
                result.add(tmpInt);
                counter = 0;
                continue;
            }
            dishQueue.add(tmpInt);
        }
        return result;
    }
}
