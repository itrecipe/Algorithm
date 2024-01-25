class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
        
        //k번 반복을 수행하는 반복문
        for(int i = 0; i < k; i++) {
            answer += my_string; // "answer"에 "my_string" 값을 추가(대입)

            //System.out.print(my_string);
        }
        return answer; //my_string 결과 값을 반환
    }
}