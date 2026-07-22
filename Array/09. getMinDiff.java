
import java.util.Arrays;

class Solution {
    public int getMinDiff(int[] arr, int k) {
        int n = arr.length;

        Arrays.sort(arr);

        int ans = arr[n - 1] - arr[0];

        for (int i = 1; i < n; i++) {

            // Height cannot become negative
            if (arr[i] - k < 0) {
                continue;
            }

            int smallest = Math.min(arr[0] + k, arr[i] - k);
            int largest = Math.max(arr[i - 1] + k, arr[n - 1] - k);

            ans = Math.min(ans, largest - smallest);
        }

        return ans;
    }
}
