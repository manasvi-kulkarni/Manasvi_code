import java.util.Scanner;
public class book_hunt {
    public static void main (String args[]){
        Scanner book = new Scanner (System.in);
        String title;
        System.out.println("Please enter the book title or series");
        title = book.nextLine();
        String author;
        System.out.println("Please enter the author of the book or series");
        author = book.nextLine();
        String summary;
        System.out.println("Please enter the summary of the book or series in 100 words or less");
        summary = book.nextLine();
        System.out.println("Thank you so much! Please find another book to read of your choice! Bye!");
    }
}