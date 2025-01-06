import java.util.Scanner;

public class average_of_num {
    public static void main (String args[]){
        int count;
        System.out.println("Enter count of numbers: ");
        Scanner ob = new Scanner (System.in);
        count = ob.nextInt();
        int number, sum = 0;
        float average = 0; 
        for(int i=0; i<count; i++){
            number = ob.nextInt();
            sum = sum + number;
        }
        average = sum + count;
        System.out.println("The mean of all the numbers provided is: " + average);
    }
}