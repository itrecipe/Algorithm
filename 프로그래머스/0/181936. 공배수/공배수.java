class Solution {
    public int solution(int number, int n, int m) {

        //삼항 연산자를 활용한 풀이
        return (number % n == 0 && number % m == 0) ? 1 : 0;
        
        //if 조건문을 활용한 풀이
        /*
        if(number % n == 0) {
            System.out.println("if : " + (number % n == 0));
            return 1;
            
        } else if(number % m == 0) {
            System.out.println("else if : " + (number % m == 0));
        }
        return 0;
        */
    }
}