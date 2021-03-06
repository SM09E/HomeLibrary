package homeLibrary.entity;
// Generated 04.10.2012 22:18:59 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Books generated by hbm2java
 */
public class Books  implements java.io.Serializable {


     private Integer bookId;
     private String bookName;
     private String bookStatus;
     private Set booksAuthorses = new HashSet(0);

    public Books() {
    }

	
    public Books(String bookName, String bookStatus) {
        this.bookName = bookName;
        this.bookStatus = bookStatus;
    }
    public Books(String bookName, String bookStatus, Set booksAuthorses) {
       this.bookName = bookName;
       this.bookStatus = bookStatus;
       this.booksAuthorses = booksAuthorses;
    }
   
    public Integer getBookId() {
        return this.bookId;
    }
    
    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }
    public String getBookName() {
        return this.bookName;
    }
    
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getBookStatus() {
        return this.bookStatus;
    }
    
    public void setBookStatus(String bookStatus) {
        this.bookStatus = bookStatus;
    }
    public Set getBooksAuthorses() {
        return this.booksAuthorses;
    }
    
    public void setBooksAuthorses(Set booksAuthorses) {
        this.booksAuthorses = booksAuthorses;
    }




}


