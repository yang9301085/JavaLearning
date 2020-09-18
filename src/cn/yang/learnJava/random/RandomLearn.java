package cn.yang.learnJava.random;

import java.util.Random;

/*
* Random用来生成随机数字
* */
public class RandomLearn {
    public static void main(String[] args) {
        Random test=new Random();
        int randnum=test.nextInt();//不指定范围生成伪随机数并且有正负
        int randreal=test.nextInt(100);//指定范围，如果是100的话就是0-100之间随机
        System.out.println("无范围"+randnum+"有范围"+randreal);
    }

}
