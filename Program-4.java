import java.util.*;

public class MultiplesCounter {
    public static void main(String[] args) {
        Integer[] input = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= 9; i++) {
            int count = 0;
            for (int num : input) {
                if (num % i == 0) {
                    count++;
                }
            }
            map.put(i, count);
        }
        System.out.println(map);
    }
}
