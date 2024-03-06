import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        for(int i=0; i < n; i++) {
            System.out.print(str);
        }

/* case-2
        0부터 4까지 5번 반복
        for(int i = 0; i < 5; i++) {
            System.out.print("string");
        }
        
print는 줄바꿈을 수행해주지 않음, println()처럼 줄바꿈 기능이 없음

*/
    
    }
}