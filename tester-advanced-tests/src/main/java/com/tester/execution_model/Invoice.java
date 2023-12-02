package com.tester.execution_model;

import java.util.ArrayList;
import java.util.List;

public class Invoice {

    private List<Item> itemsList = new ArrayList<>();

    public void addItem(Item item) {
        itemsList.add(item);
    }

    public Item getItem(int index) {
        if (index >= 0 && index < itemsList.size()) {
            return itemsList.get(index);
        } else {
            return null;
        }
    }

    public void clear() {
        this.itemsList.clear();
    }

    public int getSize() {
        return this.itemsList.size();
    }
}
