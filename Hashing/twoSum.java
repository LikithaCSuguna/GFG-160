import java.util.HashSet;

class Solution {
    boolean twoSum(int arr[], int target) {
        HashSet<Integer> set = new HashSet<>();

        for (int x : arr) {
            int complement = target - x;

            if (set.contains(complement)) {
                return true;
            }

            set.add(x);
        }

        return false;
    }
}
