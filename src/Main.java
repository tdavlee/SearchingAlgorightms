import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 5, 6, 12, 34, 44, 127, 222, 224, 224, 1984);

        int index = JumpSearch.jumpSearch(list1, 1);
        System.out.println(index);

        System.out.println(list1.get(index));
    }
}
