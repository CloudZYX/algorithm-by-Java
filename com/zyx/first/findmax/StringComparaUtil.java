package com.zyx.first.findmax;

import java.util.Comparator;

public class StringComparaUtil implements Comparator<String>{

    @Override
    public int compare(String str1,String str2){
        return str1.compareToIgnoreCase(str2);
    }
}