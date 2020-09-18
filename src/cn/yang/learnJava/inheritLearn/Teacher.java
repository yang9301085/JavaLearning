package cn.yang.learnJava.inheritLearn;
/**
*
* 创建一个子类继承Employee
 *
 *
 * 方法中的重写
 *  概念：在继承关系中，方法名称一样，参数列表也一样
 *
 *  注意：重写与重载是完全两个概念
 *
 * 重写是必须保证父子类的方法名称相同，参数列表也相同
 * @override :写在方法前面，用来检测是不是有效的方法重写，是一种可选的检测方法安全的手段
 * 这个注解就算不写，只要满足方法要求也没有问题
 * 子类方法的返回值必须小于等于父类方法的返回值
 * object类是所有类的公共最高父类
 * 子类方法方法的权限必须大于等于父类方法的权限修饰符
 * public > protected > (default) > private
 * *************************************************
 * 继承关系中父子类的构造方法的访问特点
 * 1、子类构造方法当中有一个默认的 super()调用，所以一定是先调用的父类无参构造方法
 * 2、如果父类没有无参构造，可以通过 super 关键字在子类构造中调用父类重载造
 * 3、super()的父类构造调用，必须是类构造方法的第一句
 */
public class Teacher extends Employee {
    int num=10;
    public Teacher() {
        System.out.println("子类构造方法");
    }
    public void methodZi(){
        System.out.println(num);
    }
    //方法重写
    @Override
    public String method(){
        return null;
    }
    public boolean cmp(){
        return num>super.num;
    }
}
