class Solution {
    //주어진 문자열 배열 "arr"의 각 원소들을 순서대로 이어 붙여서 반환하는 함수를 작성
    public String solution(String[] arr) {
        String answer = ""; //결과를 저장할 빈 문자열 "answer"을 초기화 한다.
        
        /* 배열 "arr"을 향상된 for문(Enhanced for)을 이용하여 순회(반복) 한다.
           각 반복에서 현재 원소를 "str" 이라는 변수에 할당한다.
        */
        for(String str : arr) {
           answer += str; 
           /* 현재 원소 "str"을 결과를 받을 "answer" 변수에 이어 붙인다. (=대입한다)
              해당 부분이 반복되면서 모든 원소들이 이어져 최종적인 문자열이 생성된다.
           */

           System.out.print(str); //디버깅 과정 (현재 코드의 흐름을 파악하기 위해 작성함, 실제 반환값에는 영향을 주지 않음)
        }
        
        return answer; //반복문을 통해 이어 붙인 문자열을 return(반환) 한다.
    }
}