class Solution {
    public int removeDuplicates(int[] nums) {
        int n= nums.length;
        if(n==0) return 0;
        int count =0;
        for(int i=0;i<n;i++){
            if(i<n-1 && nums[i]==nums[i+1])
            {
                continue;

            }
        
        else{
            nums[count]=nums[i];
         count++;
        
    }
    }
    return count;
    }
}

