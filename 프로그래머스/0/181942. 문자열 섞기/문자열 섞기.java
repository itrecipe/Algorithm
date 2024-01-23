class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
        /* 이 반복문은 str1과 str2의 각 문자를 번갈아가며 answer에 추가하는 역할을 하는 반복문이다.
          - 초기값 0부터 시작해서 i가 str1문자열의 길이보다 작을때까지 반복한다. 
          - str1 문자열의 길이 (0, 1, 2, 3, 4) 5보다 작을때까지 수행한다.
          - 이유는? 0부터 4까지 세면 총 5개 이므로 총 5회 반복하는 것이기 때문이다. */
        for(int i = 0; i < str1.length(); i++) {
            
            /* substring() 메서드를 사용하여 start Index : i 부터 시작해서,
               End Index 직전 (-1)까지의 문자열을 잘라낸다.
            
            - 0 ~ 4 까지 총 5회 반복하며, 자른 문자열을 answer에 1개씩 대입한다. */
            answer += str1.substring(i, (i + 1)); 
            answer += str2.substring(i, (i + 1));
            
            //디버깅 출력문 (출력이 되는 과정을 상세히 보기 위해 작성했다.)
            System.out.println("i = " + i);
            System.out.println("i + 1 = " + (i + 1));
            System.out.println();
            System.out.println("str1.substring(i, (i + 1)) : " + str1.substring(i, (i + 1)));
            System.out.println("str2.substring(i, (i + 1)) : " + str2.substring(i, (i + 1)));
            System.out.println();
            System.out.println("answer : " + answer);
            System.out.println();

        }
        return answer;
    }
}