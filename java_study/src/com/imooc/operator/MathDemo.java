package com.imooc.operator;

public class MathDemo {
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 5;
        int result;  // ��Ž��
        // �ӷ�
        result = num1 + num2;
        System.out.println(num1 + "+" + num2 + "=" + result);
        // �ַ�������
        System.out.println("" + num1 + num2);  // �����ַ����ľͽ����ַ�������
        System.out.println(num1 + num2);  // û���ַ��ľͽ�����ֵ����
        // ����
        result = num1 = num2;
        System.out.println(num1 + "-" + num2 + "=" + result);
        // �˷�
        result = num1 * num2;
        System.out.println(num1 + "*" + num2 + "=" + result);
        // ����
        result = num1 / num2;
        System.out.println(num1 + "/" + num2 + "=" + result);
        // ���ӷ�ĸ��������ʱ,���Ϊ���ͺ�Ľ��
        System.out.println(13 / 5);
        // �ַ�������ֵ
        System.out.println("13.0/5" + 13.0/5);
        // ������
        result = 13 % num2;
        System.out.println("13 % " + num2 + "=" + result);
        System.out.println("13.5 % 5 = " + (13.5 % 5));
    }
}
