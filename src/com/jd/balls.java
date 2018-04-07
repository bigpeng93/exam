package com.jd;

import java.util.Scanner;

/**
 * 抛小球
 *
 * 小东和三个朋友一起在楼上抛小球，他们站在楼房的不同层，假设小东站的楼层距离地面N米，
 * 球从他手里自由落下，每次落地后反跳回上次下落高度的一半，并以此类推知道全部落到地面不跳，
 * 求4个小球一共经过了多少米？
 * (数字都为整数) 给定四个整数A,B,C,D，请返回所求结果。
 */
public class balls {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        System.out.println(func1(a)+func1(b)+func1(c)+func1(d));
        System.out.println(func2(a)+func2(b)+func2(c)+func2(d));
        System.out.println(func3(a)+func3(b)+func3(c)+func3(d));
    }
    //方法一：
    //等比数列求和：x*{1+2*[1/2+1/4+...+(1/2)^n]} --> 3*x
    public static int func1(int a){
        return 3*a;
    }

    //方法二：
    //递归??
    public static int func2(int a){
        if (a==1){
            return 2;
        }
        if(a%2==0){
            return func2(a/2)+a;
        }else
            return func2((a+1)/2)+a;
    }

    //方法三：迭代
    public static int func3(int a){
        int s = a;
        while (a>0){
            if (a%2==0){
                s += a;
            }else {
                s+=((a+ 1) / 2) * 2;
            }
            a /=2;
        }
        return s;
    }
}
