package com.itheima.demo3.logicaloperator;

public class logicaloperatorDemo1 {
    public static void main(String[] args) {

        //1.& 并且
        //两边都为真,结果才是真
        //快捷键:ctrl+d(向下复制一行)
        System.out.println(true & true);
        System.out.println(false & false);
        System.out.println(true & false);
        System.out.println(false & true);

        System.out.println("----------");

        //2.| 或者
        //两边都是假,结果才为假,只要有一个真,结果就为真
        //快捷键:Ctrl+F5(运行代码)
        System.out.println(true | true);
        System.out.println(false | false);
        System.out.println(true | false);
        System.out.println(false | true);






    }

}
