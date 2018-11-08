import com.first.shape.Circle;
import com.first.shape.Rectangle;
import com.first.shape.Shape;

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

    public static void main(String[] args) {
        //使用接口表示泛型
        Shape[] shapeArr = {new Circle(1),
                        new Rectangle(4, 10)};        
        System.out.println("最大的图形是" + shapeArr[findMax(shapeArr)]);

        String[] nameArr = {"zyx","blm","xzg","zyxL"};
        System.out.println("" + findMax(nameArr));

        //使用函数对象
    }
}