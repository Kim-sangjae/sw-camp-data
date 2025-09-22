package com.sangjae.section03.stack;

import java.util.Stack;

public class Practice1 {

    public String solution(String input){
        Stack<Character> stack = new Stack<>();

        for(int i = 0 ; i < input.length(); i++){
           char[] a =  input.toCharArray();
           if(a[i]=='('){
               stack.push(a[i]);
           }else{
              if(stack.isEmpty()) return "NO";

              stack.pop();
           }
        }

        if(!stack.isEmpty()) return "NO";

        return "YES";
    }

}
