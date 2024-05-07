class Solution {
    public int jump(int[] nums) {
        int jump=0;
        int position=0;
        int destination =0;
        for(int i=0;i<nums.length-1;i++){
            destination=Math.max(destination,nums[i]+i);
            if(position==i){
                position=destination;
                jump++;

            }
        }
        return jump;
    }
}