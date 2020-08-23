package com.playboy.leetcode.recursive;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author playboy
 * @create 2020-07-06 7:20 下午
 * @description
 * @serviceLogic
 **/
public class BooleanTest {
    private static final Logger log = LoggerFactory.getLogger(BooleanTest.class);

    Integer index = 0;

    //index必须是全局变量，如果作为参数传递，会出现问题，因为java是值传递，在递归中对index的++不会反应到方法的结束后
    //消费掉的几个字符，'！'，'｜'，'&'，'（'，'）'，','这些字符都是在执行过程中被消耗掉，不能作为判断依据
    //多个表达式连续'与'或者'或'可以转换为开头增加一个 任何与true进行'与'运算不改变本来的结果，任何与false进行'或'运算不改变本来结果
    public boolean parseBoolExpr(String expression) {
        //递归的解题思路,|(&(t,f,t),!(t))
        char c = expression.charAt(index++);
        if (c == 't') return true;
        if (c == 'f') return false;
        if (c == '!') {
            index++;
            return !parseBoolExpr(expression);
        }
        boolean isAnd = c == '&' ? true : false;
        boolean ans = isAnd;
        index++;
        while (true) {
            if (isAnd) {
                ans &= parseBoolExpr(expression);
            } else {
                ans |= parseBoolExpr(expression);
            }
            char c1 = expression.charAt(index++);
            if (c1 == ')') {
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        BooleanTest booleanTest = new BooleanTest();
        boolean b = booleanTest.parseBoolExpr("|(&(t,t,t),!(t))");
        System.out.println(b);
    }

}
