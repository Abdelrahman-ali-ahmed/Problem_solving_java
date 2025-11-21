import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class intersectionSizeTwo {
    public int soluation(int [][] intervals){
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            int []interval=intervals[i];
            int start=interval[0];
            int end =interval[1];
           int count = (int) list.stream()
                           .filter(n->(n>=start)&&(n<=end))
                           .count();
           if(count>=2) continue;
           int need =2-count;
           for (int j=end;j>=start&& need > 0;j--){
               if(!list.contains(j)){
                   need--;
                   list.add(j);
               }
           }
        }
        return list.size();
    }
}
