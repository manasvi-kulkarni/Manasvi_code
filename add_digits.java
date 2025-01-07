import java.util.Scanner;
public class add_digits {
    public static void main (String args[]){
        int num;
        System.out.println("Enter the number to find the sum of the digits: ");
        Scanner ob = new Scanner (System.in);
        num = ob.nextInt();
        int sum = 0;
        while(num > 0){
            int lastDigit = num % 10;
            num = num / 10;
            sum = sum + lastDigit;
        }
        System.out.println("Sum of all digits is: " + sum);
    }
}
