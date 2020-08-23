package com.playboy.leetcode.hash;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author playboy
 * @create 2020-08-23 1:54 下午
 * @description
 * @serviceLogic https://leetcode-cn.com/problems/distribute-candies/
 **/
public class HashTest1 {
    private static final Logger log = LoggerFactory.getLogger(HashTest1.class);


    public static int distributeCandies(int[] candies) {
        Map<Integer, Integer> map = new HashMap();
        int count = 0;
        int length = candies.length / 2;
        for (int candy : candies) {
            Integer put = map.getOrDefault(candy, 0);
            if (put == 0) {
                count++;
                put++;
                map.put(candy, put);
            }
            if (count >= length) {
                break;
            }
        }

        return map.size();
    }


    public static void main(String[] args) {
        System.out.println(distributeCandies(new int[]{1, 1, 2, 3, 3, 4}));
    }
}
