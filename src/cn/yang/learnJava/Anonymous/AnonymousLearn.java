package cn.yang.learnJava.Anonymous;

import java.util.Scanner;

/**
* 匿名对象
*创建对象的标准格式：
* 类名称 对像名=new 类名称();
*
* 匿名对象就是只有右边的对象，没有左边的名字和赋值运算符
* new 类名称();
* 注意事项：
*   匿名对象只能使用唯一的一次，下次再用不得不在创建个新对象
* 使用建议：如果确定有一个对象只需要使用唯一的一次，就可以是使用匿名对象
* */
public class AnonymousLearn {
    private String name;
    public static void main(String[] args) {
        //匿名对象
        //new AnonymousLearn().name="杨启仁";
//        Scanner sc=new Scanner(System.in);
//        int num=sc.nextInt();
        //匿名对象方式
        int num=new Scanner(System.in).nextInt();
        System.out.println("输入的是："+num);
        methodParam(new Scanner(System.in));//使用匿名对象来进行传参
        Scanner scanner = methodReturn();//匿名对象作为返回值
    }
    public static void methodParam(Scanner sc){
        int num=sc.nextInt();
        System.out.println("输入的是："+num);
    }
    public static Scanner methodReturn(){
        return new Scanner(System.in);
    }
}
