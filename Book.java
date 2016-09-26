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

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {   
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
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
        System.out.println("Author : " + author + ", Title : " + title + ", # of pages : " + pages);
    }
    
    public void setRefNumber(String ref)
    {
        refNumber = ref;
    }
    
    public void getRefNumber()
    {
        System.out.println("Reference Number : " + refNumber);
    }
    
    // Add the methods here ...
}
