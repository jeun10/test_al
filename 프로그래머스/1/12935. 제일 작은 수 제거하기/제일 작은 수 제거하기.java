
class Solution {
    public int[] solution(int[] arr) {
        
        if(arr.length<=1){
            arr[0]=-1;
            return arr;
        }
        
        
        int min_index=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[min_index] > arr[i]){
                min_index=i;
            }
                
        }
        int[] answer = new int[arr.length - 1];
        int index=0;
       for(int i=0;i<arr.length;i++){
           if(min_index!=i)
               answer[index++]=arr[i];
       }
            
        return answer;
    }
}