import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public ArrayList<Integer> sumClosest(int[] arr, int target) {
        ArrayList<Integer> res = new ArrayList<>();
        int n = arr.length;
        if (n < 2) return res;
        
        int[] a = arr.clone();
        Arrays.sort(a);
        
        int i = 0, j = n - 1;
        long bestDiff = Long.MAX_VALUE;
        int bestA = -1, bestB = -1;
        
        while (i < j) {
            long sum = (long) a[i] + a[j];
            long diff = Math.abs(sum - target);
            
            if (diff < bestDiff) {
                bestDiff = diff;
                bestA = a[i];
                bestB = a[j];
            }
            if (sum == target) {
                break;
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        
        res.add(bestA);
        res.add(bestB);
        return res;
    }
}
