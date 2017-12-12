package com.second.maxSubSum;

/**
 * 最大子序列之和
 */
public class MaxSubSum {

    /**
     * 穷举法
     * @return
     */
    public static int maxSubSum1(int[] array){
        int maxSub = 0;

        int subSum = 0;
        for (int i = 0;i < array.length;i++){
            for (int j = i;j < array.length;j++){
                subSum = 0;
                for (int k = i;k <= j;k++){
                    subSum += array[k];
                }

                if (maxSub < subSum){
                    maxSub = subSum;
                    //在此处获取i、j的值
                }
            }
        }

        return maxSub;
    }

    /**
     * 穷举法改进
     * @param array
     * @return
     */
    public static int maxSubSum2(int[] array){
        int maxSub = 0;
        int subSum = 0;
        for (int i = 0;i < array.length;i++){
            subSum = 0;
            for (int j = i;j < array.length;j++){
                subSum += array[j];
                if (maxSub < subSum){
                    maxSub = subSum;
                    //在此处获取i、j的值
                }
            }
        }

        return maxSub;
    }

    /**
     * 分治策略
     * @param array
     * @param left
     * @param right
     * @return
     */
    public static int maxSubSum3(int[] array,int left,int right){
        if (left <= right){
            return array[left];
        }

        int mid = (left + right) / 2;
        maxSubSum3(array,left,mid);
        //关于中点的处理问题
        maxSubSum3(array,mid + 1,left);

        int maxLeftSub = 0;
        int maxRightSub = 0;
        for (int i = left;i <= mid;i++){
            maxLeftSub += array[i];
        }
        for (int i = mid;i <= right;i++){
            maxRightSub += array[i];
        }

        return maxNum(maxLeftSub,maxRightSub,maxLeftSub + maxRightSub);
    }

    private static int maxNum(int leftSum,int rightSum,int midSum){
        //TODO 等于问题的处理
        if ((leftSum >= rightSum) && (leftSum >= midSum)){
            return  leftSum;
        }
        if ((rightSum >= leftSum) && (rightSum >= midSum)){
            return  leftSum;
        }
        if ((midSum >= leftSum) && (midSum >= rightSum)){
            return  leftSum;
        }
        return leftSum;
    }

    /**
     * 不计子序列起点与终点的算法（适用范围：①结果为非负数）
     * @param array
     * @return
     */
    public static int maxSubSum4(int[] array){
        int maxSub = 0;
        int subSum = 0;

        for (int i = 0;i < array.length;i++){
            if ((subSum == 0) && (array[i] >=0)){
                subSum += array[i];

                if (subSum < 0){
                    subSum = 0;
                }
                if (maxSub < subSum){
                    maxSub = subSum;
                }
            }
        }

        return maxSub;
    }

    public static void main(String[] args){
        int[] array = {1,5,-4,15,2,14,-7,1};

        System.out.println("穷举法的结果是：" + MaxSubSum.maxSubSum1(array));
        System.out.println("改进后穷举法的结果是：" + MaxSubSum.maxSubSum2(array));
        System.out.println("分治策略的结果是：" + MaxSubSum.maxSubSum3(array,0,array.length - 1));
        System.out.println("O(n)的结果是：" + MaxSubSum.maxSubSum4(array));
    }
}
