package com.duk.lab.input;

import com.duk.lab.common.Item;

public class InputGenerator {
    Item[] mArray;

    public Comparable[] getInputArray() {
        if (mArray == null) {
            mArray = generateInputArray(5000, 5000);
        }
        return mArray;
    }

    private Item[] generateInputArray(int size, int range) {
        Item[] array = new Item[size];

        int i = 0;
        while (i < size) {
            int randomInt = (int)(Math.random() * range);
            for (int j = 0; j < i; j++) {
                if (array[j].getKey() == randomInt) {
                    randomInt = -1;
                    break;
                }
            }

            if (randomInt != -1) {
                array[i++] = new Item(randomInt);
            }
        }

        return array;
    }
}
