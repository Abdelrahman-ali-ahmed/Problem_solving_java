import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class countPalindromicSubsequence {
    public int solution(String s) {
        // Convert string to char array
        char[] st = s.toCharArray();
        Map<Character, CharInfo> map = new HashMap<>();

        // Build map with count and indices
        for (int i = 0; i < st.length; i++) {
            char c = st[i];
            if (map.containsKey(c)) {
                CharInfo info = map.get(c);
                info.count++;
                info.index.add(i);
            } else {
                CharInfo info = new CharInfo();
                info.count = 1;
                info.index.add(i);
                map.put(c, info);
            }
        }

        // Find characters with count >= 2
        List<Character> result = new ArrayList<>();
        for (char c : map.keySet()) {
            if (map.get(c).count >= 2) {
                result.add(c);
            }
        }

        if (result.isEmpty()) return 0;

        List<Character> keys = new ArrayList<>(map.keySet());
        List<String> arrStri = new ArrayList<>();

        // Check for palindromic subsequences
        for (char ch : result) {
            List<Integer> chIndices = map.get(ch).index;
            int start = chIndices.get(0);
            int end = chIndices.get(chIndices.size() - 1);

            for (char k : keys) {
                List<Integer> kIndices = map.get(k).index;

                if (ch != k && existsInRange(kIndices, start, end)) {
                    arrStri.add("" + ch + k + ch);
                } else if (ch == k && map.get(k).count > 2) {
                    arrStri.add("" + ch + ch + ch);
                }
            }
        }

        return arrStri.size();
    }

    private boolean existsInRange(List<Integer> arr, int start, int end) {
        for (int num : arr) {
            if (num >= start && num <= end) return true;
        }
        return false;
    }
}
