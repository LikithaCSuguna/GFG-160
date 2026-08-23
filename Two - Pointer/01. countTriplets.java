class Solution {
    public int countTriplets(int[] arr, int target) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n - 2; i++) {
            long need = (long) target - arr[i];
            int j = i + 1, k = n - 1;

            while (j < k) {
                long sum = (long) arr[j] + arr[k];

                if (sum < need) {
                    j++;
                } else if (sum > need) {
                    k--;
                } else {
                    if (arr[j] != arr[k]) {
                        int cj = 1, ck = 1;
                        int vj = arr[j], vk = arr[k];

                        while (j + 1 < k && arr[j + 1] == vj) {
                            cj++;
                            j++;
                        }
                        while (k - 1 > j && arr[k - 1] == vk) {
                            ck++;
                            k--;
                        }

                        count += cj * ck;
                        j++;
                        k--;
                    } else {
                        // all elements from j to k are equal
                        int total = k - j + 1;
                        count += (total * (total - 1)) / 2;
                        break;
                    }
                }
            }
        }

        return count;
    }
}
