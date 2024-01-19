import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n % 2 == 0) { 
            //n을 2로 나눈 나머지가 0이면 짝수, 아니면 홀수 라고 판별 해줄 조건문, 조건식이 true인 경우 수행한다.
            System.out.println(n + " " + "is even"); //나머지가 없으면 (0이면) 짝수
        } else { //조건식이 flase일때 수행되는 문장
            System.out.println(n + " " + "is odd"); //나머지가 있으면 (1이거나 그 이상이면) 홀수
        }
    }
}