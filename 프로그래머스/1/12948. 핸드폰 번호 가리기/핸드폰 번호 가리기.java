import java.util.*;
class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int count=0;
        Character ch[]=new Character[phone_number.length()];
        for(int i=ch.length-1;i>=0;i--){
            
            if(count<4){
                ch[i]=phone_number.charAt(i);
            }else ch[i]='*';
            
            count++;
        }
        
        StringBuilder sb=new StringBuilder();
        for(char c:ch){
            sb.append(c);
        }
      
        return sb.toString();
    }
}