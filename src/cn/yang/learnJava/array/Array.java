package cn.yang.learnJava.array;
/*
* 数组两种常见初始化方式
*   1、动态初始化：指定长度
*   2、静态初始化：指定内容
* 动态初始化数组格式：
*   数据类型[] 数组名称=new 数据类型[数组长度];
*静态初始化数组基本格式：
*   数据类型[] 数组名称=new 数据类型[]{元素1，元素2，....};
*   省略格式：
*   数据类型[] 数组名称={元素1，元素2，....};
* 注意：
*   静态初始化虽然没有直接定义长度，但根据大括号里的元素数量，可以推算出来
* */
public class Array {
    public static void main(String[] args) {
        /*
        *         int[] arr=new int[10];//动态初始化
        int[] arr_1=new int[]{1,2,3};//静态初始化基本格式
        int[] arr_2={1,2,3};//静态初始化省略格式
        * */
        int[] arr=new int[10];
        for (int a=0;a<10;a++)
            arr[a]=a;

        for(int a=0;a<arr.length/2;a++)
        {
            int temp=arr[a];
            arr[a]=arr[arr.length-1-a];
            arr[arr.length-1-a]=temp;
        }
        for (int a=0;a<arr.length;a++)
            System.out.println(arr[a]);
    }
    //数组元素的反转
}
