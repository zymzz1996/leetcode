package com.zym.sort;

import java.util.Arrays;

/**
 * @author zhouyumeng
 * @date 2022/03/02
 **/
public class CountingSort {

    public static void main(String[] args) {
        int[] nums = {2, 5, 3, 0, 2, 3, 0, 3};
        CountingSort countingSort = new CountingSort();
        countingSort.countingSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    /**
     * 桶排序，适用于外部排序，例如磁盘中有100G的数据，但是内存不够大，需要对100G的数据进行分桶，每次加载部分数据进入内存排序
     * 计数排序，对被排序的数据有要求，必须是非负整数，且数据的范围不能比数据量大很多，一般应用于高考成绩排名、用户年龄排名
     * @param nums
     */
    public void countingSort(int[] nums) {
        //找出数组中最大值
        int max = nums[0];
        for (int j : nums) {
            if (j > max) {
                max = j;
            }
        }
        //以最大值构建中间数组并初始化
        int[] c = new int[max + 1];
        //计数，中间数组每个索引位置的值代表小于等于该值的数据个数的总和
        for (int num : nums) {
            c[num]++;
        }
        for (int i = 1; i < c.length; i++) {
            c[i] = c[i - 1] + c[i];
        }
        //从后往前遍历nums，获取c中的值，c中元素的值代表该元素的顺序位置，从后往前遍历可以保证稳定性
        int[] temp = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            int index = c[nums[i]] - 1;
            temp[index] = nums[i];
            c[nums[i]]--;
        }
        //临时数组拷贝到原数组，完成排序
        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
        }
    }

}
