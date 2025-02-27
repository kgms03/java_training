import java.util.*;
// Create a hashmap to store the key,value pairs and then traverse it to get the key which first has value 1.
public class question6 {
    public static void main(String[] args) {
        String s = "GCC basic training";
        s = s.toLowerCase(Locale.ROOT);

        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
        }

//        System.out.println(hm.entrySet()); gives the hashmap with key:values

        for(Map.Entry<Character,Integer> mapElement: hm.entrySet()){
            if(mapElement.getValue()==1){
                 char res=mapElement.getKey();
        System.out.println(res);
        break;
            }
        }
    }

}
