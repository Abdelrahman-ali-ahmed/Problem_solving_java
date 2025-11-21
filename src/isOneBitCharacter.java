public class isOneBitCharacter {
    public boolean soluation (int [] bits ){
        int i = 0;
        while (i < bits.length - 1) { // نمشي لحد قبل آخر عنصر
            if (bits[i] == 1) {
                i += 2;  // حرف 2-bit
            } else {
                i += 1;  // حرف 1-bit
            }
        }
        return i == bits.length - 1;
    }
}
