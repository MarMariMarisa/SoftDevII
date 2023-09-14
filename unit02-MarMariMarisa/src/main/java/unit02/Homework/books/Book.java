package unit02.Homework.books;

public class Book {
    //fields
    private String name;
    private String author;
    private int numOfCopies;
    private int numCheckedOut;
    private Availability isAvailable;
    //Methods
    public Book(String name,String author,int numOfCopies,int numCheckedOut,Availability isAvailable){
        this.name = name;
        this.author = author;
        this.numOfCopies = numOfCopies;
        this.numCheckedOut = numCheckedOut;
        this.isAvailable = isAvailable;
    }
    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }
    public int getNumOfCopies(){
        return numOfCopies;
    }
    public int getNumCheckedOut(){
        return numCheckedOut;
    }
    public Availability getAvailability(){
        return isAvailable;
    }
    public void checkout(Patron patron){
        if(isAvailable == Availability.AVAILABLE){
            numCheckedOut = numCheckedOut + 1;
            if(numCheckedOut == numOfCopies){
                isAvailable = Availability.CHECKED_OUT;
            }
        }
    }
    public void returnBook(Patron patron){
        numOfCopies = numOfCopies + 1;

    }
}
