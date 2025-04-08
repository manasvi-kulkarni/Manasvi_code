class book_info {
    //class variable: title, author, summary
    String title;
    String author;
    String summary;

    //constructor
    public book_info (String t, String a, String s){
        title = t;
        author = a;
        summary = s;
    }

    //class methods
    public void showdetails(){
        System.out.println("The title of the book is " + title);
        System.out.println("The author of the book is " + author);
        System.out.println("The summary of the book is " + summary);
    }
}
