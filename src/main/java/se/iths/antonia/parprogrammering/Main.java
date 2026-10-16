package se.iths.antonia.parprogrammering;

public class Main {

    static void main() {
        String libraryName = "Lilla biblioteket";
        int bookCount = 12;
        boolean isOpen = false;
        int borrowedBookCount = 12;
        IO.println(libraryName);
        IO.println(bookCount);
        IO.println(isOpen);
        int avilableBookCount = bookCount - borrowedBookCount;
        IO.println("antal lediga böcker: " + avilableBookCount);

        String firstName = "Antonia";
        String lastName = "Noaksson";
        String fullName = firstName + " " + lastName;
        IO.println("Välkommen " + fullName + " till " + libraryName);

        if (isOpen) {
            IO.println("Välkommen in!");
        } else {
            IO.println("Biblioteket är stängt");
        }

        if (avilableBookCount == 0) {
            IO.println("Finns inga böcker kvar att låna");
        } else if (avilableBookCount <= 3 && avilableBookCount >= 1) {
            IO.println("Böckerna är nästan slut");
        } else {
            IO.println("Det finns böcker kvar");
        }

    }
}
