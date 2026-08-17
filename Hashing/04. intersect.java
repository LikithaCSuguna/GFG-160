class Solution {
    public ArrayList<Integer> intersect(int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : a) {
            set.add(num);
        }

        ArrayList<Integer> result = new ArrayList<>();
        HashSet<Integer> added = new HashSet<>();

        for (int num : b) {
            if (set.contains(num) && !added.contains(num)) {
                result.add(num);
                added.add(num);
            }
        }

        return result;
    }
}
