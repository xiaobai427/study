package com.imooc;

public class FloatDemo {
    public static void main(String[] args){
        // 定义一个单精度浮点型变量，存放1234.328
        float f = 123.328f;  // 需要在后面加f
        System.out.println("f="+f);
        // 定义一个双精度浮点型变量，存放5623.456
        double d = 5623.465;
        System.out.println("d="+d);
        // 存放整型
        double d1 = 123;  // 表示数据范围是最大的
        System.out.println("d1="+d1);  // 将整型赋值给浮点型
        // 变量间的赋值
        double d2 = d;
        System.out.println("d2="+d2);
    }
}
