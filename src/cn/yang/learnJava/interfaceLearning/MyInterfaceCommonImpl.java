package cn.yang.learnJava.interfaceLearning;

public class MyInterfaceCommonImpl extends MyInterfaceImpl implements InterfaceCommon,MyInterfaceAbs{
    @Override
    public void methodDefault() {
        System.out.println("我是在MyInterfaceCommonImpl中的methodDefault方法");
    }

    @Override
    public void methodDefaultAnother() {
        System.out.println("我是在MyInterfaceCommonImpl中的methodDefaultAnother方法");
    }
}
