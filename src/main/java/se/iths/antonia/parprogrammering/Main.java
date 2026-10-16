package se.iths.antonia.parprogrammering;

import se.iths.antonia.parprogrammering.model.Book;

public class Main {

    static void main() {
        printHeading();
        int avilableBooks = calculateAvilableBooks(12, 5);
        IO.println(avilableBooks);
        avilableBooks = calculateAvilableBooks(20, 8);
        IO.println(avilableBooks);

        Book book1 = new Book("Titel: Hej", "Författare: Lisa");
        Book book2 = new Book("Titel: Hunden Harry", "Författare: Magnus");
        Book book3 = new Book();

        IO.println(book1.getTitle() + " " + book1.getAuthor());
        IO.println(book2.getTitle() + " " + book2.getAuthor());
        IO.println(book3.getTitle() + ", " + book3.getAuthor());

        IO.println(book1.isBorrowed());
        book1.setBorrowed();
        IO.println(book1.isBorrowed());
        book1.returnBook();
        IO.println(book1.isBorrowed());
    }

    private static int calculateAvilableBooks(int bookCount, int borrowedBookCount) {
        return bookCount - borrowedBookCount;
    }

    private static void printHeading() {
        String libraryName = "Lilla biblioteket";
        IO.println(libraryName);
        int bookCount = 8;
        boolean isOpen = false;
        IO.println(bookCount);
        IO.println(isOpen);

        if (isOpen) {
            IO.println("Välkommen in!");
        } else {
            IO.println("Biblioteket är stängt");
        }

        int borrowedBookCount = 12;


        int avilableBookCount = bookCount - borrowedBookCount;
        IO.println("antal lediga böcker: " + avilableBookCount);

        String firstName = "Antonia";
        String lastName = "Noaksson";
        String fullName = firstName + " " + lastName;
        IO.println("Välkommen " + fullName + " till " + libraryName);


        if (avilableBookCount == 0) {
            IO.println("Finns inga böcker kvar att låna");
        } else if (avilableBookCount <= 3 && avilableBookCount >= 1) {
            IO.println("Böckerna är nästan slut");
        } else {
            IO.println("Det finns böcker kvar");
        }
        for (int i = 1; i <= bookCount; i++) {
            IO.println("book" + i);
        }

    }
}
