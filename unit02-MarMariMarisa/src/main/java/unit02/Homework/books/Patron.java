package unit02.Homework.books;
import java.lang.IllegalArgumentException;
public class Patron {
    //fields
    private String name;
    private boolean hasBook;
    private Book bookCheckedOut;
    //Methods
    public Patron(String name){
        this.name = name;
        this.hasBook = false;
        this.bookCheckedOut = null;
    }
    public String getName(){
        return name;
    }
    public boolean getHasBook(){
        return hasBook;
    }
    public Book getBookCheckedOut(){
        return bookCheckedOut;
    }
    public void checkoutBook(Book book){
        if(book.getAvailability() == Availability.AVAILABLE && hasBook == false){
            book.checkout(this);
            this.hasBook = true;
            bookCheckedOut = book;
        }else{
            System.out.println("Only one book may be checked out at a time");
        }
    }
    public void returnBook(Book book){
        try{
            if(this.getBookCheckedOut() == book){
                book.returnBook(this);
                this.hasBook = false;
                bookCheckedOut = null;
            }else{
                throw new IllegalArgumentException();
            }
        }
        catch(IllegalArgumentException iae){
            System.out.println("Patron does not have that book checked out.");
        }

    }
}
