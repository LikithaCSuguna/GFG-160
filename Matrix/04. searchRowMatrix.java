class Solution {
    public boolean searchRowMatrix(int[][] mat, int x) {

        for (int[] row : mat) {

            int left = 0;
            int right = row.length - 1;

            while (left <= right) {

                int mid = left + (right - left) / 2;

                if (row[mid] == x) {
                    return true;
                } else if (row[mid] < x) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return false;
    }
}
