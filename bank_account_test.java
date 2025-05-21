import java.util.Scanner;
class bank_account_test {
    public static void main (String args[]){
    Scanner information = new Scanner (System.in);
    String bank_acct_name;
    String bank_acct_number;
    int bank_acct_balance = 0;
    System.out.println("What is your name?");
    bank_acct_name = information.nextLine ();
    System.out.println("Hello " + bank_acct_name + ", what is you account number?");
    bank_acct_number = information.nextLine();
    System.out.println("Please enter your account balance: ");
    bank_acct_balance = information.nextInt();

    bank_account acct = new bank_account (bank_acct_name, bank_acct_number, bank_acct_balance);
    acct.show_details();
    }
}