package com.zyx.java_algorithm.third.arraylist;

import com.zyx.java_algorithm.third.collectioninterface.Collection;

import java.util.Iterator;
import java.util.function.Consumer;

public class ArrayList<T> implements Collection<T> {

    private int size;

    private int length;

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
        add(t, this.size - 1);
    }

    public void add(T t, int idx){
        if (idx >= this.length){
            expansion(this.length * 2);
        }
        item[idx] = t;
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

    private class ArrayListIterator implements Iterator {


        /**
         * Returns {@code true} if the iteration has more elements.
         * (In other words, returns {@code true} if {@link #next} would
         * return an element rather than throwing an exception.)
         *
         * @return {@code true} if the iteration has more elements
         */
        @Override
        public boolean hasNext() {

            return false;
        }

        /**
         * Returns the next element in the iteration.
         *
         * @return the next element in the iteration
         * @throws NoSuchElementException if the iteration has no more elements
         */
        @Override
        public Object next() {
            return null;
        }

        /**
         * Removes from the underlying collection the last element returned
         * by this iterator (optional operation).  This method can be called
         * only once per call to {@link #next}.  The behavior of an iterator
         * is unspecified if the underlying collection is modified while the
         * iteration is in progress in any way other than by calling this
         * method.
         *
         * @throws UnsupportedOperationException if the {@code remove}
         *                                       operation is not supported by this iterator
         * @throws IllegalStateException         if the {@code next} method has not
         *                                       yet been called, or the {@code remove} method has already
         *                                       been called after the last call to the {@code next}
         *                                       method
         * @implSpec The default implementation throws an instance of
         * {@link UnsupportedOperationException} and performs no other action.
         */
        @Override
        public void remove() {

        }

        /**
         * Performs the given action for each remaining element until all elements
         * have been processed or the action throws an exception.  Actions are
         * performed in the order of iteration, if that order is specified.
         * Exceptions thrown by the action are relayed to the caller.
         *
         * @param action The action to be performed for each element
         * @throws NullPointerException if the specified action is null
         * @implSpec <p>The default implementation behaves as if:
         * <pre>{@code
         *     while (hasNext())
         *         action.accept(next());
         * }</pre>
         * @since 1.8
         */
        @Override
        public void forEachRemaining(Consumer action) {

        }
    }

}
