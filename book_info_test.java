import java.util.Scanner;
public class book_info_test {
    public static void main(String args[]){
        Scanner info = new Scanner (System.in);
        String book_title;
        String book_author;
        String book_summary;
        System.out.println("Please enter the book/series title: ");
        book_title = info.nextLine();
        System.out.println("Please enter the author of the book/series: ");
        book_author = info.nextLine();
        System.out.println("Please enter a brief summary or description of the book/series: ");
        book_summary = info.nextLine();

        book_info bkio = new book_info (book_title, book_author, book_summary);
        bkio.showdetails();
        // System.out.println(bkio.title);
        // System.out.println(bkio.author);
        // System.out.println(bkio.summary);
    }
}