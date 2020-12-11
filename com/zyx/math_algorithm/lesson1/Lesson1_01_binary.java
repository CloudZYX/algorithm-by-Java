package com.zyx.math_algorithm.lesson1;

import java.math.BigInteger;
import java.util.Optional;

import static java.lang.Character.MIN_RADIX;

/**
 * @author zyx
 */
public class Lesson1_01_binary {

    /**
     * 通过BigInteger将十进制转换二进制
     * @param param 十进制数
     * @return      二进制字符串
     */
    public static String decimalToBinaryByBigInteger(Integer param){
        return new BigInteger(String.valueOf(param)).toString(MIN_RADIX);
    }

    /**
     * 通过BigInteger将二进制转换十进制
     * @param param 二进制字符串
     * @return      十进制数
     */
    public static Integer binaryToDecimalByBigInteger(String param){
        return new BigInteger(param, MIN_RADIX).intValue();
    }

    /**
     * 左移
     * @param param 参数
     * @param bit   移动位数
     * @return      返回值
     */
    public static Integer leftShift(Integer param, Integer bit){
        return param<<bit;
    }

    /**
     * 右移
     * @param param 参数
     * @param bit   移动位数
     * @return      返回值
     */
    public static Integer rightShift(Integer param, Integer bit){
        return param>>bit;
    }

    /**
     * 算术右移
     * @param param 参数
     * @param bit   移动位数
     * @return      返回值
     */
    public static Integer arithmeticRightShift(Integer param, Integer bit){
        return param>>>bit;
    }

    /**
     * 位或
     * @param param1    参数1
     * @param param2    参数2
     * @return          返回值
     */
    public static Integer bitOr(Integer param1, Integer param2){
        return param1 | param2;
    }

    /**
     * 位与
     * @param param1    参数1
     * @param param2    参数2
     * @return          返回值
     */
    public static Integer bitAnd(Integer param1, Integer param2){
        return param1 & param2;
    }

    /**
     * 异或
     * @param param1    参数1
     * @param param2    参数2
     * @return          返回值
     */
    public static Integer bitXor(Integer param1, Integer param2){
        return param1 ^ param2;
    }

    /**
     * 位非
     * @param param 参数
     * @return      返回值
     */
    public static Integer bitError(Integer param){
        return -param;
    }

    /**
     * 十进制转二进制（余数短除法）
     * @param param 十进制数
     * @return      二进制字符串
     */
    public static String decimalToBinaryByRemainder(int param){
        StringBuilder result = new StringBuilder();
        boolean signBit = false;
        if (param < 0){
            param = -param;
            signBit = true;
        }

        while (param > 1){
            result.insert(0, param % 2);
            param /=  2;
        }
        result.insert(0, param);

        if (signBit){
            result.insert(0, "-");
        }

        return result.toString();
    }
    /**
     * 二进制转十进制
     * @param param 二进制字符串
     * @return      十进制数
     */
    public static Integer binaryToDecimalByRemainder(String param){
        int result = 0;
        int bit = param.length();
        boolean signFlag = false;
        for (char c : param.toCharArray()){
            bit--;
            if ('-' == c){
                signFlag = true;
            }
            else if ('1' == c){
                result += Double.valueOf(Math.pow(2, bit)).intValue();
            }
        }
        if (signFlag){
            result = -result;
        }

        return result;
    }

    /**
     * 十进制转二进制（位操作）
     * @param param 十进制数
     * @return      二进制字符串
     */
    public static String decimalToBinaryByBit(Integer param){
        StringBuilder result = new StringBuilder();
        boolean signFlag = false;

        if (param < 0){
            signFlag = true;
            param = -param;
        }
        while (param != 0){
            result.insert(0, param & 1);
            param = rightShift(param, 1);
        }

        if (signFlag){
            result.insert(0, '-');
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println("---二进制与十进制的转换---");
        Integer params1 = -125;
        String binaryParams = decimalToBinaryByBigInteger(params1);
        Integer decimalParams = binaryToDecimalByBigInteger(binaryParams);
        System.out.printf("参数%s的 二进制 为%s%n", params1, binaryParams);
        System.out.printf("参数%s的 十进制 为%s%n", binaryParams, decimalParams);
        System.out.printf("参数%s的 余数短除法 的 二进制结果 为%s%n", params1, decimalToBinaryByRemainder(params1));
        System.out.printf("参数%s的的 十进制 结果 为%s%n", binaryParams, binaryToDecimalByRemainder(binaryParams));
        System.out.printf("参数%s的 位操作 的 二进制结果 为%s%n", params1, decimalToBinaryByBit(params1));
        System.out.println();

        System.out.println("---移位操作---");
        Integer params2 = -1;
        Integer bitParams = 1;
        System.out.printf("参数%s的二进制为%s%n", params2, decimalToBinaryByBigInteger(params2));
        System.out.printf("参数%s 左移 %s位为：%s%n", params2, bitParams, leftShift(params2, bitParams));
        System.out.printf("参数%s 右移 %s位为：%s%n", params2, bitParams, rightShift(params2, bitParams));
        System.out.printf("参数%s 算术右移 %s位为：%s%n", params2, bitParams, arithmeticRightShift(params2, bitParams));
        System.out.println();

        System.out.println("---位操作---");
        Integer params3 = 16;
        Integer params4 = 21;
        System.out.printf("参数%s的二进制为%s%n", params3, decimalToBinaryByBigInteger(params3));
        System.out.printf("参数%s的二进制为%s%n", params4, decimalToBinaryByBigInteger(params4));

        Integer orResult = bitOr(params3, params4);
        Integer andResult = bitAnd(params3, params4);
        Integer xorResult = bitXor(params3, params4);
        Integer errorResult = bitError(params3);
        System.out.printf("参数%s和参数%s的 按位或 为%s，二进制为%s%n", params3, params4, orResult, decimalToBinaryByBigInteger(orResult));
        System.out.printf("参数%s和参数%s的 按位与 为%s，二进制为%s%n", params3, params4, andResult, decimalToBinaryByBigInteger(andResult));
        System.out.printf("参数%s和参数%s的 按位异或 为%s，二进制为%s%n", params3, params4, xorResult, decimalToBinaryByBigInteger(xorResult));
        System.out.printf("参数%s的 按位非 为%s，二进制为%s%n", params3, errorResult, decimalToBinaryByBigInteger(errorResult));
    }
}
