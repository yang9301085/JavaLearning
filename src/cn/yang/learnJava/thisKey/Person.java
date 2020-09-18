package cn.yang.learnJava.thisKey;

public class Person extends Father{
    String name;

    public Person() {
        this("我草");
    }

    public Person(String name) {
        this.name = name;
    }

    public void SayHello(String name) {
        System.out.println(name+"你好，我是"+this.name);
    }
    public void methodA(){
        System.out.println("aaa");
    }
    public void methodB(){
        System.out.println("BBB");
        this.methodA();
        super.a=22;
    }
}
