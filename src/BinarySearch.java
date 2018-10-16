import java.util.List;

public class BinarySearch {
    static int binarySearch(List<Integer> arr, int low, int high, int target) {
        if (low > high)
            return -1;

        int mid = (low + high) / 2;

        if (arr.get(mid) == target) {
            return mid;
        }

        if (arr.get(mid) > target) {
            return binarySearch(arr, low, mid - 1, target);
        } else {
            return binarySearch(arr, mid + 1, high, target);
        }
    }
}
