class Solution {
    public int[] plusOne(int[] digits) {

        HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();   
          
        for (int j = 0; j < digits.length; j++) {   
            hashmap.put(digits[j], j);   
        }   
        
        
        if(hashmap.size() ==1 && hashmap.get(9)!=null && hashmap.get(9)==digits.length-1){
            int[] newArr = Arrays.copyOf(digits, digits.length + 1);
            for(int i=0; i<newArr.length; i++){
                if(i==0){
                    newArr[i]= 1;
                } else{
                    newArr[i]= 0;
                }
            }
            
            return newArr;
            
        }  
        
        for (int i=digits.length-1; i>=0; i--){
            if(digits[i]==9){
                digits[i]=0;
                if(i!=0){
                    if(digits[i-1]==9){
                        continue;
                    } else {
                        digits[i-1] = digits[i-1]+1;
                        return digits;
                    }
                }
                
            } else {
                digits[i] = digits[i]+1;
                return digits;
            }
        }
         return digits;
    }
   
}
