class Solution {
    public List<List<Integer>> findTriplets(int[] arr) {
        int n = arr.length;
        int[][] nums = new int[n][2];

        for (int i = 0; i < n; i++) {
            nums[i][0] = arr[i];
            nums[i][1] = i;
        }

        Arrays.sort(nums, (a, b) -> Integer.compare(a[0], b[0]));
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                long sum = (long) nums[i][0]
                         + nums[left][0]
                         + nums[right][0];

                if (sum == 0) {
                    List<Integer> triplet = new ArrayList<>();

                    triplet.add(nums[i][1]);
                    triplet.add(nums[left][1]);
                    triplet.add(nums[right][1]);
                    Collections.sort(triplet);

                    result.add(triplet);

                    left++;
                    right--;
                } 
                else if (sum < 0) {
                    left++;
                } 
                else {
                    right--;
                }
            }
        }
        Collections.sort(result, (a, b) -> {
            for (int i = 0; i < 3; i++) {
                int cmp = Integer.compare(a.get(i), b.get(i));
                if (cmp != 0) {
                    return cmp;
                }
            }
            return 0;
        });
        return result;
    }
}
