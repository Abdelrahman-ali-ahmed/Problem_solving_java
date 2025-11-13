import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle) {
    int result = 0;
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        ArrayList<Integer> numbers = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0; i < alphabet.length(); i++) {
            map.put( String.valueOf(alphabet.charAt(i)),i+1 );
        }
        for (int i = 0; i < columnTitle.length(); i++) {
            int numFromStr=map.get(String.valueOf(columnTitle.toUpperCase().charAt(i)));
            numbers.add((numFromStr  ));
        }
        Collections.reverse(numbers);
        for(int i = 0; i < numbers.size(); i++){
            int multiplay =numbers.get(i) * ((int)Math.pow(26,i));
            result +=multiplay ;
        }

    return result;
    }
}
