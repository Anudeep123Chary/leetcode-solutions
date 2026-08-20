class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);

        int idx1 = 0;
        int idx2 = 0;

        for(int i=2; i<n; i++) {
            if(arr1.get(idx1) > arr2.get(idx2)){
                arr1.add(nums[i]);
                idx1++;
            } else {
                arr2.add(nums[i]);
                idx2++;
            }
        }
        int index = 0;
        for(int val: arr1) {
            nums[index++] = val;
        }
        for(int val: arr2) {
            nums[index++] = val;
        }

        return nums;
    }
}