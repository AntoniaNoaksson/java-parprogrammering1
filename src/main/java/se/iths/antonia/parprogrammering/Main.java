package se.iths.antonia.parprogrammering;

public class Main {

    static void main() {
        printHeading();

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
