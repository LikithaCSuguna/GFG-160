class Solution {
    static int merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;
        int count = 0;
        while (i <= mid && j <= right) {

            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                count += (mid - i + 1);
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid)
            temp[k++] = arr[i++];

        while (j <= right)
            temp[k++] = arr[j++];

        for (int x = 0; x < temp.length; x++) {
            arr[left + x] = temp[x];
        }

        return count;
    }

    static int mergeSort(int[] arr, int left, int right) {

        if (left >= right)
            return 0;

        int mid = left + (right - left) / 2;

        int count = 0;

        count += mergeSort(arr, left, mid);

        count += mergeSort(arr, mid + 1, right);

        count += merge(arr, left, mid, right);

        return count;
    }

    public int inversionCount(int[] arr) {

        return mergeSort(arr, 0, arr.length - 1);
    }
}
