class Solution {
    int countPairs(int arr[], int target) {
        int n = arr.length;
        int i = 0, j = n - 1;
        int count = 0;
        
        while (i < j) {
            int sum = arr[i] + arr[j];
            
            if (sum == target) {
                if (arr[i] == arr[j]) {
                    int k = j - i + 1;
                    count += (k * (k - 1)) / 2;
                    break;
                } else {
                    int left = arr[i], right = arr[j];
                    int leftCount = 1, rightCount = 1;
                    
                    i++;
                    while (i < j && arr[i] == left) {
                        leftCount++;
                        i++;
                    }
                    while (i < j && arr[j] == right) {
                        rightCount++;
                        j--;
                    }
                    count += leftCount * rightCount;
                }
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        
        return count;
    }
}
