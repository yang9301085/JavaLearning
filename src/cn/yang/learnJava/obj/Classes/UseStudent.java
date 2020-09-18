package cn.yang.learnJava.obj.Classes;

public class UseStudent {
    public static void main(String[] args) {
        Student stu=new Student();//根据Student类创建对象
        System.out.println(stu.name);
        System.out.println(stu.age);
    }
/*
* 局部变量和成员变量的区别
* 1、第一位置不同
*   局部变量:方法在内部
*   成员变量：方法在外部，直接写在类中
* 2、作用范围不同
*   成员变量：只有方法当中可以使用，出了方法就不能再用
*   成员变量：整个类全都可以使用
* 3、默认值不同【重点】
*   成员变量：如果没有默认值，会有默认值，规则和数组相同
*   局部变量：没有默认值，如果想要使用，必须要有默认值
* */

}
