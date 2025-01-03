import java.util.Scanner;
public class multiplication_table {
    public static void main (String args[]){
        int number;
        System.out.println ("print your number for the multiplaction table: ");
        Scanner ob = new Scanner(System.in);
        number = ob.nextInt();

        for (int i=1; i<=12; i++)
            System.out.println(number + " * " + i + " = " + (number * i));
    }
}
