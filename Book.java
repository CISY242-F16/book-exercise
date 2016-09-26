import java.*;
/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @david farrell
 * @website
 */
public class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber = "";
    public int borrowed = 0;
    final private boolean course;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean courseBook)
    {   
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        course = courseBook;
    }

    public void printAuthor()
    {
        System.out.println("The author is : " + author);
    }
    
    public void printTitle()
    {
        System.out.println("The title is : " + title);
    }
    
    public void printPages()
    {
        System.out.println("The # of pages is : " + pages);
    }
    
    public void printDetails()
    {
        if (refNumber.length() > 0)
            System.out.println("Author : " + author + ", Title : " + title + ", # of pages : " + pages + ", Reference Number : " + refNumber + ", Times Borrowed : " + borrowed);
        else
            System.out.println("Author : " + author + ", Title : " + title + ", # of pages : " + pages + ", Reference Number : ZZZ" + ", Times Borrowed : " + borrowed);
    }
    
    public void setRefNumber(String ref)
    {
        if (ref.length() > 2)
            refNumber = ref;
        else 
            System.out.println("Please enter a string of 3 or more characters, thank you!");
    }
    
    public void Borrow()
    {
        borrowed ++;
    }
    
    public void getBorrowed()
    {
        System.out.println("Times Borrowed : " + borrowed);
    }
   
    public void getRefNumber()
    {
        System.out.println("Reference Number : " + refNumber);
    }
    
    public void isCourseText()
    {
        if (course == true)
            System.out.println("This is a course textbook");
        if (course == false)
            System.out.println("This is not a course textbook");
    }
    
    // Add the methods here ...
}
