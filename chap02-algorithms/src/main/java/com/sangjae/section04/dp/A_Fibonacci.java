package com.sangjae.section04.dp;

public class A_Fibonacci {

    public static int getFibonacciNumber(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;

        return getFibonacciNumber(n-1)+ getFibonacciNumber(n-2);
    }


    // DP - Top down 방식
    // 메모리제이션을 위해 새로운 빈 공간을 만들어둔다
    static int[] dp = new int[50];
    public static int getFibonacciNumberDP(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;

        // 1확인 : 함수 호출 전 해당 입력의 결과가 이미 저장되어있는지 확인
        if(dp[n] == 0){
            // 2. 저장  : 0 인상태이면 계산되어있지 않은것
            dp[n] = getFibonacciNumberDP(n-1) + getFibonacciNumberDP(n-2);
        }

        // 3. 재활용 : 저장된 결과가 있다면 다시계산 x 저장 된 값 반환
        return dp[n]; }



    // DP - Bottom up 방식
    // 타뷸레이션 : 문제를 작은 문제부터 차례로 저장

    public static int getFibonacciNumberIter(int n) {
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;

        if(n == 0) return arr[0];
        else if (n == 1) return arr[1];
        else{
            for (int i = 2; i <= n; i++) arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
    }

}
