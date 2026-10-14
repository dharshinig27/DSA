class Solution {
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer> seen=new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            if(!seen.contains(nums[i])){
                seen.add(nums[i]);
            }
        }
        int i = 0;
        for (int num : seen) {
            nums[i++] = num;
        }
        
        return seen.size();
    }
}