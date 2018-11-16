package com.zyx.first.memory;

/**
 * Created by QDHL on 2017/12/6.
 */
public class MemoryCell {
    private Object story;

    public void write(Object o){
        this.story = o;
    }

    public Object read(){
        return this.story;
    }



    public static void main(String[] args) {
        //简易内存实现
        System.out.println("------ 简易内存实现 ------");
        MemoryCell memory = new MemoryCell();
        String s1 = "你好啊";
        memory.write(s1);
        String s2 = (String)memory.read();
        System.out.println(s2);

        //使用包装类实现基础类型的泛型
        Integer i1 = 15;
        memory.write(i1);
        Integer i2 = (Integer)memory.read();
        System.out.println(i2);
    }
}
