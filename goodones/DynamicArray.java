
import java.util.Arrays;

public class DynamicArray {
    private int[] arr;
    private int size;

    public DynamicArray(int initialCapacity) {
        arr = new int[initialCapacity > 0 ? initialCapacity : 1];
        size = 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(arr, size));
    }

    public void add(int element) {
        if (size == arr.length) {
            resize();
        }

        int low = 0, high = size;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] < element) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        for (int i = size; i > low; i--) {
            arr[i] = arr[i - 1];
        }

        arr[low] = element;
        size++;
    }

    private void resize() {
        int newCapacity = arr.length * 2;
        if (newCapacity == 0)
            newCapacity = 1;
        arr = Arrays.copyOf(arr, newCapacity);
    }

    public int get(int index) {
        if (index >= 0 && index < size) {
            return arr[index];
        }
        throw new IndexOutOfBoundsException("Index out of bounds");
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray(0);

        dynamicArray.add(10);
        dynamicArray.add(60);
        dynamicArray.add(40);
        dynamicArray.add(20);
        dynamicArray.add(50);
        dynamicArray.add(30);

        System.out.println(dynamicArray);
        System.out.println("Array size: " + dynamicArray.size());
        System.out.println("Element at index 2: " + dynamicArray.get(2));
    }
}
