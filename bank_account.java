class bank_account{
    private String name;
    private String acc_num;
    private int acc_bal;


//constructor
public bank_account(String n, String a, int b){
    name = n;
    acc_num = a;
    acc_bal = b;
  }


//class methods
public void show_details(){
    System.out.println("The account holder is: " + name);
    System.out.println("The account number is: " + acc_num);
    System.out.println("The account balance for " + name + " is $" + acc_bal);
}
}