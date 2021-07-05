public class Test {
    public static void main(String[] args) {
        System.out.println("Beginning");
        BookBorrower bookBorrower1 = new BookBorrower();
        BookBorrower bookBorrower2 = new BookBorrower();

        bookBorrower1.borrowBook();
        System.out.println("Borrower 1 asked to borrow gook");
        System.out.println("Borrower 1 Author and Title: ");
        System.out.println(bookBorrower1.getAuthorAndTitle());


        bookBorrower2.borrowBook();
        System.out.println("Borrower 2 asked to borrow gook");
        System.out.println("Borrower 2 Author and Title: ");
        System.out.println(bookBorrower2.getAuthorAndTitle());

        bookBorrower1.returnBook();
        System.out.println("Borrower 1 return book");

        bookBorrower2.borrowBook();
        System.out.println("Borrower 2 Author and Title");
        System.out.println(bookBorrower1.getAuthorAndTitle());

        System.out.println("End Test");
    }
}
