class Solution {
    public String solution(String s) {
        int length = s.length();
        int mid = length / 2;
        
        if (length % 2 == 0) {
            // 짝수 길이: 가운데 2글자 반환
            return s.substring(mid - 1, mid + 1);
        } else {
            // 홀수 길이: 가운데 1글자 반환
            return s.substring(mid, mid + 1);
        }
    }
}