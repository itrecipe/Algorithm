class Solution {
    public int solution(int num, int n) {
    
        return (num % n == 0) ? 1 : 0;
    }
}

/*
        if(num % n == 0) {
            return 1; //n이 2의 배수이면 1을 리턴
        } else {
            return 0; //n이 2의 배수가 아니면 0을 리턴
        }
        */
        