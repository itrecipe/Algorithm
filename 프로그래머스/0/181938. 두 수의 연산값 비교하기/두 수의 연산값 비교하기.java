class Solution {
    public int solution(int a, int b) {
        // 1. a + b 연산
        int ab = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        /* 해당 부분은 두 정수 a와 b를 문자열로 변환한 후
           이어붙인 결과를 정수로 다시 변환 하는 역할을 수행 한다.
           먼저 String.valueOf(a) 와 String.valueOf(b)는 각각
           정수 a와 b를 문자열로 변환 시킨 후 정수로 다시 변환하여 ab 변수에 값을 대입(저장) 한다.
        */
        
        // 2. 2 * a * b 연산
        int two_multyply_AB = 2 * a * b;
        /* 해당 부분에서는 2와 정수 a, b를 곱한 결과를 two_multyply_AB 변수에 값을 대입(저장) 한다. 
           ex) 2 * a(2) * b(91) = 364 이러한 형태로 연산을 수행한 결과를 대입(저장) 한다.        
        */

        // 3. 두 값 중 더 큰 값을 반환
        return Math.max(ab, two_multyply_AB);
        /* 해당 부분은 ab와 two_multyply_AB 중에서 더 큰값을 반환 해주며 Math.max() 함수는 두개의 정수를 입력                      받아 더 큰 값을 return(반환) 한다.
        */

    }
}