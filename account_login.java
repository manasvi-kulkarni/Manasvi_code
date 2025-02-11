import java.util.Scanner;
public class account_login {
    public static void main (String args[]){
        int pwd = 2468;
        Scanner ob = new Scanner (System.in);
        int max = 3;
        int attempt = 0;
        while (attempt < max){
            System.out.print("Please enter your password: ");
            int user_input = ob.nextInt();
            if (user_input == pwd){
                System.out.println("Welcome to your account");
                ob.close ();
                return;
            }
            else{
                attempt = attempt + 1;
                if (attempt < max){
                    System.out.println("Incorrect Password. Please try again");
                }
            }
        }
        System.out.println ("Sorry, but you are locked out of your account. Please contact your administrator");
    }
}