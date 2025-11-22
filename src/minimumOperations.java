
//problem:https://leetcode.com/problems/find-minimum-operations-to-make-all-elements-divisible-by-three?envType=daily-question&envId=2025-11-22
public class minimumOperations {

    public int soluation (int []nums){
        int sum =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] %3 ==0){
                continue;
            } else{
                sum++;
            }
        }

        return sum;
    }
}
