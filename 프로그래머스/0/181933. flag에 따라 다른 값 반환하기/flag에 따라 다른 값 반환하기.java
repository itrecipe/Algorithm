class Solution {
    public int solution(int a, int b, boolean flag) {

        if(!flag) {   
            System.out.println("flag 값 확인 : " + flag);
            return a - b;
        } else {
            return a + b;
        }
    }
}