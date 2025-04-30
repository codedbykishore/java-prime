
public class SumOfArr {

    public static void main(String[] args) {
        int[] numbers = { 4, 7, 8, 3, 3 };
        System.out.println(recursiveSum(numbers, 0));
    }

    public static int recursiveSum(int[] arr, int index) {

        if (index == arr.length - 1) {
            return arr[index];
        }

        return arr[index] + recursiveSum(arr, index + 1);
    }

}
