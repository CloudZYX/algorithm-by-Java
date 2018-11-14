package zyx.first.findmax;

import zyx.first.shape.Circle;
import zyx.first.shape.Rectangle;
import zyx.first.shape.Shape;
import com.sun.javafx.css.Combinator;

import java.util.Comparator;

import com.first.findMax.StringComparaUtil;

public class FindMaxUtil{
    /**
     * 实现Comparable接口的数组获取最大值
     * @param arr
     * @return
     */
    public static int findMax(Comparable[] arr){
        //利用多态实现的泛型
        int max = 0;

        for(int i = 1;i < arr.length;i++){
            if(arr[max].compareTo(arr[i]) < 0){
                max = i;
            }
        }

        return max;
    }

    public static <T> int findMax(T[] arr, Comparator<T> cmp){
        //利用多态实现的泛型
        int max = 0;

        for(int i = 1;i < arr.length;i++){
            if(cmp.compare(arr[max],arr[i]) < 0){
                max = i;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        //使用接口表示泛型
        Shape[] shapeArr = {new Circle(1),
                        new Rectangle(4, 10)};        
        System.out.println("最大的图形是：" + shapeArr[findMax(shapeArr)]);

        String[] nameArr = {"zyx","blm","xzg","zyxL"};
        System.out.println("最大的字符串是：" + findMax(nameArr));


        //使用函数对象
        StringComparaUtil cmp = new StringComparaUtil();
        System.out.println("最大的字符串是：" + findMax(nameArr, cmp));
    }
}