package cn.yang.learnJava.ArrayListLearn;

import cn.yang.learnJava.array.Array;

import java.util.ArrayList;

/*
* ArrayList常用方法：
*   public boolean add(E e):向集合当中添加元素，参数的类型和泛型一致
*       对于ArrayList来说，add添加动作一定是成功的，所以返回值可用可不用
*       但对于其他集合而言，add添加动作不一定成功
*   public E get(int index):从集合中获取元素，参数是索引编号，编号从 0 开始，返回值就是对应位置的元素
*   public E remove(int index):从集合当中删除元素，参数是索引编号，返回值就是被删除的元素
*   public int size():获取集合的尺寸长度，返回值是集合中包含的元素的个数
*
* */
public class ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        ArrayList<Integer> List_1=new ArrayList<>();
        list.add("1杨启仁");
        list.add("2杨德新");
        list.add("3杨德军");
        list.add("4杨启仁");
        list.add("5杨德新");
        list.add("6杨德军");
        list.add("7杨启仁");
        list.add("8杨德新");
        list.add("9杨德军");
        String name=list.get(1);
        System.out.println(name);
    }
}
