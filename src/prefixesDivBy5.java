import java.util.*;

public class prefixesDivBy5 {
    //problem:https://leetcode.com/problems/binary-prefix-divisible-by-5/?envType=daily-question&envId=2025-11-24
    public List<Boolean> soluation(int []nums){
            int decimal=0;
        List<Boolean> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            decimal=(decimal*2+nums[i])%5;
            list.add(decimal==0);
        }
return list;
    }
}
