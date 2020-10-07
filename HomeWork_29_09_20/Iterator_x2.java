package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Iterator_x2<T> implements Iterator<T> {
    private int index = 0;
    public ArrayList<Iterator<T>> li = new ArrayList<>();

    public Iterator_x2(Iterator<T> iter1, Iterator<T> iter2){
        li.add(iter1);
        li.add(iter2);
    }

    @Override
    public boolean hasNext() {
        return index < li.size();
    }

    @Override
    public T next() {
        if (!li.get(index).hasNext())
            index ++;
        if (!hasNext())
            throw new NoSuchElementException();
        return li.get(index).next();
    }

    public static void main(String[] args) {
        Integer[] array1 = {7, 3, 6, 12};
        ArrayIterator<Integer> arrIt1 = new ArrayIterator<>(array1);

        Integer[] array2 = {8, 5, 16};
        ArrayIterator<Integer> arrIt2 = new ArrayIterator<>(array2);

        Iterator_x2<Integer> iter = new Iterator_x2<>(arrIt1, arrIt2);

        for (int i = 0; i < 8; i++){
            System.out.println(iter.next());
        }
    }
}
