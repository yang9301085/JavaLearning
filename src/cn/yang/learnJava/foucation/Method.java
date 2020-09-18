package cn.yang.learnJava.foucation;

import org.w3c.dom.ls.LSOutput;

/*
* 定义方法的完整格式：
* 修饰符 返回值类型 方法名称（参数类型 参数名称，...）{
*   方法体
*   return 返回值；
* }
* 方法的三种调用格式
*   1、单独调用  方法名称（）；
*   2、打印调用
*   3、赋值调用
* 注意：
*   方法应该定义在类中，但不能在方法中定义方法
* */
public class Method {
    public static void main(String[] args) {
        //单独调用
        sum(10,20);
        System.out.println("*******************");
        //打印调用
        System.out.println(sum(10,30));
        System.out.println("*******************");
        //赋值调用
        int number=sum(30,40);
        System.out.println("number="+number);
        campare(10,20);
    }
    public static int sum(int a,int b) {
        int result=a+b;
        System.out.println(result);
        return result;
    }
    //方法练习
    //比较两个数是否相同
    public static void campare(int a,int b)
    {
        if (a>b)
            System.out.println(a+"大");
        else
            System.out.println(b+"大");
    }
}
