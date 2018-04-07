package com.tencent;

import java.util.Scanner;

/**
 * 回文串问题
 *
 * 给定一个字符串s，你可以从中删除一些字符，使得剩下的串是一个回文串。如何删除才能是的回文串最长呢？
 *
 * 输出需要删除的字符个数。
 */
public class palstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();
            char[] chr = str.toCharArray();
            int amount = func(chr,0,chr.length-1);
            System.out.println(amount);
        }
    }
    public static int func(char[] chr,int start,int end){
        if (start>=end){
            return 0;
        }
        int res = 0;
        if (chr[start] == chr[end]){
            res = func(chr,start+1,end-1);
        }else{
            res = Math.min(func(chr,start,end-1),func(chr,start+1,end))+1;
        }
        return res;
    }
}
