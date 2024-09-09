class Solution {
    public String solution(String code) {
        StringBuilder ret = new StringBuilder(); //결과를 저장할 StringBuilder 문자열 (추가가 빨라짐)
        int mode = 0; //초기 모드는 0으로 설정
        
        // 각 문자열을 하나씩 순회
        for(int idx = 0; idx < code.length(); idx++) {
            char currentChar = code.charAt(idx); //현재 문자
            
            if(currentChar == '1') {
                mode = 1 - mode; //mode를 변경
            //mode에 따라 조건을 체크
            } else if ((mode == 0 && idx % 2 == 0) || (mode == 1 && idx % 2 == 1)) {
                    ret.append(currentChar); //해당 조건에 맞을시 추가
            }
        }
        //결과가 비었다면 "EMPTY" 반환
        return ret.length() == 0 ? "EMPTY" : ret.toString();
    }
}