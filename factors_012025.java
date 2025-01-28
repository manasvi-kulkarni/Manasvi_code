import java.util.Scanner;
public class factors_012025 {
    public static void main (String args[]){
        int num;
        System.out.print("Input your number: ");
        Scanner ob = new Scanner (System.in);
        num = ob.nextInt();
        for (int i = 2; i < num; i++){
            if (num % i == 0){
                System.out.println (i + " is the factor of " + num);
            }
        }
    }
}
