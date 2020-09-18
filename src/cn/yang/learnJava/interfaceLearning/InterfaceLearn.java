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
 * ------------------------------------------------------------------
 * 使用接口的步骤：
 * 1、接口不能直接使用，必须要用他的实现类来间接使用它
 * 2、创建实现后还要把接口中的所有抽象方法去掉它的abstract前缀，然后覆盖重写一遍,
 *       普通的实现类必须重写全部方法，但如果实现类是抽象类就不用
 * 3、最后创建实现类的对象调用接口中的方法
 * ------------------------------------------------------------------
 * 关于接口中的默认方法
 * 默认方法在目前学习中主要解决的是接口升级的问题
 *       在Java 8之前如果接口升级，那么接口的所有的实现类就要增加代码
 *       但是在Java 8之后的版本中，接口中如果增加了默认方法
 *       只需要在实现类创建对象后直接调用即可
 *       调用机制为：如果实现类中没有重写该默认方法则向上找，如果重写了则调用实现类中的默认方法
 * 默认方法格式:
 * public default 返回值 方法名称(参数列表){
 *     //方法体
 * }
 * ------------------------------------------------------------------
 * 关于接口中的静态方法：
 * 格式：
 * public static 返回值 方法名称(参数列表){
 *     //方法体
 * }
 * 接口中静态方法的使用与其他方法不同，不用通过它的实现类去调用，可以直接用接口调用
 * 调用接口中静态方法的格式：
 * 接口名称.静态方法名();
 * ------------------------------------------------------------------
 * 关于接口中的私有方法：
 * 接口中的私有方法主要解决的是多个默认或静态方法中重复代码的问题
 * 为维护代码的安全性，使用私有方法解决这一问题最佳
 * 接口中普通私有方法的格式：
 * private 返回值 方法名称(参数列表){
 *     //方法体
 * }
 * 接口中静态私有方法的格式：
 * private static 返回值 方法名称(参数列表){
 *     //方法体
 * }
 * ------------------------------------------------------------------
 * 关于接口当中的常量：
 * 接口中的常量前缀永远也必须是 public static final
 * 格式：
 * public static final 数据类型 常量名 = 值;
 * 数据类型前的前缀可以省略但目前不推荐，如果不写的话也是常量
 * 在定义常量时常量名的字母必须全部大写
 * 使用时和静态方法相同
 * ------------------------------------------------------------------
 * 接口与继承之间的关系：
 *      1、在Java中一个类可以继承父类的同时实现接口
 *              那么问题来了，如果父类方法与接口方法重名怎么办
 *                  在Java中继承继承机制的优先级要高于接口，所以如果重名，则优先继承父类方法
 *      2、一个类可以同时实现多个接口
 *              那么问题又来了，如果接口的方法重名怎么办
 *                  只需要重写一次即可
 *      3、类与类之间是单继承的，但接口与接口之间是多继承的
 *              那么问题来了，如果父接口中的方法重名怎么办
 *                  对于重名的抽象方法，没关系
 *                  对于重名的默认方法，则子接口必须重写默认方法，并且default关键字必须保留，public无所谓
 * ------------------------------------------------------------------
 * 注意：
 *      接口中不能有静态代码块
 *           不能有构造方法
 */
public class InterfaceLearn {
    public static void main(String[] args) {
        MyInterfaceImpl inter=new MyInterfaceImpl();
        MyInterfaceCommonImpl interCommon=new MyInterfaceCommonImpl();
        inter.methodAbs1();
        inter.methodAbs2();
        inter.methodDefault();//调用接口中的默认方法
        inter.methodDefaultAnother();
        MyInterfaceAbs.methodStatic();//调用接口中的静态方法
        System.out.println(MyInterfaceImpl.CONST_NUM_ONE);//调用接口中的常量
        System.out.println(MyInterfaceImpl.CONST_NUM_TWO);//调用接口中的常量
        interCommon.methodSame();
        interCommon.methodDefault();
    }
}
