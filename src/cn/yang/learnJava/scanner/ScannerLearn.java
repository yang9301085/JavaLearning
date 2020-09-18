package cn.yang.learnJava.scanner;
import java.util.Scanner;//导包
/**
 * Scanner类功能：可以实现键盘输入数据到程序当中
 * 引用类型的一般使用步骤：
 * 1、导包
 *      import 包路径.类名称;
 *    只有java.long包下的内容不需要导包，其他都需要
 * 2、创建
 *      类名称 对像名=new 类名称();
 *
 * 3、使用
 *      对像名.成员方法名()
 * */
public class ScannerLearn {
    public static void main(String[] args) {
        //创建
        Scanner sc=new Scanner(System.in);//System.in代表从键盘输入
        int first=sc.nextInt();
        int second=sc.nextInt();
        int result=first+second;
        System.out.println("和是"+result);//输入两个数求和
        //输入三个数求最大值
        int third=sc.nextInt();
        int max=first>second?first>third?first:third:second>third?second:third;
        System.out.println("最大值是"+max);
    }
}
