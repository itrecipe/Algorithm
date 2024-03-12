class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
        for(int i = 0; i < str1.length(); i++) {
            answer += str1.substring(i, i + 1);
            answer += str2.substring(i, i + 1);

             /* substring end index 부분에 i + 1을 해준 이유는
               기본적으로 substring() 메소드의 end index는 시작
			   인덱스부터 끝인덱스-1을 수행하기 때문에 i + 1을 해주었다.
            */
            
        }
        
        return answer;
                
        }
    }