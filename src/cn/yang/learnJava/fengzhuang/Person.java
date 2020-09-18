package cn.yang.learnJava.fengzhuang;

public class Person {
    String name;
    private int age;
    public void show(){
        System.out.println("我叫："+name+"年龄："+ age);
    }
    //这个成员方法专门用来向age设置数据
    public void setAge(int num) {
        if (num<100&&num>=0)
            age=num;
        else
            System.out.println("数据不合理");
    }
    //这个方法专门私语获取age数据
    public int getAge(){
        return age;
    }
    //以上就是间接访问私有类型age
}
