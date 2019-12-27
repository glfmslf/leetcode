package com.youyu.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 三数之和
 * @author: youyu  工号：1552
 * CREATED_DATE: 2019/5/30 11:34
 */
public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length;i++){
            if (nums[i] > 0){
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int temp = 0 - nums[i];
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r){
                List<Integer> tempList = new ArrayList<Integer>();
                if (nums[l] + nums[r] == temp){
                    tempList.add(nums[i]);
                    tempList.add(nums[l]);
                    tempList.add(nums[r]);
                    result.add(tempList);
                    while (r > l && nums[l + 1] == nums[l]){
                        l++;
                    }
                    while (r > l && nums[r] == nums[r - 1]){
                        r--;
                    }
                    l++;
                    r--;
                }else if (nums[l] + nums[r] > temp){
                    r--;
                }else {
                    l++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> result = threeSum(nums);
        for (List<Integer> temp : result){
            for (int i : temp){
                System.out.println(i);
            }
        }
    }
}
