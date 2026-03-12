class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> m = new HashMap<>();

        for (int i1 = 0; i1 < nums.length; i1++) {
            int complem = target - nums[i1];

            if (m.containsKey(complem)) {
                return new int[] { m.get(complem), i1 };
            }

            m.put(nums[i1], i1);
        }

        return new int[] {};
    }
}
        

        