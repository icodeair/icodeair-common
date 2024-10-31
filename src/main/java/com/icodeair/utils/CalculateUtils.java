package com.icodeair.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.LinkedList;
import java.util.Stack;

public class CalculateUtils {
    public static final String s2 = "100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+0.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*2.0+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+100.0/210.0*2.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*-1.0*0.2+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*2.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*2.0+100.0/210.0*1.0+100.0/210.0*2.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*2.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*-1.0*0.2+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+0.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*-1.0*0.2+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+100.0/210.0*-1.0*0.2+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+0.0";
    public static final String s1 = "100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*-1.0*0.2+100.0/210.0*-1.0*0.2+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*-1.0*0.2+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+100.0/210.0*2.0+100.0/210.0*-1.0*0.2+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*2.0+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+100.0/210.0*2.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*2.0+100.0/210.0*1.0+100.0/210.0*-1.0*0.2+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*-1.0*0.2+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*-1.0*0.2+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+100.0/210.0*-1.0*0.2+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*-1.0*0.2+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*-1.0*0.2+100.0/210.0*-1.0*0.2+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+0.0+0.0+100.0/210.0*1.0+100.0/210.0*-1.0*0.2+0.0+100.0/210.0*2.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*-1.0*0.2+100.0/210.0*2.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*2.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*2.0+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+100.0/210.0*2.0+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*2.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*0.0+100.0/210.0*0.0+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+0.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+0.0+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+100.0/210.0*-1.0*0.2+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*1.0+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+100.0/210.0*-1.0*0.2+100.0/210.0*1.0+100.0/210.0*1.0+0.0";
    public static final String s3 = "100.0/209.0*1.0+0.0+0.0+100.0/209.0*1.0+0+0+0+0+0+100.0/209.0*1.0+0.0+100.0/209.0*1.0+100.0/209.0*0.0+0.0+0+0+0+0+0+0.0+0.0+0.0+100.0/209.0*1.0+100.0/209.0*1.0+0.0+100.0/209.0*1.0+0.0+0.0+0.0+0.0+100.0/209.0*1.0+100.0/209.0*-1.0*0.2+0.0+100.0/209.0*1.0+100.0/209.0*1.0+100.0/209.0*1.0+0.0+100.0/209.0*1.0+0+0.0+100.0/209.0*1.0+0.0+0.0+100.0/209.0*1.0+100.0/209.0*1.0+0.0+100.0/209.0*1.0+0.0+100.0/209.0*1.0+0.0+100.0/209.0*1.0+100.0/209.0*1.0+0.0+0+0+0+0+0+100.0/209.0*1.0+100.0/209.0*1.0+100.0/209.0*1.0+0.0+100.0/209.0*1.0+0.0+0.0+0.0+0.0+0.0+0.0+100.0/209.0*1.0+0.0+100.0/209.0*1.0+0.0+100.0/209.0*1.0+0.0+0.0+100.0/209.0*1.0+100.0/209.0*1.0+100.0/209.0*1.0+0.0+0.0+100.0/209.0*1.0";
    public static void main(String[] args) throws Exception {
        System.out.println(calculate(s3, 4));
    }

    /**
     * 只支持加减乘除运算
     * 1. 将中缀表达式转后缀表达式
     * 2. 根据后缀表达式进行计算
     */
    public static BigDecimal calculate(String mathStr, int scale) {
        if (mathStr == null || mathStr.length() == 0) {
            return null;
        }
        LinkedList<String> postfixList = getPostfix(mathStr, scale);
        return doCalculate(postfixList, scale);
    }

    /**
     * 根据后缀表达式，得到计算结果
     */
    private static BigDecimal doCalculate(LinkedList<String> postfixList, int scale) {
        // 操作数栈
        Stack<BigDecimal> numStack = new Stack<>();
        while (!postfixList.isEmpty()) {
            String item = postfixList.removeFirst();
            BigDecimal a, b;
            switch (item) {
                case "+":
                    a = numStack.pop();
                    b = numStack.pop();
                    numStack.push(b.add(a));
                    break;
                case "-":
                    a = numStack.pop();
                    b = numStack.pop();
                    numStack.push(b.subtract(a));
                    break;
                case "*":
                    a = numStack.pop();
                    b = numStack.pop();
                    numStack.push(b.multiply(a));
                    break;
                case "/":
                    a = numStack.pop();
                    b = numStack.pop();
                    numStack.push(b.divide(a, scale + 8, RoundingMode.HALF_UP));
                    break;
                default:
                    numStack.push(new BigDecimal(item));
                    break;
            }
        }
        return numStack.pop().setScale(scale, BigDecimal.ROUND_HALF_UP);
    }

    /**
     * 将中缀表达式，转换为后缀表达式，支持多位数、小数
     *
     * @author Sumkor
     * @since 2021/7/14
     */
    private static LinkedList<String> getPostfix(String mathStr, int scale) {
        // 后缀表达式链
        LinkedList<String> postfixList = new LinkedList<>();
        // 运算符栈
        Stack<Character> optStack = new Stack<>();
        // 多位数链
        LinkedList<Character> multiDigitList = new LinkedList<>();
        char[] arr = mathStr.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if((i == 0 && '-' == c) || (i > 0 && isSymbols(arr[i-1]) && '-' == c)) {
                multiDigitList.addLast(c);
                continue;
            }
            if (Character.isDigit(c) || '.' == c) {
                multiDigitList.addLast(c);
            } else {
                // 处理当前的运算符之前，先处理多位数链中暂存的数据
                if (!multiDigitList.isEmpty()) {
                    StringBuilder temp = new StringBuilder();
                    while (!multiDigitList.isEmpty()) {
                        temp.append(multiDigitList.removeFirst());
                    }
                    postfixList.addLast(temp.toString());
                }
            }
            // 如果当前字符是左括号，将其压入运算符栈
            if ('(' == c) {
                optStack.push(c);
            } else if (isSymbols(c)) { // 如果当前字符为运算符
                while (!optStack.isEmpty()) {
                    char stackTop = optStack.pop();
                    // 若当前运算符的优先级高于栈顶元素，则一起入栈
                    if (compare(c, stackTop)) {
                        optStack.push(stackTop);
                        break;
                    }
                    // 否则，弹出栈顶运算符到后缀表达式，继续下一次循环
                    else {
                        postfixList.addLast(String.valueOf(stackTop));
                    }
                }
                optStack.push(c);
            } else if (c == ')') {  // 如果当前字符是右括号，反复将运算符栈顶元素弹出到后缀表达式，直到栈顶元素是左括号（为止，并将左括号从栈中弹出丢弃。
                while (!optStack.isEmpty()) {
                    char stackTop = optStack.pop();
                    if (stackTop != '(') {
                        postfixList.addLast(String.valueOf(stackTop));
                    } else {
                        break;
                    }
                }
            }
        }
        // 遍历结束时，若多位数链中具有数据，说明公式是以数字结尾
        if (!multiDigitList.isEmpty()) {
            StringBuilder temp = new StringBuilder();
            while (!multiDigitList.isEmpty()) {
                temp.append(multiDigitList.removeFirst());
            }
            postfixList.addLast(temp.toString());
        }
        // 遍历结束时，运算符栈若有数据，说明是由括号所致，需要补回去
        while (!optStack.isEmpty()) {
            postfixList.addLast(String.valueOf(optStack.pop()));
        }
        return postfixList;
    }

    /**
     * 是否是公式符号
     * @param c
     * @return
     */
    private static boolean isSymbols(char c) {
        return '+' == c || '-' == c || '*' == c || '/' == c;
    }

    /**
     * 比较优先级
     * 返回 true 表示 curr 优先级大于 stackTop
     */
    private static boolean compare(char curr, char stackTop) {
        // 左括号会直接入栈，这里是其他运算符与栈顶左括号对比
        if (stackTop == '(') {
            return true;
        }
        // 乘除法的优先级大于加减法
        if (curr == '*' || curr == '/') {
            return stackTop == '+' || stackTop == '-';
        }
        // 运算符优先级相同时，先入栈的优先级更高
        return false;
    }
}