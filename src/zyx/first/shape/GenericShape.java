package zyx.first.shape;

public class GenericShape{


    /**
     * 计算图形数组的面积之和
     * @param shapes
     * @param <T>
     */
    public static<T extends Shape> void countArea(T[] shapes ){
        double totalArea = 0;
        int i = 0;
        while (i < shapes.length && shapes[i] != null){
            totalArea += shapes[i].getArea();
            i++;
        }

        System.out.println("图形数组面积之和为："+totalArea);
    }
}
