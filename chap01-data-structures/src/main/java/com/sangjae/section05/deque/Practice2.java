package com.sangjae.section05.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Practice2 {
    public String solution(String command, Integer[] array) {
        Deque<Integer> dequeArray = new ArrayDeque<>();
        char[] arrayCommand = command.toCharArray();


        for (Integer integer : array) {
            dequeArray.addLast(integer);
        }

        int index = 0;

        Deque<Integer> temp;

        while (index < arrayCommand.length) {
            switch (arrayCommand[index]) {
                case 'R': {
//                    while (!dequeArray.isEmpty()) {
//                        dequeArray.addLast(dequeArray.removeLast());
//                    }

                    temp = new ArrayDeque<>();

                    while (!dequeArray.isEmpty()) {
                        temp.addLast(dequeArray.removeLast());
                    }

                    dequeArray = temp;
                    index++;
                } break;

                case 'D': {

                    if (dequeArray.isEmpty()) {
                        return "error";
                    }

                    dequeArray.removeFirst();
                    index++;
                } break;
            }
        }

        System.out.println("deque : " + dequeArray.toString().trim());


        StringBuilder result = new StringBuilder("[");

        while (!dequeArray.isEmpty()) {
            result.append( dequeArray.removeFirst());

            if (!dequeArray.isEmpty()) {
                result.append(",");
            }

        }
        result.append("]");

        System.out.println("결과값: " + result);
        return result.toString();
//        return dequeArray.toString().trim() ;
    }
}