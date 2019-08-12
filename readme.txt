数据结构与算法分析(Java语音描述)
一.引论
Top N问题，字谜
数学公式：指数、对数、级数、归纳法和反证法
递归问题：递归四大法则(1.1.1-1.1.2，recursion)

泛型问题：实质就是多态
    使用Object表示泛型及其两个问题（1.2.1，memory）
        必须转换正确类型访问，不能使用基础类型
        使用包装类解决基础类型的问题
    使用接口表示泛型，执行的方法必须在接口中定义（1.2.2，findMax）
        数组协变性问题

    Java 5的泛型特性（1.2.1-1.2.2，memory,shape）
        泛型类与接口，自动装箱/拆箱
        菱形运算符：类型参数，通配符，类型限界
        泛型方法：类型参数在返回类型前
        泛型的限制：不能创建数组，不能实例化
    类型擦除？？？
        编译器经过类型擦除将泛型类变为原始类，其类型变量以类型限界代替
    instanceof 检测

函数对象：定义一个只有方法没有数据域的类，并实例化一个对象。该对象就是函数对象
    将函数像参数传递（1.2.2，findMax）


二.算法分析
O(N),Ω(N),Θ(N)的定义（Θ-theta）
算法的三种时间

运行时间计算法则（runtime）
    for循环，嵌套for循环，if/else，递归
    递归法则-合成效益：任何计算不要超过一次（1.1.3）

最大子序列和（maxSubSum）
    穷举法，分治法，O(n)算法

算法运行时间出现对数时间的规律
几种对数时间的算法：折半查找，欧几里得算法（求解最大公因数），幂运算

三、表、栈和队列
1.表
表的简单实现（数组）
    扩展数组的方式
    数组实现的表的优点与缺点（查询、插入和删除）
简单链表
    链表的实现方式
    双链表（用于删除）
    链表的优点与缺点（查询、插入和删除）

Collection接口：Collection、Iterator、List、ListIterator
    Collection的定义：
        函数：size()、isEmpty()、clear()、
            contain(T x)、add(T x)、remove(T x)、
            iterator()
        实现（继承）了Iterable接口，必须定义iterator()
            iterator()返回一个Iterator方法
            可以使用增强for
    Iterator的定义：hasNext()、next()、remove()
        增强for的编译器实现（通过迭代器）
        remove()函数
            迭代器失效的情况（集合修改）
            使用迭代器的remove()不会失效

    List接口：继承Collection
        函数：get(int i),set(int i, T x),add(int i, T x),remove(int i)
            listIterator(int pos);
        两种实现及其各自优缺点：ArrayList,LinkedList
        问题：将值为偶数的项从集合中删除（problem）
    listIterator接口：继承Iterator
        函数：hasPrevious(),previous,add(T x),set(T x)