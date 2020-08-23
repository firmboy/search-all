package com.playboy.leetcode.stack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Stack;

/**
 * @author playboy
 * @create 2020-08-23 2:57 下午
 * @description
 * @serviceLogic https://leetcode-cn.com/problems/valid-parentheses/
 **/
public class StackTest3 {
    private static final Logger log = LoggerFactory.getLogger(StackTest3.class);


    public static boolean isValid(String s) {
        Stack<Character> characters = new Stack<>();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (aChar == '(' || aChar == '{' || aChar == '[') {
                characters.add(aChar);
            } else {
                if (characters.empty()) {
                    return false;
                }
                Character pop = characters.pop();
                if (!((aChar == ')' && pop == '(') || (aChar == ']' && pop == '[') || (aChar == '}' && pop == '{'))) {
                    return false;
                }
            }
        }
        if (!characters.empty()) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValid("((())){}[{()}"));
    }

}
