class Solution {
    public int majorityElement(int[] nums) {

        //HashMap Solution
        
        Arrays.sort(nums);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int key:map.keySet()){
            if(map.get(key) > nums.length/2){
                return key;
            }
        }
        return -1;
    }
}

----------------------------------------------

class Solution {
    public int majorityElement(int[] nums) {

        //BOYER MOORE VOTING ALGORITHM
        
        int count=0;
        int candidate =0;

        for(int num:nums){
            if(count==0){
                candidate = num;
            }

            if(num==candidate){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
    }
}
