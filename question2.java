import java.util.Scanner;
import static java.lang.Math.abs;
// Take 2 strings and iterate over each char of string and update the counters.
// return true if difference is 0 or 1. else false

public class question2 {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);

    String s;
    s=sc.nextLine();

    int count0=0,count1=0;

    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='0'){
            count0++;
        }
        else{
            count1++;
        }

    }
    String res= abs(count0-count1)<=1?"true":"false";

        System.out.println(res);
    }
}
