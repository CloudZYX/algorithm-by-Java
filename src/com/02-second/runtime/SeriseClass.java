import java.util.function.Function;

public class SeriseClass{
    /**
     * 返回函数对象
     * @param i
     * @param n
     * @return
     */
    public static Function newInstance(int i){
        return new Function<Integer,Integer>() {
            @Override
            public Integer apply(int i){
                return i * i * i;
            }
        };
    }
}