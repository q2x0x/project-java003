package com.itheima.demo3.logicaloperator;

public class logicaloperatorDemo2 {
    public static void main(String[] args) {

        //1.^ 异或
        //相同为false,不同为true
        //用的非常少~
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        System.out.println("----------");

        //2.逻辑非,取反

        //总结:逻辑非,取反,只能用true和false;

        //取反的感叹号不要多写,要么只写一次,要么不写
        //多写的话,又会在此基础上继续取反
        System.out.println(!true);
        System.out.println(!false);


    }
}
