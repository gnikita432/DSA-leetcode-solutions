//989. Add to Array-Form of Integer

class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> list = new LinkedList<>();
        
        int i = A.length - 1;
        int carry = 0;
        while(i >= 0 || K != 0 || carry == 1){
            int sum = carry;
            if(i >= 0){
                sum += A[i];
                i--;
            }
            if(K != 0){
                sum += K % 10;
                K = K / 10;
            }
            list.add(0,sum % 10);
            carry = sum / 10;   
        }
        
        return list;
    }
}
