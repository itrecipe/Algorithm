class Solution {
    public int solution(int a, int b) {
        String str1 = String.valueOf(a) + String.valueOf(b); //주어진 정수 값 a와 b를 문자열로 변환한 후 이어붙인다.
        String str2 = String.valueOf(b) + String.valueOf(a); //주어진 정수 값 b와 a를 문자열로 변환한 후 이어붙인다.
    
        int answer = Math.max(Integer.parseInt(str1), Integer.parseInt(str2));
        /* Integer.parseInt(str1), Integer.parseInt(str2)를 사용하여 문자열을 정수로 변환하고,
           Math.max() 메서드를 활용하여 두 값을 비교하여 더 큰 값을 answer에 저장한다.
        */
        
        return answer; //마지막으로 더 큰 값을 반환한다.
    }
}