package cn.yang.learnJava.thisKey;
/**
 * this 指针的三种用法
* 1、当方法的局部变量和类的成员变量重名的时候，根据就近原则，优先使用局部变量
*       如果想访问本类中的成员变量，需要使用就近格式
*       this.成员变量名
 * 2、在本类成员方法中调用另一个本类的成员方法，这时的this只起到强调的作用
 * 3、在本类的构造方法中调用本类的其他构造方法，但对语句的位置有严格的要求：必须是构造方法中的第一句
 *      ***但是不能循环调用***
 *  注意：在构造方法中this和super关键字不能同时使用
* */
public class ThisKey {
    public static void main(String[] args) {
        Person person=new Person();
        person.name="杨启仁";
        person.SayHello("杨德新");
        person.methodB();
    }


}
