package com.itheima.demo3.comparisonoperator;

public class comparisonoperatorDemo1 {
    public static void main(String[] args) {

        //1.判断左右两边是否相等
        int a = 10;
        int b = 20;
        int c = 10;
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(b == c);

        System.out.println("---------");

        //!=判断左右两边是否不相等
        int d = 100;
        int e = 100;
        int f = 200;
        System.out.println(d!=e);
        System.out.println(d!=f);
        System.out.println(e!=f);
    }

}
