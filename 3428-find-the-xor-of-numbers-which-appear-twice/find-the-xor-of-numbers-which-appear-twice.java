class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int x : nums) {
            if (set.contains(x)) {
                list.add(x);
            }
            set.add(x);
        }
        int ans = 0;
        for (int i = 0; i < list.size(); i++) {
            ans ^= list.get(i);
        }
        return ans;
    }
}
