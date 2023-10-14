class Solution {

     void merge(int arr[], int l, int m, int r)
    {
         // Your code here
       //  int mid= l+r/2;
         
         int len1= m-l+1;
         int len2 = r-m;
         
         int[] arr1= new int[len1];
         int[] arr2 = new int[len2];
         
         //copy values
         int k=l;
         for(int i=0;i<len1;i++){
             arr1[i] = arr[k++];
         }
         
         k = m+1;
         for(int i=0;i<len2;i++){
             arr2[i] = arr[k++];
         }
         
         //merge 2 sorted arrays
         
         int index1=0;
         int index2 =0;
         k=l;
         
         while(index1<len1 && index2<len2){
             if(arr1[index1] < arr2[index2]){
                 arr[k++] = arr1[index1++];
             }
             else{
                 arr[k++] = arr2[index2++];
             }
         }
         
         while(index1<len1){
             arr[k++] = arr1[index1++];
         }
         
         while(index2<len2){
             arr[k++] = arr2[index2++];
         }
         
    }

    int countPairs(int arr[], int l, int mid, int r){
        int count =0;
        int right = mid+1;
        for(int i=l;i<=mid;i++){
            while(right<=r && arr[i] > (2 * (long)arr[right])) right++;
                count += (right-(mid+1));            
        }
        return count;
    }


    int mergeSort(int arr[], int l, int r)
    {
        int count =0;
        //code here
        //base case
        if(l>=r){
            return 0;
        }
        int mid= l+(r-l)/2;
        
        //left part sort
        count+=mergeSort(arr,l,mid);
        
        //right part sort
        count+=mergeSort(arr,mid+1,r);

        // count the pairs
        count+=countPairs(arr,l,mid,r);

        //merge
        merge(arr,l,mid,r);

        return count;
    }

    public int reversePairs(int[] nums) {
        int n = nums.length;
        return mergeSort(nums,0,n-1);
    }
}