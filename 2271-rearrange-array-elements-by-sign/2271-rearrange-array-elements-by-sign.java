class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] pos = new int[nums.length/2];
        int[] neg = new int[nums.length/2];

        int k =0;
        int l = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                pos[k++] = nums[i];
            }
            else{
                neg[l++] = nums[i];
            }
        }

        int[] res = new int[nums.length];
        int z=0;
        for(int j= 0;j<nums.length;j+=2){
            res[j] = pos[z];
            res[j+1] = neg[z];
            z++;
        }
        return res;
    }
}