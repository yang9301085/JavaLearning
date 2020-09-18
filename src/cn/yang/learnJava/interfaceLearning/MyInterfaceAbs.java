package cn.yang.learnJava.interfaceLearning;

/**
 * 在接口中可以定义抽象方法
 * 定义抽象方法时返回值前面是固定的：public abstract
 * 并且这两个字可以选择性的省略
 */
public interface MyInterfaceAbs {
    public abstract void methodAbs1();
    public void methodAbs2();
    abstract void methodAbs3();
    void methodAbs4();
}
