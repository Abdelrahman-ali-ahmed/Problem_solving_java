public class countOdds {
    public int soluation (int low,int high){
        int count=0;
        if (low%2!=0||high%2!=0) count++;
        int destince=high-low;
        int oddCount=(int)Math.floor(destince/2);
        count +=oddCount;
        return count;
    }
}
