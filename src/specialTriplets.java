import java.util.HashMap;
import java.util.Map;

public class specialTriplets {
    public static final int MOD = 1_000_000_007;
    public int solution(int[] nums) {
        Map<Integer, Integer> mapLeft = new HashMap<>();
        Map<Integer, Integer> mapRight = new HashMap<>();
        for(int x :nums){
            mapRight.put(x, mapRight.getOrDefault(x, 0) + 1);
        }
        long ans=0 ;
        for(int j=0 ;j<nums.length;j++){
            mapRight.put(nums[j],mapRight.get(nums[j])-1);
            int need =nums[j] *2;
            int leftCount=mapLeft.getOrDefault(need,0);
            int rightCount=mapRight.getOrDefault(need,0);
            ans = (ans + ((long) leftCount * rightCount) % MOD) % MOD;
            mapLeft.put(nums[j],(mapLeft.getOrDefault(nums[j],0)+1));

        }

        return(int)ans;
    }
}
