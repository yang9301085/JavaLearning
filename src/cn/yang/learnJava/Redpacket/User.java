package cn.yang.learnJava.Redpacket;

public class User {
    private String name;//姓名
    private int money;//当前余额

    public User() {

    }

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void show(){
        System.out.println("我是"+name+"我有"+money);
    }
}
