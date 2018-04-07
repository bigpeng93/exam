package com.tencent;

import java.util.Scanner;

/**
 * 移动字符
 *
 * 小Q最近遇到了一个问题：把一个字符串的大写字母放到字符串的后面，各个字符串的相对位置不变，且不能申请额外的空间
 * 你能帮帮小Q吗？
 *
 */
public class moveChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();
            char[] chr = str.toCharArray();
            System.out.println(move(chr));
        }
    }
    public static String move(char[] chr){
        int p1 = chr.length-1;
        int p2 = chr.length-1;
        while (p1>0 && p2>0){
            while (p1>=0 && chr[p1]>'a' && chr[p1]<'z'){
                p1--;
            }
            int index = p1;
            while(index>=0&&index!=p2){
                char t = chr[index];
                chr[index] = chr[index+1];
                chr[index+1] = t;
                index++;
            }
            p1--;
            p2--;
        }
        return String.valueOf(chr);
    }
}
