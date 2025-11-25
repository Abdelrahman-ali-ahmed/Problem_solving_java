public class smallestRepunitDivByK {
    //problem:https://leetcode.com/problems/smallest-integer-divisible-by-k/?envType=daily-question&envId=2025-11-25
    public int solution(int k){
        if(k%2==0||k%5==0) return -1;
        int r=1%k;
        int len=1;
        while(r!=0){
            r=(r*10+1)%k;
            len++;
        }
        return len;
    }
}
