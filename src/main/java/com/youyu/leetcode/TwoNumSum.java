package com.youyu.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * leetcode两数之和
 * @author: youyu  工号：1552
 * CREATED_DATE: 2019/5/30 11:13
 */
public class TwoNumSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> params = new HashMap<Integer, Integer>();
        for (int i = 0;i < nums.length;i++){
            int temp = target - nums[i];
            if (params.containsKey(temp) && params.get(temp) != i){
                return new int[]{i,params.get(temp)};
            }
            params.put(nums[i],i);
        }
        throw new IllegalArgumentException("error");
    }

    public static void main(String[] args) {
        int[] nums ={2, 7, 11, 15};
        int target = 9;
        int[] a = twoSum(nums,target);
        for (int i = 0; i < a.length;i++){
            System.out.println(a[i]);
        }
    }
}
