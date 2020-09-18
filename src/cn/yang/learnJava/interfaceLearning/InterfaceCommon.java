package cn.yang.learnJava.interfaceLearning;

public interface InterfaceCommon extends InterfaceA,InterfaceB{

    @Override
    default void methodDefault() {
        System.out.println("我是继承了接口A，B的Common接口中的 methodDefault() 方法");
    }

    @Override
    default void methodDefaultAnother() {
        System.out.println("我是继承了接口A，B的Common接口中的 methodDefaultAnother() 方法");
    }
    public default void methodSame(){
        System.out.println("我是在InterfaceCommon中的方法");
    }
}
