package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        Queue<Integer> queue = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 1 ;i<numberOfDishes;i++){
            queue.add(i);
        }
        Iterator<Integer> itr = queue.iterator();
        while (itr.hasNext()) {
            for(int i=1;i<everyDishNumberToEat;i++){
                if(itr.hasNext()) {
                    itr.next();
                }
            }
            list.add(queue.poll());
        }

        return list;
    }
}
