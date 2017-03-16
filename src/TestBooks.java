/**
 * Created by hgoscenski on 1/17/17.
 */
//Worked on in conjunction with Eduardo Soto (Harrison Goscenski)

//Probably an hour maybe two hours if you count absent minded thinking.
//Book        1,2,3,4
//BookList    1,2,3,4,5,6,7,8
//TestBooks   1,2,3,4,5,6,7,8



public class TestBooks {

    public static void main(String args[]) {
        //Put this code at the start of your main. DO NOT CHANGE IT AT ALL
//If this code does not compile, there is a problem with your class definitions, change them instead
        Book b1;
        Book b2;
        Book b3;
        BookList myBooks;
        BookList wishList;

        b1 = new Book("Through the Looking Glass", "Lewis Carroll", 1871, 140);
        b2 = new Book("Alice's Adventures in Wonderland", "Lewis Carroll", 1865, 125);
        b3 = new Book("Principia Mathematica", "Alfred North Whitehead and Bertrand Russell", 1910, 509);

        myBooks = new BookList("My Own Books", 100);
        wishList = new BookList("Wish List", 10);
        myBooks.addBook(b1);
        myBooks.addBook(b2);
        wishList.addBook(b3);
//End of mainStarter

        // Initializing the 2 new books

        Book b4, b5;

        // Printing out what is in each BookList

        System.out.println("Hello this is a Title or subject line");
        System.out.println(myBooks.toString());
        System.out.println(wishList.toString());

        // Creating and constructing the 2 new books

        b4 = new Book("Harry Potter", "JK Rowling", 1997, 350);
        b5 = new Book("The Magicians", "Lev Grossman", 2009, 400);

        // Adding the new books to both lists

        myBooks.addBook(b4);
        myBooks.addBook(b5);
        wishList.addBook(b4);
        wishList.addBook(b5);

        // Updating the 2 books by Lewis Carroll

        b1.updateBook(2008, 200);
        b2.updateBook(2007, 100);

        // Checking if Alice's Adventures in Wonderland is in one, both, or neither lists

        bookCheck(b2, myBooks);
        bookCheck(b2, wishList);

        // Printing out the results of seeing if any books by Edgser Dijkstra are in the wish list

        System.out.println("The result of searching \"wishList\" for \"Edgser Dijkstra\": " + wishList.findByAuthor("Edgser Dijkstra") + "\n");

        // Printing list name and then all the books in the list

        printInfo(myBooks);
        printInfo(wishList);

    }

    // Making method to print out list name and then call the toString to produce a nicely formatted System.out.println() out of what is in the list

    public static void printInfo(BookList list){
        System.out.println(list.getListName());
        System.out.println("Has " + list.numberOfBooks() + " books on it, they are: ");
        System.out.println(list.toString());
    }

    // Making a method to check if a certain book is in a certain list for extensibility

    public static void bookCheck(Book bookToTest, BookList listToCheck){
        if(listToCheck.isOnList(bookToTest)){
            System.out.println(bookToTest.getTitle() + " was found on " + listToCheck.getListName() + " and has " + bookToTest.getPages() + " pages.\n");
        } else { System.out.println(bookToTest.getTitle() + " was not found on " + listToCheck.getListName() +"\n");}
    }

}
