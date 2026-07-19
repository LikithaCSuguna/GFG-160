class Solution {
    public int getSecondLargest(int[] arr) {

        // Variables to store largest and second largest values
        int largest = -1;
        int secondLargest = -1;

        // Check each element in the array
        for (int num : arr) {

            // If current element is greater than largest
            if (num > largest) {
                secondLargest = largest; // Move old largest to second largest
                largest = num;           // Update largest
            }

            // If current element can become second largest
            else if (num < largest && num > secondLargest) {
                secondLargest = num;
            }
        }

        // Return the second largest element
        return secondLargest;
    }
}
