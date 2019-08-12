package com.zyx.third.arraylist;

import com.zyx.third.collectioninterface.Collection;

import java.util.Iterator;

public class ArrayList<T> implements Collection<T> {

    private int size;

    private T[] item;

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        if (this.size == 0){
            return true;
        }
        return false;
    }

    @Override
    public void clear() {
        this.size = 0;
    }

    @Override
    public boolean contain(T t) {
        for (int i = 0;i < this.item.length;i++){
            if (this.item[i].equals(t))
                return true;
        }
        return false;
    }

    @Override
    public void add(T t) {
        add(t,this.size);
    }

    public void add(T t, int idx){

    }

    @Override
    public void remove(int i) {

    }

    public void expansion(int size){
        //构建泛型数组方法-Object强转
        int length = size * 2;
        T[] newItem = (T[]) new Object[length];

        for(int i = 0;i < size();i++){
            newItem[i] = this.item[i];
        }

        this.item = newItem;
    }

    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
