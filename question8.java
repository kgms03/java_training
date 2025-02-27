import java.util.*;

public class question8 {
    public static void main(String[] args){
        List<Integer> arr=  Arrays.asList(5,10,15,20,25,15,25,35);

        Set<Integer> res=new HashSet<>();
        // Checks if the element can be added to the set. It gets added it is unique else it is duplicate,
// then it is collected and added to list
        List<Integer> li= arr.stream().filter(a ->!res.add(a)).toList();

        System.out.println(li);
    }
}
