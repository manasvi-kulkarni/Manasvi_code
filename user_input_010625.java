import java.util.Scanner;
public class user_input_010625{
    public static void main (String args[]){
        Scanner ob = new Scanner(System.in);
    int choice = 1;
    int sum = 0;
    while(choice == 1){
        System.out.print("Enter a number: ");
        int num = ob.nextInt();
        sum = sum + num; 
        System.out.print("Do you want to continue? ");
        choice = ob.nextInt();
    }
    System.out.println("the sum of the numbers that you have inputted is: " + sum);
    }
}