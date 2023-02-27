import java.util.HashMap;
import java.util.Map;

public class MapFrequency {

    public static void main(String[] args) {
        String word="Java Developer";
        System.out.println(numberOfCharacters(word));
    }

    public static Map<Character,Integer> numberOfCharacters(String str) {

        Map<Character,Integer> map=new HashMap<>();

        for (char c: str.toCharArray()) {
            map.put(c, map.getOrDefault(c,0)+1);

        }
        return map;
    }


}
