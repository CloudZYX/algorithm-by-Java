package com.zyx.util;

/**
 * @author zyx
 */
public class IntegersUtil {

    final static int [] sizeTable = { 9, 99, 999, 9999, 99999, 999999, 9999999,
            99999999, 999999999, Integer.MAX_VALUE };

    /**
     * 获取整数位数
     * @param x 整数
     * @return  位数
     */
    public static int integerSize(int x) {
        for (int i = 0; ; i++)
            if (x <= sizeTable[i])
                return i + 1;
    }

    /**
     * 获取整数 x 的第 n 位数
     * @param x 整数
     * @param n 位数
     * @return 整数 x 的第 n 位数的值
     */
    public static int getIntegerBit(int x, int n){
        for (int i = 1; i < n; i++){
            x = x / 10;
        }
        return x % 10;
    }
}
