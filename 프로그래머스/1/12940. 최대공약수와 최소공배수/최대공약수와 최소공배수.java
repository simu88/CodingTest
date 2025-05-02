
class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {};
        answer=new int[2];
        int gcd=getGcd(n,m);
        int lcm=n*m/gcd;
        answer[0]=gcd;
        answer[1]=lcm;
        
        return answer;
    }
    
    public int getGcd(int n, int m){
        while(m!=0){
            int temp=n%m;
            n=m;
            m=temp;
            
        }
        return n;
    }
    public static void main(String args[]){
        Solution sol=new Solution();
        System.out.println(sol.solution(3,12));
        System.out.println(sol.solution(2,5));
    }
}