package com.tencent;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 绝对值问题
 *
 * 有n个数，两两组成二元组，差的绝对值最小的有多少对呢？差的绝对值最大有多少对呢？
 *
 * 输入描述:
 *  输入包含多组测试数据。 对于每组测试数据：
 *  N - 本组测试数据有n个数
 *  a1,a2...an - 需要计算的数据
 *  保证: 1<=N<=100000,0<=ai<=INT_MAX.
 *
 * 输出描述:
 *  对于每组数据，输出两个数，第一个数表示差最小的对数，第二个数表示差最大的对数。
 *
 * 输入例子:
 *  6
 *  45 12 45 32 5 6
 * 输出例子:
 *  1 2
 */
public class absValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int num = sc.nextInt();
            int[] nums = new int[num];
            for (int i = 0 ;i<num;i++){
                nums[i] = sc.nextInt();
            }
            func(num,nums);
        }
    }
    public static void func(int num,int[] nums){
        Arrays.sort(nums);
        int minAbsVal=Integer.MAX_VALUE;
        int minAbsNum=0;
        int maxAbsVal=nums[num-1]-nums[0];
        int maxAbsNum=0;
        int p1= 0,p2=num;

        //求差的最大绝对值
        if (maxAbsVal==0){
            maxAbsNum = (num-1)*num/2;
        }else {
            int minValNum = 1;
            int maxValNum = 1;
            for (int i=1;i<num;i++){
                if (nums[i-1]!=nums[i]){
                    break;
                }
                minValNum++;
            }
            for (int j= num-1;j>=0;j--){
                if (nums[j-1]!=nums[j]){
                    break;
                }
                maxValNum++;
            }
            maxAbsNum = minValNum*maxValNum;
        }
        //求差的最小绝对值
        for(int i =1;i<num;i++){
            int res = Math.abs(nums[i]-nums[i-1]);
            if (res == minAbsVal){
                minAbsNum++;
            }else if (res<minAbsVal){
                minAbsVal=res;
                minAbsNum=1;
            }
        }
        System.out.println(minAbsNum+" "+maxAbsNum);
    }
}
