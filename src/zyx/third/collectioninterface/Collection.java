package zyx.third.collectioninterface;

public interface Collection<T> extends Iterable<T>{
    //集合大小
    int size();
    //集合是否为空
    boolean isEmpty();
    //清除集合元素
    void clear();

    //判断该元素是否在集合中
    boolean contain(T t);
    //增加集合
    void add(T t);
    //删除集合
    void remove(int i);

    //获得迭代器
    Itertor<T> iterator();
}