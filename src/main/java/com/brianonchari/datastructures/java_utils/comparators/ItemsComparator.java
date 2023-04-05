package com.brianonchari.datastructures.java_utils.comparators;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemsComparator implements Comparator<Items> {
    private Map<String, Integer> order;

    public ItemsComparator(List<Items> items) {
        order = new HashMap<>();

        for (int i = 0; i < items.size(); i++) {
            order.put(items.get(i).getName(), i);
        }
    }

    @Override
    public int compare(Items items, Items t1) {

        int compare = items.getName().compareTo(t1.getName());
        if (compare == 0) {
            return items.getName().compareTo(t1.getName());
//            compare = items.getName() - t1.getPosition();
        }


        return compare;
    }
}
