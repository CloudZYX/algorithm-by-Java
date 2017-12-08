package com.memory;

public class GenericMemory<T> {

    private T story;

    public void write(T o){
        this.story = o;
    }

    public T read(){
        return this.story;
    }

    public static void main(String[] args) {
        //自动装箱/拆箱  菱形运算符
        System.out.println("------ 自动装箱/拆箱 ------");
        GenericMemory<Integer> memory = new GenericMemory<>();

        memory.write(37);
        int val = memory.read();
        System.out.print(val);
    }
}
