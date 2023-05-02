package com.imooc.operator;

public class MathDemo {
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 5;
        int result;  // 存放结果
        // 加法
        result = num1 + num2;
        System.out.println(num1 + "+" + num2 + "=" + result);
        // 字符串连接
        System.out.println("" + num1 + num2);  // 带了字符串的就进行字符串连接
        System.out.println(num1 + num2);  // 没带字符的就进行数值运算
        // 减法
        result = num1 = num2;
        System.out.println(num1 + "-" + num2 + "=" + result);
        // 乘法
        result = num1 * num2;
        System.out.println(num1 + "*" + num2 + "=" + result);
        // 除法
        result = num1 / num2;
        System.out.println(num1 + "/" + num2 + "=" + result);
        // 分子分母都是整型时,结果为整型后的结果
        System.out.println(13 / 5);
        // 字符串与数值
        System.out.println("13.0/5" + 13.0/5);
        // 求余数
        result = 13 % num2;
        System.out.println("13 % " + num2 + "=" + result);
        System.out.println("13.5 % 5 = " + (13.5 % 5));
    }
}
