package cn.yang.learnJava.interfaceLearning;

/**
 * 在接口中可以定义抽象方法
 * 定义抽象方法时返回值前面是固定的：public abstract
 * 并且这两个字可以选择性的省略
 */
public interface MyInterfaceAbs {
    public static final int CONST_NUM_ONE=10;
    int CONST_NUM_TWO=20;
    public abstract void methodAbs1();
    public void methodAbs2();
    abstract void methodAbs3();
    void methodAbs4();
    //定义默认方法
    public default void methodDefault(){
        System.out.println("MyInterfaceAbs中的默认方法 methodDefault()");
        methodPrivate();
    }
    public default void methodDefaultAnother(){
        System.out.println("MyInterfaceAbs中的默认方法 methodDefaultAnother()");
        methodPrivate();
    }
    //定义静态方法
    public static void methodStatic(){
        System.out.println("MyInterfaceAbs中的静态方法");
    }
    //定义私有方法
    private void methodPrivate(){
        System.out.println("调用了私有方法");
    }
}
