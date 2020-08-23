package com.playboy.leetcode.recursive;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author playboy
 * @create 2020-07-08 8:52 上午
 * @description
 * @serviceLogic
 **/
public class BracketsTest {
    private static final Logger log = LoggerFactory.getLogger(BracketsTest.class);

    int index = 0;

    public int scoreOfParentheses(String s) {
        //(()(()))
        char ch = s.charAt(index++);
        if (ch == '(') {
            ch = s.charAt(index++);
            if (ch == '(') {
                return 2 * scoreOfParentheses(s);
            } else {
                if (s.length() - index == 1) {
                    return 1;
                } else {
                    return 1 + scoreOfParentheses(s);
                }
            }
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        BracketsTest bracketsTest = new BracketsTest();
        int i = bracketsTest.scoreOfParentheses("(()(()))");
        System.out.println(i);
    }


}
