package com.epam.collections.queue;

import java.util.*;


public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> queue = new PriorityQueue<>(new The_Comparator());
       // PriorityQueue<String> queue1 = new PriorityQueue<>(new The_Comparator());

        if (!(firstList.isEmpty() && secondList.isEmpty())) {
            queue.addAll(firstList);
            queue.addAll(secondList);
        }
      //  String str1[] = queue1.toArray(new String[0]);

      //  Collections.reverse(Arrays.asList(str1));


    //    queue1.addAll(queue);


return queue;
    }


}


class The_Comparator implements Comparator<String> {
    public int compare(String str1, String str2)
    {
        String first_Str;
        String second_Str;
        first_Str = str1;
        second_Str = str2;
        return second_Str.compareTo(first_Str);
    }
}