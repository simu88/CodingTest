class Solution {
    public long solution(int price, int money, int count) {
        long sum = 0;  // sum을 long으로 변경
        for (int i = 1; i <= count; i++) {
            sum += (long) price * i;  // 안전하게 형변환
        }
        long answer = sum - money;
        return answer > 0 ? answer : 0;  // 부족하지 않으면 0 반환
    }
}
