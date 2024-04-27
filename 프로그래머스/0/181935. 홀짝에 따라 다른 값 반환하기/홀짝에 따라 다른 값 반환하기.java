class Solution {
    public int solution(int n) {
        int answer = 0; //결과를 저장할 변수

        //n이 홀수인 경우
        if(n % 2 != 0) {
            for(int i = 1; i <= n; i += 2) { //1부터 n까지 홀수만 순회한다.
                answer += i; //각 홀수를 answer에 더한다.
            }
          //n이 짝수일 경우
        } else { 
            for(int i = 2; i <= n; i += 2) { //2부터 n까지 짝수만 순회한다.
                answer += Math.pow(i, 2); //각 짝수의 제곱을 answer에 더한다.
            }
        }
        
        return answer; //최종 결과값을 반환한다.
    }
}