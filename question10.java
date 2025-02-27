import java.util.HashMap;

public class question10 {

    public static void main(String[] args) {
        String s = "This is the sample input";

//        Using HashMap
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
        }
//        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
//            System.out.println(entry.getKey() + ":" + entry.getValue());
//        }

//        Using Arrays
        int[] arr = new int[256];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)]++;
        }

        for (int i = 0; i <256; i++) {
            if (arr[i] > 0) {
                System.out.println((char) (i) + ":" + arr[i]);
            }
        }
    }
}
