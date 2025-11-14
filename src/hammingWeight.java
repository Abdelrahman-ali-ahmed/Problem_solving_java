import java.util.ArrayList;

public class hammingWeight {
    public int solution(int n) {
        ArrayList<Integer>arr=new ArrayList<>();
        while(n>0){
            if(n%2==0){
                n=n/2;
                arr.add(0);
            }else{
                n=n-1;
                n=n/2;
                arr.add(1);
            }
        }
        int res = arr.stream().mapToInt(d -> d).sum();
        return res;
    }
}
