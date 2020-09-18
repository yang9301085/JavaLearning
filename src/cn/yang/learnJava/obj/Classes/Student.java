package cn.yang.learnJava.obj.Classes;
/*
* 怎样定义一个类
*
* 在Java类中：
* 成员变量（属性）
* 成员方法（行为）：
* ***********************
* 成员方法没有static关键字**
* 普通方法有static关键字  **
* ***********************
*
* 注意：
*1、成员变量是直接定义在类当中的，在方法外边
*2、成员方法不要写static关键字
*3、通常情况下类不能直接使用，需要根据类创建一个对象，才能使用
* ************
*   1、导包，也就是指出需要使用的类没在什么位置
*       import 包名称.类名称
*       对于和当前类属于同一个包的情况，可以省略导包语句补写
*   2、创建，格式：
*       类名称 对象名=new 类名称();
*       Student stu=new Student();
*   3、使用（两种情况）
*       使用成员变量：对像名.成员变量名
*       使用成员方法：对像名.成员方法名（参数）
* */
public class Student {
    String name;
    int age;
    public void eat()
    {
        System.out.println("吃饭");
    }
    public void sleep()
    {
        System.out.println("睡觉");
    }
    public void study()
    {
        System.out.println("学习");
    }
}
