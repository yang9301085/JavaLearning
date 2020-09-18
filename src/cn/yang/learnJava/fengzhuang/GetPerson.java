package cn.yang.learnJava.fengzhuang;
/**
* 问题描述：定义Person的年龄时，无法阻止不合理的数值被设置进来
* 解决方案：用private关键字将需要保护的成员变量进行修饰
*
* 一旦使用了private进行修饰，那么本类当中仍然可以随意访问
* 但是！超出了本类范围之外给予不能直接访问了
* 但是可以间接访问
* 名字必须叫setXXX，或getXXX命名规则
* */
public class GetPerson {
    public static void main(String[] args) {
        Person person=new Person();
        person.name="杨启仁";
        //person.age=25;
        person.setAge(-2);
        person.show();
    }
}
