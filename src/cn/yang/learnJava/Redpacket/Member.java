package cn.yang.learnJava.Redpacket;

import javax.sound.midi.Receiver;
import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    public Member(){

    }
    public Member(String name,int money){
        super(name,money);
    }
    public void receive(ArrayList<Integer> list){
        //从红包中随即抽取一个给自己
        //随即获取一个集合当中的索引编号
        int index=new Random().nextInt(list.size());
        //根据索引从集合中删除
        int delta=list.remove(index);
        int money=super.getMoney();
        super.setMoney(money+delta);
    }
}
