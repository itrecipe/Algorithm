class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        answer = my_string.substring(0, s); //He
        
        System.out.println("my_string 값 확인 : " + my_string);
        System.out.println("my_string을 substring()로 자른 값 확인 : " + my_string.substring(0, s)); 
        //substring() 메서드로 0번지 인덱스부터 s-1번지 인덱스까지 잘라서 반환 s 인자값은 2이며 2-1까지 길이를 계산하여 잘라줌
        
        answer += overwrite_string;
        //덮어쓸 값을 answer 변수에 대입하기
        System.out.println("overwrite_string으로 덮어쓸 값을 확인 : " + overwrite_string);
        
        answer += my_string.substring(s + overwrite_string.length());
        //start index를 활용하여 시작 인덱스부터 끝까지 잘라오는 값을 덮어쓸 값에 길이를 구해 인덱스 번호를 의미하는 s변수에 더해준다.
        System.out.println("overwrite_string의 길이를 구한 값 확인 : " + overwrite_string.length());
        
        return answer;
    }
}