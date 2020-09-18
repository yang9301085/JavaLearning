package cn.yang.learnJava.standand;
/**
* 定义一个标准的类通常需要一下四部分
* 1、所有成员变量都要使用private关键字修饰
* 2、为每个成员变量编写一对Getter/Setter方法
*3、编写一个有参构造函数
* 4、编写一个无参构造函数
*
* 这样的类也叫做Java  Bean
* */
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

