package com.itheima.demo3.logicaloperator;

public class logicaloperatorDemo3 {
    public static void main(String[] args) {

        //1.&& 且
        //&&的运行结果和&结果是一样的
        //表示两边都为真,结果就为真,只要一边有假,结果就为假
        System.out.println(true && true);
        System.out.println(false && true);
        System.out.println(true && false);
        System.out.println(false && false);

        System.out.println("----------");

        //2.||
        //运行结果和|是一样的
        //表示两边都是假,结果才为假,一边有真,结果就为真
        System.out.println(true ||true);
        System.out.println(false || true);
        System.out.println(true || false);
        System.out.println(false || false);

        System.out.println("----------");

        //3.短路逻辑运算符
        //简单理解:当左边的表达式能确定最终的运算结果,右边的就不会参与运算
        int a = 10;
        int b = 10;

        boolean result = ++a < 5  &&  ++ b < 22; //因为++a是11,11<5是错的,所以左边的可以确定最终的结果
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);
    }
}
