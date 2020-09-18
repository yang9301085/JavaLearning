package cn.yang.learnJava.interfaceLearning;

/**
 * 接口就是多个类的公共规范
 * 接口是一种引用数据类型，最重要的就是其中的：抽象方法
 *
 * 如何定义一个接口：
 * public interface 接口名称{
 *     //接口内容
 * }
 * 备注：换成关键字interface之后，编译生成的字节码文件依然是.java-->.class
 *
 * 接口随着各个版本的更新所包含的内容：
 * 在Java 7中：
 * 1、常量
 * 2、抽象方法
 * 在Java 8中：
 * 3、默认方法
 * 4、静态方法
 * 在Java 9中：
 * 5、私有方法
 *
 * 使用接口的步骤：
 * 1、接口不能直接使用，必须要用他的实现类来间接使用它
 * 2、创建实现后还要把接口中的所有方法去掉它的abstract前缀，然后覆盖重写一遍,
 *       普通类必须全部重写方法，但如果实现类是抽象类就不用
 * 3、最后创建实现类的对象调用接口中的方法
 * 关于接口中
 */
public class InterfaceLearn {
    public static void main(String[] args) {
        MyInterfaceImpl inter=new MyInterfaceImpl();
        inter.methodAbs1();
        inter.methodAbs2();
    }
}
