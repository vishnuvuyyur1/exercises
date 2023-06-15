package scratch.arrays;

public class BinarySearch {
    public static void main(String[] args){
        int[] array ={1,2,3,4,5};
        int target = 3;
        System.out.println(search(array, target));
    }

    private static int search(int[] nums, int target) {
        int startIndex = 0; // initialize left pointer to 0
        int endIndex = nums.length - 1; // initialize right pointer to the last index of the array

        while (startIndex <= endIndex) { // continue the loop till left pointer is less than or equal to right pointer
            int mid = startIndex + (endIndex - startIndex) / 2; // calculate the middle index of the array

            if (nums[mid] == target) { // check if the middle element is equal to target
                return mid; // return the middle index
            } else if (target > nums[mid]) { // check if the middle element is less than target
                startIndex = mid + 1; // move the left pointer to the right of middle element
            } else { // if the middle element is greater than target
                endIndex = mid - 1; // move the right pointer to the left of middle element
            }
        }

        return -1; // target not found in the array

    }
}
