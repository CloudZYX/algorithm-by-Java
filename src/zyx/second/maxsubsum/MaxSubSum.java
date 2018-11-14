package zyx.second.maxsubsum;

/**
 * 最大子序列之和
 */
public class MaxSubSum {

    /**
     * 穷举法
     * @return
     */
    public static int maxSubSum1(int[] array){
        int maxSub = array[0];

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
        int maxSub = array[0];
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
        if (left >= right){
            return array[left];
        }

        int mid = (left + right) / 2;
        //1.以往每次结果的保存（maxLeftSub，maxRightSub）
        int maxLeftSub = maxSubSum3(array,left,mid);    //右半部最大值
        //关于中点的处理问题
        int maxRightSub = maxSubSum3(array,mid + 1,right);  //左半部最大值

        int maxLeftBoard = 0;
        int leftBoard = 0;
        boolean leftFlag = true;
        //计算中间最大值
        for (int i = mid;i >= left;i--){
            leftBoard += array[i];
            if(leftFlag){
                maxLeftBoard = leftBoard;
                leftFlag = false;
            }else if (maxLeftBoard < leftBoard){
                maxLeftBoard = leftBoard;
            }
        }
        
        int maxRightBoard = 0;
        int rightBoard = 0;
        boolean rightFlag = true;
        for (int i = mid + 1;i <= right;i++){
            rightBoard += array[i];
            if(rightFlag){
                maxRightBoard = rightBoard;
                rightFlag = false;
            }else if (maxRightBoard < rightBoard){
                maxRightBoard = rightBoard;
            }
        }

        //比较保留当前结果
        int maxSum = maxNum(maxLeftSub,maxRightSub,maxLeftBoard + maxRightBoard);
        return maxSum;
    }

    private static int maxNum(int leftSum,int rightSum,int midSum){
        //TODO 等于问题的处理
        if ((leftSum >= rightSum) && (leftSum >= midSum)){
            return  leftSum;
        }
        if ((rightSum >= leftSum) && (rightSum >= midSum)){
            return  rightSum;
        }
        if ((midSum >= leftSum) && (midSum >= rightSum)){
            return  midSum;
        }
        return 0;
    }

    /**
     * 不计子序列起点与终点的算法（适用范围：①结果为非负数）
     * @param array
     * @return
     */
    public static int maxSubSum4(int[] array){
        int maxSub = array[0];
        int subSum = 0;

        for (int i = 0;i < array.length;i++){
            subSum += array[i];

            if (subSum < 0){
                //最大子序列开头位置的数不会是负数
                if(maxSub < subSum){
                    maxSub = subSum;
                }
                subSum = 0;
            }else if (maxSub < subSum){
                maxSub = subSum;
            }
        }

        return maxSub;
    }

    public static void main(String[] args){
        //TODO 当前方法 都 不能计算最大值为负的数列
        int[] array = {-3,-5,-4,-15,-2,-14,-7,-1,-7};

        System.out.println("穷举法的结果是：" + MaxSubSum.maxSubSum1(array));
        System.out.println("改进后穷举法的结果是：" + MaxSubSum.maxSubSum2(array));
        System.out.println("分治策略的结果是：" + MaxSubSum.maxSubSum3(array,0,array.length - 1));
        System.out.println("O(n)的结果是：" + MaxSubSum.maxSubSum4(array));
    }
}
