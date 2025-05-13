class Solution {
    public String solution(int n) {
         StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            // 짝수 인덱스에는 "수", 홀수 인덱스에는 "박"
            if (i % 2 == 0) {
                sb.append("수");
            } else {
                sb.append("박");
            }
        }
        
        return sb.toString();
    }
}