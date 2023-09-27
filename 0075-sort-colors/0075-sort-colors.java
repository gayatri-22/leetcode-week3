class Solution {
    public void sortColors(int[] nums) {
     //   Arrays.sort(nums);
        int zerofreq=0;
        int onefreq=0;
        int twofreq=0;

     for(int i=0;i<nums.length;i++){
         if(nums[i]==0){
             zerofreq++;
         }

         else if(nums[i]==1){
             onefreq++;
         }

         else if(nums[i]==2){
             twofreq++;
         }
     }

     for(int i=0;i<zerofreq;i++){
            nums[i]=0;
     }

     for(int i=zerofreq;i<zerofreq+onefreq;i++){
         nums[i]=1;
     }

     for(int i=zerofreq+onefreq;i<zerofreq+onefreq+twofreq;i++){
         nums[i]=2;
     }
   
    }
}