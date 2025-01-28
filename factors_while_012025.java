import java.util.Scanner;
public class factors_while_012025 {
    public static void main (String args[]){
        int num;
        System.out.print("Please input your number: ");
        Scanner ob = new Scanner (System.in);
        num = ob.nextInt();
        int i = 2;
        int count = 0; 
        while (i < num){
            int remainder = num % i;
            if (remainder == 0){
                System.out.println (i + " is the factor of " + num);
                count = count + 1;
            }
            i++;
        }
        System.out.println("There are " + count + " factors of " + num);
    }
}