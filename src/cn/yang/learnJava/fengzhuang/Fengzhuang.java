package cn.yang.learnJava.fengzhuang;
/**
* 面向对象三大特性：封装，继承，多态
* 封装性在Java中的体现
* 1、方法就是一种封装(最为简单的一点)
* 2、关键字private也是一种封装
*
* 封装就是把细节隐藏起来，对于外界不可见
* */
public class Fengzhuang {
    public static void main(String[] args) {
        int[] array={5,15,25,20,100};
        int max=array[0];
        for (int i=1;i<array.length;i++)
        {
            if(array[i]>max)
                max=array[i];
        }
        max=getMax(array);
        System.out.println(max);
    }
    //给一个数组，找出最大值
    public static int getMax(int[] array){
        int max=array[0];
        for (int i=1;i<array.length;i++)
        {
            if(array[i]>max)
                max=array[i];
        }
        return max;
    }
}
