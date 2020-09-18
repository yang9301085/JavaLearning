package cn.yang.learnJava.inheritLearn;


/**
* 定义一个父类   员工类
*
* */
public class Employee {
    int num=20;

    public Employee() {
        System.out.println("父类构造方法");
    }

    public Object method(){
        System.out.println("方法执行");
        return null;
    }
    public void methodFu(){
        System.out.println(num);
    }
}
