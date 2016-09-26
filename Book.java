/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    //88
    private String refNumber;
    //91
    private int borrowed;
    //92
    private boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */

    //85
    public Book(String bookAuthor, String bookTitle, int bookPages, int borrowed)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        borrowed = 0;
    }

    // Add the methods here ...

    // 83
    public String getbookAuthor()
    {
        return author;
    }

    public String getbookTitle()
    {
        return title;
    }
    
    //84
    public void printbookAuthor()
    {
        System.out.println("Author: " + author);
    }

    public void printbookTitle()
    {
        System.out.println("Title: " + title);
    }

    public int getPages()
    {
        return pages;
    }
    
    public void setrefNumber(String ref)
    {
        refNumber = ref;

        //90
        if (ref.length() < 3)
        {
            System.out.println("Reference number must be at least 3 characters long!");
        }
        else
        {
            refNumber = ref;
        }
    }
    
    public void borrow()
    {
        borrowed++;
    }
    
    public int getBorrowed()
    {
        return borrowed;
    }
    //92
    public boolean iscourseText()
    {
        courseText = true;
        if(courseText == true)
        {
            System.out.println("This book is being used as a text book on a course.");
        }
        else
        {
            System.out.println("This book is not being used as a text book on a course.");
        }
        
        return courseText;
    }   

    //87
    public void printDetails()
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        String refNumberString;

        //89
        if (refNumber.length() > 0)
        {
            refNumberString = refNumber;
        }
        else
        {
            refNumberString = "ZZZ";
        }
        System.out.println("Reference Number: " + refNumberString);
        System.out.println("Borrowed: " + borrowed);
    }
    
    public static void main(String[] args)
    {
        Book myBook = new Book("Daniel Defoe", "Robinson Crusoe", 232, 0);
    }
}
