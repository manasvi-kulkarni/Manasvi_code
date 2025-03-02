import java.util.Scanner;
public class palindrome_022425 {
    public static void main (String args[]){
        int num;
        int rev_num = 0;
        Scanner ob = new Scanner (System.in);
        System.out.print ("Please input your number: ");
        num = ob.nextInt();
        int final_value = num;
        while (num > 0){
            int digit = num % 10;
            rev_num = rev_num * 10 + digit;
            num = num/10;
        }
        if (rev_num == final_value){
            System.out.println(rev_num + " and " + final_value + " are a palindrome");
        }
        else{
            System.out.println(rev_num + " and " + final_value + " are not a palindrome");
        }
    }
}

//num given by user 121