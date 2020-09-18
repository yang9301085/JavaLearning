package cn.yang.learnJava.inheritLearn;
/**
 * 面向对象三大特征封装，继承，多态
 *
 *继承主要解决的问题就是  **共性抽取**
 *
 *
 * 父类也可以叫做基类、超类
 *
 * 子类也可以叫做派生类
 *
 *
 *
 * 继承关系当中的特点：
 *  1、子类可以拥有父类的内容
 *  2、子类还可以拥有自己专有的内容
 *
 *
 *定义父类的格式：（就是普通类的格式）
 *
 * 定义子类的格式：
 *  public class 子类名称 extends 父类名称 {
 *         ......
 * }
 *
 * 当父子类成员变量重名时，有两种方法：
 * 1、直接过类名访问
 *       通过类名访问时，谁调用的成员变量，使用的就是谁的成员变量
 * 2、间接通过方法访问
 *      成员变量重名时，可以写不重名的成员方法
 **/

public class Inherit {
    public static void main(String[] args) {
        Employee emp=new Employee();
        Teacher tec=new Teacher();
        tec.method();
        System.out.println(tec.num);
        System.out.println(emp.num);
        tec.methodZi();
        tec.methodFu();
        System.out.println(tec.cmp());
    }
}
