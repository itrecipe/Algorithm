import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        //결과 리턴 받을 변수 초기화
        String result = "";
        
        //입력 받는 문자열을 한글자씩 뽑아내서 대문자 -> 소문자로, 소문자 -> 대문자로, 소문자는 -> 대문자로 변환하는 반복문을 작성
        for(int i=0; i < a.length(); i++) {
            char c = a.charAt(i);
            
            if(Character.isLowerCase(c)) {
                //래퍼 클래스 사용 Character 
                result += Character.toUpperCase(c); //소문자를 대문자로 변환
            } else {
                result += Character.toLowerCase(c); //대문자를 소문자로 변환
            }
        }
        System.out.println(result);
    }
}