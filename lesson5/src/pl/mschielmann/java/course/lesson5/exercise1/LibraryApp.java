package pl.mschielmann.java.course.lesson5.exercise1;

public class LibraryApp {

    /*
        Imagine you work in a library and you need to store info about the books you have available.
        1) Create a Book class with info about the title, author, genre, publisher, printing date.
        2) Create a Library class with name argument. A library should have multiple bookshelves. Start with 2.
        3) Create a Bookshelf class. Each bookshelf should have multiple shelves.
            Constructor should accept the number of shelves available on this bookshelf. Create 2 bookshelfs with 2 shelves each.
        4) Create a Shelf class. Each shelf should have a place for 'numberOfBooks' books.
            Constructor should have the 'numberOfBooks' parameter. Create shelves with 5 places each.
        4a) You may put (hardcode) some books on the shelves on your own - add 17 books, make 1st bookshelf full.
            make sure they are there when you start the program. This is only for the next 2 points.
        5) Create a Registry class. Registry should hold info about a book title
           and about its place in the library - id of the bookshelf, id of the shelf and position in the shelf.
           The registry should also contain info about the book availability - if its 'available' or 'lent'.
           Print everything in the library.
        6) Create a class called RegistryPrinter that would print everything from the Registry.
        7)  Assuming you have 1 copy of each book, make a 'lendBook' method, to lend a specific title.
            The method should accept 'title' as input parameter. Borrow a book and use RegistryPrinter to print all again.
        7*) Add a 'addBook' method to a Bookshelf class a method that would add book to the first available place,
            String from the highest (first) shelf. If there is no place on the bookshelf, the mehtod should return -1.
            If the book was successfully placed, return 1.


    */

    public static void main(String[] args) {

    }
}
