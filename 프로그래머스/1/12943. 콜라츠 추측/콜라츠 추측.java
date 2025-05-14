class Solution {
    public int solution(int num1) {
        int answer = 0;
        int count=0;
        
        long num=num1;
        while(count<500){
            
            if(num==1){
                return count;
            }else if(num%2==0){
                num=num/2;
            }else num=(num*3)+1;
           
            count ++;

        }
        return -1;
    
    }
}