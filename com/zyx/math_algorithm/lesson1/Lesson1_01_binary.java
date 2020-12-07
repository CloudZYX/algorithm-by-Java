package com.zyx.math_algorithm.lesson1;

import java.math.BigInteger;

import static java.lang.Character.MIN_RADIX;

/**
 * @author zyx
 */
public class Lesson1_01_binary {

    /**
     * 通过BigInteger将十进制转换二进制
     * @param param
     * @return
     */
    public static String decimalToBinaryByBigInteger(Integer param){
        return new BigInteger(String.valueOf(param)).toString(MIN_RADIX);
    }

    /**
     * 通过BigInteger将二进制转换十进制
     * @param param
     * @return
     */
    public static Integer binaryToDecimalByBigInteger(String param){
        return new BigInteger(param, MIN_RADIX).intValue();
    }

    /**
     * 左移
     * @param param
     * @param bit
     * @return
     */
    public static Integer leftShift(Integer param, Integer bit){
        return param<<bit;
    }

    /**
     * 右移
     * @param param
     * @param bit
     * @return
     */
    public static Integer rightShift(Integer param, Integer bit){
        return param>>bit;
    }

    /**
     * 算术右移
     * @param param
     * @param bit
     * @return
     */
    public static Integer arithmeticRightShift(Integer param, Integer bit){
        return param>>>bit;
    }

    /**
     * 位或
     * @param param1
     * @param param2
     * @return
     */
    public static Integer bitOr(Integer param1, Integer param2){
        return param1 | param2;
    }

    /**
     * 位与
     * @param param1
     * @param param2
     * @return
     */
    public static Integer bitAnd(Integer param1, Integer param2){
        return param1 & param2;
    }

    /**
     * 异或
     * @param param1
     * @param param2
     * @return
     */
    public static Integer bitXor(Integer param1, Integer param2){
        return param1 ^ param2;
    }

    /**
     * 位非
     * @param param
     * @return
     */
    public static Integer bitError(Integer param){
        return -param;
    }

    public static void main(String[] args) {
        System.out.println("---二进制与十进制的转换---");
        Integer params1 = 10;
        String binaryParams = Lesson1_01_binary.decimalToBinaryByBigInteger(params1);
        Integer decimalParams = Lesson1_01_binary.binaryToDecimalByBigInteger(binaryParams);
        System.out.println(String.format("参数%s的二进制为%s", params1, binaryParams));
        System.out.println(String.format("参数%s的十进制为%s", binaryParams, decimalParams));
        System.out.println();

        System.out.println("---移位操作---");
        Integer params2 = -133;
        Integer bitParams = 2;
        System.out.println(String.format("参数%s的二进制为%s", params2,
                Lesson1_01_binary.decimalToBinaryByBigInteger(params2)));
        System.out.println(String.format("参数%s左移%s位为：%s", params2, bitParams,
                Lesson1_01_binary.leftShift(params2, bitParams)));
        System.out.println(String.format("参数%s右移%s位为：%s", params2, bitParams,
                Lesson1_01_binary.rightShift(params2, bitParams)));
        System.out.println(String.format("参数%s算术右移%s位为：%s",params2, bitParams,
                Lesson1_01_binary.arithmeticRightShift(params2, bitParams)));
        System.out.println();

        System.out.println("---位操作---");
        Integer params3 = 16;
        Integer params4 = 21;
        System.out.println(String.format("参数%s的二进制为%s", params3,
                Lesson1_01_binary.decimalToBinaryByBigInteger(params3)));
        System.out.println(String.format("参数%s的二进制为%s", params4,
                Lesson1_01_binary.decimalToBinaryByBigInteger(params4)));

        Integer orResult = Lesson1_01_binary.bitOr(params3, params4);
        Integer andResult = Lesson1_01_binary.bitAnd(params3, params4);
        Integer xorResult = Lesson1_01_binary.bitXor(params3, params4);
        Integer errorResult = Lesson1_01_binary.bitError(params3);
        System.out.println(String.format("参数%s和参数%s的按位或为%s，二进制为%s", params3, params4, orResult,
                Lesson1_01_binary.decimalToBinaryByBigInteger(orResult)));
        System.out.println(String.format("参数%s和参数%s的按位与为%s，二进制为%s", params3, params4, andResult,
                Lesson1_01_binary.decimalToBinaryByBigInteger(andResult)));
        System.out.println(String.format("参数%s和参数%s的按位异或为%s，二进制为%s", params3, params4, xorResult,
                Lesson1_01_binary.decimalToBinaryByBigInteger(xorResult)));
        System.out.println(String.format("参数%s的按位非为%s，二进制为%s", params3, errorResult,
                Lesson1_01_binary.decimalToBinaryByBigInteger(errorResult)));
    }
}
