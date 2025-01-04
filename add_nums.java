import java.util.Scanner;

public class add_nums {
    public static void main (String args[]){
        int num1, num2;
        System.out.println("print your first number here: ");
        Scanner ob = new Scanner(System.in);
        num1 = ob.nextInt();
        System.out.println("Enter your second number");
        num2 = ob.nextInt();
        System.out.println("Sum of these numbers is: " + (num1 + num2));
    }
}
