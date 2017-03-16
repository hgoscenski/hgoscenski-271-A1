/**
 * Created by hgoscenski on 1/17/17.
 */

import java.util.ArrayList;
import java.util.Iterator;

// Using ArrayList since there is not a set size of a list and the ArrayList allows for adding and removing items freely
// Could instead create an array and instantiate it with the maximum number of Books...
// But that would be more inefficient, at least in my eyes

public class BookList {
    private String listName;
    private ArrayList<Book> bookArray;
    private Iterator<Book> it;

    public BookList(String listName, int numBooks){
        this.listName = listName;
        bookArray = new ArrayList();
    }

    // Getter for name of the list

    public String getListName() {
        return listName;
    }

    // Adding books to list

    public void addBook(Book newBook){
        bookArray.add(newBook);
    }

    // Returning the number of books simply by using .size() for the ArrayList

    public int numberOfBooks(){
        return(bookArray.size());
    }

    // Uses a loop through the entire ArrayList to check for the Book object
    // Upon further revision I am using an iterator since it is the proper way to go through an ArrayList

    public boolean isOnList(Book bookCheck){
        it = bookArray.iterator();
        while(it.hasNext()){
            if(it.next() == bookCheck){
                return true;
            }
        } return false;
//        int arraySize = bookArray.size()-1;
//        for(int i = 0; i < arraySize; i++){
//            if(bookArray.get(i) == bookCheck){
//                return true;
//            }
//        } return false;
    }

    // Uses another loop to check entire ArrayList for a Book object with specified author without care for case
    // HAHA an Iterator instead!

    public Book findByAuthor(String author){
        it = bookArray.iterator();
        while(it.hasNext()){
            if(it.next().getAuthor().equalsIgnoreCase(author)){
                return it.next();
            }
        } return null;
//        int arraySize = bookArray.size()-1;
//        for(int i = 0; i < arraySize; i++){
//            if(bookArray.get(i).getAuthor().equalsIgnoreCase(author)){
//                return bookArray.get(i);
//            }
//
//        } return null;
    }

    // Another loop, I should have used the Iterator but alas I am too far in now!
    // Takes all the toStrings from the Book objects and splices them into one toString for the
    // Well I went back through using an Iterator.

    public String toString(){
        it = bookArray.iterator();
        String books = "";
        while(it.hasNext()){
            books += it.next().toString() + "\n";
        } return books;
//        int arraySize = bookArray.size()-1;
//        String books ="";
//        for(int i = 0; i <= arraySize; i++){
//            books += bookArray.get(i).toString() + "\n";
//        }
//        return books;
    }

    // The last loop!
    // Simply adds all the pages of all the books on the list together
    // this is not an loop!

    public int totalPages(){
        it = bookArray.iterator();
        int pagesOfBooks = 0;
        while(it.hasNext()){
            pagesOfBooks += it.next().getPages();
        } return pagesOfBooks;
//        int arraySize = bookArray.size()-1;
//        int pagesOfBooks = 0;
//        for(int i = 0; i <= arraySize; i++){
//            pagesOfBooks += bookArray.get(i).getPages();
//        }
//        return pagesOfBooks;
    }




}
