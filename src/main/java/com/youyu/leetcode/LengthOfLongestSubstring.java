package com.youyu.leetcode;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 示例 1:
 *
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 *
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 *
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * @author: youyu  工号：1552
 * CREATED_DATE: 2019/6/5 17:48
 */
public class LengthOfLongestSubstring {

    public static void main(String[] args) {
//        String str = "[{name:\"身份证\",value:1},{name:\"军官证\",value:2},{name:\"护照\",value:3},{name:\"回乡证\",value:4},{name:\"台胞证\",value:5},{name:\"警官证\",value:6},{name:\"士兵证\",value:7},{name:\"其它\",value:99}]";
//        List<Map> mapList = JSON.parseArray(str, Map.class);
//        for (Map map : mapList) {
//            System.out.println(map.get("name") + "   " + map.get("value"));
//        }
//        System.out.println("*".contains(null));

        String pattern = "\\d{11}";

        System.out.println("176887089512".matches(pattern));
        //        Map map = new HashMap();
//        map.put("value", 1);
//        if (map.get("value") == 1) {
//            System.out.println(1);
//        String s = "123456789";
//        String reg = "(\\w{4})(\\w+)(\\w{4})";
//        int i = s.length() - 8;
//        StringBuffer stringBuffer = new StringBuffer();
//        for (int j = 0; j < i; j++) {
//            stringBuffer.append("*");
//        }
//        System.out.println(s.replaceAll(reg,"$1" + stringBuffer.toString() + "$3"));
//        System.out.println(StringUtils.overlay(s, "****", 4, s.length() - 4));
//        Map<String, Object> map = new HashMap<>();
//        map.put("sss", null);
//        System.out.println(map.get("sss"));

//        List<String> list = new ArrayList<>();
//        list.add("ss");
//        list.add("sss");
//        System.out.println(list.contains(""));
    }
}
