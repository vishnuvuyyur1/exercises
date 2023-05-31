package arrays;

public class ArrayMergeAndSort {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 6, 8};
        int[] b = new int[]{2, 3, 7, 9};
        for (int i : sortArrays(a, b)) {
            System.out.println(i);
        }

    }

    static int[] sortArrays(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[a.length + i] = b[i];
        }
        return doSort(c);
    }

    static int[] doSort(int[] arr) {
        for(int a=0;a<arr.length-1; a++){
            for (int i = 0; i < arr.length-a- 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        }

        return arr;
    }
}
