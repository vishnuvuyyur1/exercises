package scratch.arrays;
//Given a sorted array of n elements, possibly with duplicates,
// find the number of occurrences of the target element.
public class BinarySearchDuplicates {
    static int count=0;

    public static void main(String[] args){
        int[] arry={4, 4, 8, 8, 8, 15, 16, 23, 23, 42};
        int target=6;
        int left = leftBinarySearch(arry,target);
        int right= rightBinarySearch(arry,target);
        System.out.println(left+"      "+right+"     "+count);
    }


    static int leftBinarySearch(int[] arry, int target){
        int startIndex=0;
        int endIndex=arry.length-1;
        int index=-1;
        while(startIndex<=endIndex){
            int mid = startIndex+(endIndex-startIndex)/2;
            if(arry[mid]== target){
                count++;
                index = mid;
                endIndex = mid-1;
            }else if(target>arry[mid]){
                startIndex=mid+1;
            }else{
                endIndex=mid-1;
            }
        }
        return index;
    }
    static int rightBinarySearch(int[] arry, int target){
        int startIndex=0;
        int endIndex=arry.length-1;
        int index=-1;
        while(startIndex<=endIndex){
            int mid = startIndex+(endIndex-startIndex)/2;
            if(arry[mid]== target){
                count++;
                index = mid;
                startIndex = mid+1;
            }else if(target>arry[mid]){
                startIndex=mid+1;
            }else{
                endIndex=mid-1;
            }
        }
        return index;
    }
}


