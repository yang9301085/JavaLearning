package cn.yang.learnJava.ArrayListLearn;

import java.util.ArrayList;

/**
* ArrayList集合的长度是可以随意改变的
*
* 对于ArrayList来说，有一个   <E>   代表泛型
* 泛型：也就是装在集合当中的所有元素，全部是统一的什么类型
* 注意：泛型只能用引用类型，不能是基本类型,
*       如果想用基本类型，那就要用包装类
* 拓展：对于ArrayList来说直接打印得到的不是地址，而是内容，如果里面没有内容，得到的是中括号  []
**/
public class ArrayLists {
    public static void main(String[] args) {
        //创建一个ArrayList集合，集合的名称是list，里面装的是String字符串类型的数据
        //备注:从JDK1.7+开始，右侧的尖括号内部可以不写内容，但<>本身还是要写的
        ArrayList<String> list=new ArrayList<>();
        //向集合当中添加数据，需要用到add()方法
        list.add("杨启仁");
        list.add("杨德新");
        list.add("杨德军");
        System.out.println(list);
    }
}
