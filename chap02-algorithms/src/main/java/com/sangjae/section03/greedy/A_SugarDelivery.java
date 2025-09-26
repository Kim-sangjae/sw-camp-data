package com.sangjae.section03.greedy;

// 설탕 배달문제
// 매 단계마다 최선의 선택이라 생각 되는것을 반복
public class A_SugarDelivery {

    public static int solution(int n){// 배달해야 되는 설탕의 무게

        int count = 0; // 봉지의 갯수

        while (true){

            // 5키로로 모두 배달할수 있다면??
            if(n%5 == 0){
                return n/5 + count;

            } else if(n == 0){
                // 3키로 봉지로만 해결
                return count;
            }  else if(n<5) {
                // 3과 5로 해결이 안되는 상황
                return -1;
            }

            // 5키로로 나누어 떨어지지 않으면 3kg 사용해보기
            n -= 3;
            count++;



        }

    }

}
