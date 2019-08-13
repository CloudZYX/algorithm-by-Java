package com.zyx.second;

import com.zyx.second.maxsubsum.MaxSubSum;

public class MaxSubSumMaintest {
    public static void main(String[] args) {
        System.out.println("1.1 最大子序列之和");
        int[] array = {-3,-5,4,-15,-2,10,7,-1,-7,9,1};

        System.out.println("穷举法的结果是：" + MaxSubSum.maxSubSum1(array));
        System.out.println("改进后穷举法的结果是：" + MaxSubSum.maxSubSum2(array));
        System.out.println("分治策略的结果是：" + MaxSubSum.maxSubSum3(array,0,array.length - 1));
        System.out.println("O(n)的结果是：" + MaxSubSum.maxSubSum4(array));
    }
}
