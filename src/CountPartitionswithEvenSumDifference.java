import java.util.Arrays;

public class CountPartitionswithEvenSumDifference {
    public int soluation(int[] nums){
        int sum = 0;
        for (int num : nums) sum += num;
        int left=0;
        int right=0;
        int count=0;
        for(int i=0; i< nums.length-1;i++){
            left+=nums[i];
            right=sum-left;
            if(Math.abs(left-right)%2==0){count++;}
        }
        return count;
    }
}
