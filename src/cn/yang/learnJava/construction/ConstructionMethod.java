package cn.yang.learnJava.construction;
/**
* 构造方法：是专门用来创建对象的方法
* 格式：
*   public 类名称(参数类型 参数名称，....){
*       方法体
*   }
* 注意：
* 1、构造方法的名称必须与类名称完全相同
* 2、构造方法不要写返回值类型，连void都不要写
* 3、构造方法不能return一个具体的返回值
* 4、如果没有写构造方法，那么编译器会默认创建一个构造方法，没有参数，方法体什么事也不做
* 5、一旦编写了构造方法，那么编译器将不再创建
* 6、构造方法可以重载
* */
public class ConstructionMethod {
    private String name;
    private int age;
    public ConstructionMethod(){
        System.out.println("无参构造方法执行啦");
    }
    public ConstructionMethod(String name,int age) {
        System.out.println("有参参构造方法执行啦");
        this.age=age;
        this.name=name;
    }
}
