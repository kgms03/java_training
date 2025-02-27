import java.util.Scanner;

//Take a number and reverse it and then compare if it is greater than original number
public class question3 {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();

        int temp=n;
        int rev=0;
        while(n!=0){
            int rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        boolean res= rev<temp;
        System.out.println(res);
    }
}
