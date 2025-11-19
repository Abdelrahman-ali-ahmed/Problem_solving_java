import java.util.Arrays;

public class findFinalValue {
    public int soluation(int []nums, int original){
        if (!searchNums(nums,original)) return original;
        int multipale=original*2;
        while(searchNums(nums,multipale)){multipale=multipale*2;}
        return multipale;
    }
    private boolean searchNums(int [] arr,int target){
        return Arrays.stream(arr).anyMatch(n -> n == target);
    }
}
