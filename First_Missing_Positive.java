class Solution {
    public int firstMissingPositive(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        HashSet<Integer>hs=new HashSet<>();
        int miss=1;
        for(int i=0; i<nums.length;i++)
        {
            hs.add(nums[i]);
            if(miss==nums[i])
            {
                while(hs.contains(miss))
                {
                    miss++;
                }
            }
        }
        return miss;
    }
}
