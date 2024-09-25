class Solution {
    

    public int[] solution(String s) {
        int[] answer = new int[2];
        
        int recount=0;//실행횟수
        int removezero=0;//제거한 0 개수
        
        int delete_after=s.replace("0","").length();
        
        removezero=removezero+(s.length()-delete_after);
        recount++;
        
        String binary= Integer.toBinaryString(delete_after);
        
        while(true){
             if(binary.equals("1")){
                answer[0]=recount;
                answer[1]=removezero;
                return answer;
            }
            
            delete_after=binary.replace("0","").length();
            removezero=removezero+(binary.length()-delete_after);
            recount++;
            binary= Integer.toBinaryString(delete_after);
        }
        

     } 
}
