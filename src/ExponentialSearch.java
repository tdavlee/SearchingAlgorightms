import java.util.Arrays;
import java.util.List;

public class ExponentialSearch {
    static int exponentialSearch(List<Integer> arr, int target) {

        if (arr.get(0) == target) {
            return 0;
        }

        int n = arr.size();
        int i = 1;

        while (i < n && (arr.get(i) <= target)) {
            i *= 2;
        }

        return BinarySearch.binarySearch(arr, i/2, Math.min(i, n), target);
    }
}
