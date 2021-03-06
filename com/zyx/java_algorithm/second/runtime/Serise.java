package com.zyx.java_algorithm.second.runtime;

import java.util.function.Function;

public class Serise implements Function<Integer,Integer>{
    /**
     * 返回函数对象
     * @param i
     * @param n
     * @return
     */
    public Integer apply(Integer i){
        int r = 0;
        if(i > 0){            
            for(int x = i; x > 0; x--){
                r += (x * x * x);
            }
        }else{
            for(int x = i; x < 0; x++){
                r += (x * x * x);
            }
        }
        
        return r;
    }
}