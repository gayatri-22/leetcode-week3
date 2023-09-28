class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null){
            return 0;
        }
            Set<Integer> set = new HashSet<>();
            for(int x:nums){
                set.add(x);
            }

            int max=0;

            for(int x:nums){
                int count=0;
                if(!set.contains(x-1)){
                    x++;
                    while(set.contains(x)){
                        count++;
                        x++;
                    }
                    max= Math.max(count+1,max);
                }
            }
            return max;        

    }
}