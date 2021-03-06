package cn.yang.learnJava.Redpacket;

import com.sun.jdi.VMOutOfMemoryException;

import java.util.ArrayList;

public class Manager extends User {
    public Manager(){

    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney,int count){
        //首先需要一个集合存储若干红包的金额
        ArrayList<Integer> redList=new ArrayList<>();
        //首先要看一下群主有多少钱
        int leftMoney=super.getMoney();
        if (totalMoney>leftMoney){
            System.out.println("余额不足");
            return redList;//返回空集合
        }
        //扣钱，其实就是重新设置余额
        super.setMoney(leftMoney-totalMoney);
        //发红包，需要平均拆分成count份
        int avg=totalMoney/count;
        int mod=totalMoney%count;//余数，剩下的零头
        //剩下的零头把它抱在最后的红包里
        //把红包一个一个放在集合中
        for (int i=0;i< count-1;i++){
            redList.add(avg);
        }
        //最后一个红包
        int last=avg+mod;
        redList.add(last);
        return redList;
    }
}
