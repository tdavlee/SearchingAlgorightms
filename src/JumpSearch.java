import java.util.List;

public class JumpSearch {
    static int jumpSearch(List<Integer> arr, int target) {
        int n = arr.size();
        int step = (int) Math.floor(Math.sqrt(n));
        int prev = 0;

        while (arr.get(Math.min(step, n) - 1) < target) {
            prev = step;
            step += (int) Math.floor(Math.sqrt(n));
            if (prev >= n) {
                return -1;
            }
        }

        while (arr.get(prev) < target) {
            if (prev++ == Math.min(step, n)) {
                return -1;
            }
        }

        if (arr.get(prev) == target) {
            return prev;
        }

        return -1;
    }
}
