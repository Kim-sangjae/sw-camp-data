package com.sangjae.section03.stack;

import java.util.Stack;

public class Practice2 {
    public int solution(String input) {
        Stack<Character> stack = new Stack<>();
        int stick = 0;
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if(c=='('){
                stack.push(c);
                count+=1;
            } else {
                stack.pop();
                count-=1;
                if (i > 0 && input.charAt(i - 1) == '(') {
                    stick += count;
                } else {
                    stick += 1;
                }

            }


        }

        return stick;
    }
}
