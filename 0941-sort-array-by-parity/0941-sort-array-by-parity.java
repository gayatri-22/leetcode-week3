class Solution {
    public int[] sortArrayByParity(int[] nums) {
      int[] ans = new int[nums.length];
        int k=0;
        int j= nums.length-1;
      for(int num:nums){
          if(num%2==0){
              ans[k++] =num;
          }
          else{
              ans[j--]= num;
          }
      } 
      return ans; 
    }
}