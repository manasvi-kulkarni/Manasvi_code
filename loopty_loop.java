import java.util.Scanner;
public class loopty_loop{
    public static void main(String args[]){
        Scanner ob = new Scanner(System.in);
        System.out.print("Give me a number: ");
        int number = ob.nextInt();
        int factcount = 0;
        for (int i = 2; i <= number-1; i++){
            if (number%i ==0){
                factcount = factcount+1;
        }
        
        }
        if (factcount > 0){
            System.out.println(number + " is not a prime number");
        }else{
            System.err.println(number + " is a prime number.");
        }
    }
}