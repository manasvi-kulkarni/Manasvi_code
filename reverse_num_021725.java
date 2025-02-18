import java.util.Scanner;
public class reverse_num_021725 {
    public static void main (String args[]){
        int num;
        int rev = 0;
        Scanner ob = new Scanner (System.in);
        System.out.print("Please provide the number: ");
        num = ob.nextInt();
        while  (num > 0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num/10;
        }
        System.out.println("The reversed number is: " + rev);
    }
}