import java.util.HashMap;
import java.util.TreeMap;

public class RomArab {
    HashMap<String, Integer> rom = new HashMap<String, Integer>();
    TreeMap<Integer, String> arab = new TreeMap<Integer, String>();
       public RomArab() {
           rom.put("I", 1);
           rom.put("II", 2);
           rom.put("III", 3);
           rom.put("IV", 4);
           rom.put("V", 5);
           rom.put("VI", 6);
           rom.put("VII", 7);
           rom.put("VIII", 8);
           rom.put("IX", 9);
           rom.put("X", 10);

           arab.put(1,"I");
           arab.put(5,"V");
           arab.put(10,"X");
           arab.put(50,"L");
           arab.put(100, "C");
       }
    public boolean isRoman(String a){

           return rom.containsKey(a);
    }
    public String arabToRom(int number) {
        String roman = "";
        int arabianKey;
        while (number != 0) {
            arabianKey = arab.floorKey(number);
            roman += arab.get(arabianKey);
            number -= arabianKey;
        }
        return roman;

    }
    int romToArab(String a) {

        return rom.get(a);

    }

}
