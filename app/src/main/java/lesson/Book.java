package lesson;

public class Book {

    protected String title;
    protected String author;
    protected String ISBN;

   public Book(){
      //this is called constructor chaining and is a cool way to
      //reuse code! This allows constructors to call each other
      //when constructing a new object.
      this("unknown ISBN");
   }

    public Book(String ISBN){
       //We have to use the this keyword because the ISBN variable 
       //in this constructor method is shadowing the ISBN property
       //of this class.
       this.ISBN = ISBN;
    }
 
    public void setTitle(String userTitle) {
       title = userTitle;
    }
 
    public String getTitle() {
       return title;
    }
 
    public void setAuthor(String userAuthor) {
       author = userAuthor;
    }
 
    public String getAuthor(){
       return author;
    }
    
    /**
     * Compile this books information as a formatted string and return it.
     * @return The books information
     */
    public StringBuilder getBookInfo() {
       StringBuilder sb = new StringBuilder();
       sb.append("Book: ");
       sb.append(System.getProperty("line.separator"));
       sb.append("  Title: ");
       sb.append(title);
       sb.append(System.getProperty("line.separator"));
       sb.append("  Author: ");
       sb.append(author);
       sb.append(System.getProperty("line.separator"));
       return sb;
    }

    /**
     * Return a a unique identifier for this book.
     */
    @Override
    public String toString(){
       return ISBN;
    }
 }