
// Merge Two Sorted Arrays

public class MergeArray {

    public static void main(String[] args) {
        int[] arr1 = { 1, 4, 9, 13, 42 };
        int[] arr2 = { 3, 5, 7, 24, 63 };

        int[] res = new int[arr1.length + arr2.length];

        int i = 0, j = 0;
        int curr = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                res[curr] = arr1[i];
                i++;
            } else {
                res[curr] = arr2[j];
                j++;
            }

            curr++;
        }

        while (i < arr1.length) {
            res[curr++] = arr1[i++];
        }

        while (j < arr2.length) {
            res[curr++] = arr2[j++];
        }

        for (int num : res) {
            System.out.print(num + " ");
        }

        System.out.println();
        return;
    }
}
