import java.util.Scanner;
public class prime_or_composite{
    public static void main (String args[]){
        int num;
        Scanner ob = new Scanner(System.in);
        num = ob.nextInt();
        int count = 0;
        for (int x = 2; x<= num-1; x++){
            if (num % x == 0){
                count = count + 1;
            }
        }
        if (count > 0){
            System.out.println (num + " is a composite number");
        }else{
            System.out.println (num + " is a prime number");
        }
    }
}
