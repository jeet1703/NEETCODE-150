class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mp = new HashMap<>();
        int n = nums.length;

        for(int i =0;i<n;i++){
            int wish = target-nums[i];
            if(mp.containsKey(wish)){
                return new int[]{mp.get(wish),i};
            }
            mp.put(nums[i],i);
        }
        return new int[]{};
    }
}