import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class maxSumDivThree {
    public int soluation (int [] nums){
        int sum = 0;

        // To store smallest numbers with remainder 1 and 2
        List<Integer> mod1 = new ArrayList<>();
        List<Integer> mod2 = new ArrayList<>();

        for (int n : nums) {
            sum += n;

            if (n % 3 == 1) mod1.add(n);
            else if (n % 3 == 2) mod2.add(n);
        }

        // If divisible by 3 directly
        if (sum % 3 == 0) return sum;

        // Sort remainders to get smallest elements
        Collections.sort(mod1);
        Collections.sort(mod2);

        int result = 0;

        if (sum % 3 == 1) {
            // Option 1: remove smallest mod1
            int remove1 = mod1.size() > 0 ? mod1.get(0) : Integer.MAX_VALUE;

            // Option 2: remove two smallest mod2
            int remove2 = mod2.size() > 1 ? mod2.get(0) + mod2.get(1) : Integer.MAX_VALUE;

            result = sum - Math.min(remove1, remove2);

        } else { // sum % 3 == 2

            // Option 1: remove smallest mod2
            int remove1 = mod2.size() > 0 ? mod2.get(0) : Integer.MAX_VALUE;

            // Option 2: remove two smallest mod1
            int remove2 = mod1.size() > 1 ? mod1.get(0) + mod1.get(1) : Integer.MAX_VALUE;

            result = sum - Math.min(remove1, remove2);
        }

        return result;
    }
}
