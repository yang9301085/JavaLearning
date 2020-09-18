package cn.yang.learnJava.foucation.overload;
/*
*
* 方法的重载
* 对于功能类似的方法来说
*   因为参数列表不同却需要记住那么多的方法名
*   太麻烦
*   所以就引入了重载的概念
* 重载
*   多个方法的名称相同，但参数列表不同
* 注意：
*   方法重载于下列情况相关
*       1、参数个数不同
*       2、参数类型不同
*       3、参数多类型顺序不同
*   与下列情况无关
*       1、与参数名称无关
*       2、与方法的返回值无关
* */
public class MethodOverload {
    public static void main(String[] args) {
        System.out.println(isSame(10,20));
        System.out.println(isSame((short)10,(short)20));
        System.out.println(isSame((double)10,(double)20));
    }
    //方法练习题 比较两个数据是否相等
    public static boolean isSame(short a,short b)
    {
        System.out.println("两个short的参数执行");
        boolean same;
        if (a==b)
            same=true;
        else
            same=false;
        return same;
    }
    public static boolean isSame(int a,int b)
    {
        System.out.println("两个int的参数执行");
        boolean same;
        if (a==b)
            same=true;
        else
            same=false;
        return same;
    }
    public static boolean isSame(double a,double b)
    {
        System.out.println("两个double的参数执行");
        boolean same;
        if (a==b)
            same=true;
        else
            same=false;
        return same;
    }
}
