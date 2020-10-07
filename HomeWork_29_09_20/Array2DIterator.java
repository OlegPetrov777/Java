package com.company;
import java.util.Iterator;
import java.util.NoSuchElementException;


public class Array2DIterator<T> implements Iterator<T> {

    private final T[][] array;
    private int index1;
    private int index2;

    public Array2DIterator(T[][] array){
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        if (index2 >= array[index1].length) {
            index2 = 0;
            index1++;
        }

        return index1 < array.length;
    }

    @Override
    public T next() {
        if (!hasNext())
            throw new NoSuchElementException();
        return array[index1][index2++];

    }

    public static void main(String[] args) {
        Integer[][] array = {{2, 4, 6}, {3, 2, 7}};
        Array2DIterator<Integer> li = new Array2DIterator<>(array);

        for (int i = 0; i < 8; i++){
            System.out.println(li.next());
        }
    }
}
