import java.util.HashMap;

public class MajorityElement {
    public int solution(int[] nums) {
        int maj = nums.length / 2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1); // increment count
            if (map.get(i) > maj) {
                return i; // found majority element
            }
        }
        return -1; // should never happen if majority element always exists
    }
}
