package com.zyx.math_algorithm.lesson1;

import com.zyx.util.IntegersUtil;

/**
 * @author zyx
 */
public class Lesson1_02_remainder {

    private final static Integer RANDOM_NUM = 15742589;

    private final static Integer SALT = 7;

    /**
     * 简单哈希函数
     * @param params    进行哈希处理的数值
     * @param size      散列块数
     * @return          所属散列数
     */
    public static Integer simpleHashFunction(Integer params, Integer size){
        return (params + RANDOM_NUM) % size;
    }

    /**
     * 加密（hash + salt）
     * @param params    需要加密的参数
     * @return          加密后的数值
     */
    public static Integer simpleEncrypt(Integer params){
        int result = 0;
        for (int i = 1; i <= IntegersUtil.integerSize(params); i++){
            //获取第i位数
            Integer bit = IntegersUtil.getIntegerBit(params, i);
            //1.每一位数加上随机数
            //2.分别对数 x 取余
            //todo 幂函数-将每位数的结果放到对应位上
            result += (bit + RANDOM_NUM) % SALT * Double.valueOf(Math.pow(10, i)).intValue();
        }
        return result;
    }

    /**
     * 解密（hash + salt）
     * @param params    需要解密的参数
     * @return          解密后的数值
     */
    public static Integer simpleDecode(Integer params){
        int result = 0;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("---简单哈希函数---");
        int params1 = 37252;
        System.out.println(String.format("参数%s经过哈希计算的值为%s", params1, simpleHashFunction(params1, 20)));
        System.out.println();

        System.out.println("---简单加密---");
        int params2 = 615;
        System.out.println(String.format("参数%s经过加密的值为%s", params1, simpleEncrypt(params2)));
        System.out.println();
    }

}
