class Solution {
    public void sortColors(int[] nums) {
     //   Arrays.sort(nums);

--------------------------------------------
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
--------------------------------------------

    DUTCH NATIONAL FLAG ALGORITHM

    int low=0, mid=0,high = nums.length-1;
     while(mid<=high){
         if(nums[mid]==0){
             swap(nums,low,mid);
             low++;
             mid++;
         }else if (nums[mid]==1){
             mid++;
         }
         else{
             swap(nums,mid,high);
             mid++;
             high--;
         }
     }
   
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j]= temp;
