package com.zym.sort;

import java.util.Arrays;

/**
 * @author zhouyumeng
 * @date 2022/03/02
 **/
public class RadixSort {

    public static void main(String[] args) {
        //假设是五位的电话号码
        int[] nums = {80912, 45678, 23421, 25123, 53211};
        RadixSort r = new RadixSort();
        r.radixSort(nums);
        System.out.println(Arrays.toString(nums));
    }



    public void radixSort(int[] nums) {
        //时间复杂度是o(5*n)，在o(n)的时间复杂度内完成排序，但是使用有限，对被排序的数据有要求，应用于电话号码排序、牛津字典单词排序
        for (int j = 0; j < 5; j++) {
            //大小为10的中间数组是考虑0~9
            int[] c = new int[10];
            for (int i = 0; i < nums.length; i++) {
                int radix = (nums[i] / (int) Math.pow(10, j)) % 10;
                c[radix]++;
            }
            for (int i = 1; i < c.length; i++) {
                c[i] = c[i - 1] + c[i];
            }
            int[] temp = new int[nums.length];
            for (int i = nums.length - 1; i >= 0; i--) {
                int radix = (nums[i] / (int) Math.pow(10, j)) % 10;
                int index = c[radix] - 1;
                temp[index] = nums[i];
                c[radix]--;
            }
            System.out.println(Arrays.toString(temp));
            //临时数组拷贝到原数组，完成排序
            System.arraycopy(temp, 0, nums, 0, nums.length);
        }
    }

}
