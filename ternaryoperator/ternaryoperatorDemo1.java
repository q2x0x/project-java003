package com.itheima.demo3.ternaryoperator;

public class ternaryoperatorDemo1 {
    public static void main(String[] args) {

        //需求:使用三元运算符,获取两个较大值

        //分析:
        //1.定义两个变量记录两个整数
        int number1 = 60;
        int number2 = 20;

        //2.使用三元运算符取两个整数的较大值

        //格式: 关系表达式? 表达式1 : 表达式2;

        //整个三元运算符的结果必须要使用

        int max = number1 > number2 ? number1 : number2; //如果值为true,则结果就是表达式前面的,否,则后者
        System.out.println(max);

        System.out.println(number1 > number2 ? number1 : number2);
        //这个打印是将两个数字都输入判断出来的那个,
        //去掉的话,就只输出判断完的那一个数字!

    }
}
