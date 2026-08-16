import java.util.HashMap;

class Solution {
    int countPairs(int arr[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int count = 0;

        for (int x : arr) {
            int complement = target - x;

            if (map.containsKey(complement)) {
                count += map.get(complement);
            }

            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        return count;
    }
}
