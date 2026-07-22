class Solution {
    public int maxCircularSum(int[] arr) {

        int totalSum = 0;
        int currMax = arr[0];
        int maxSum = arr[0];
        int currMin = arr[0];
        int minSum = arr[0];
        totalSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            totalSum += arr[i];

            // Kadane for maximum sum
            currMax = Math.max(arr[i], currMax + arr[i]);
            maxSum = Math.max(maxSum, currMax);

            // Kadane for minimum sum
            currMin = Math.min(arr[i], currMin + arr[i]);
            minSum = Math.min(minSum, currMin);
        }

        // All elements are negative
        if (maxSum < 0) {
            return maxSum;
        }

        int circularSum = totalSum - minSum;
        return Math.max(maxSum, circularSum);
    }
}
