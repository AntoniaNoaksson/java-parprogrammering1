package se.iths.antonia.parprogrammering;

public class Main {

    static void main() {
        String libraryName = "Lilla biblioteket";
        int bookCount = 12;
        boolean isOpen = false;
        int borrowedBookCount = 8;
        IO.println(libraryName);
        IO.println(bookCount);
        IO.println(isOpen);
        int avilableBookCount = bookCount - borrowedBookCount;
        IO.println("antal lediga böcker: " + avilableBookCount);

        String firstName = "Antonia";
        String lastName = "Noaksson";
        String fullName = firstName + " " + lastName;
        IO.println("Välkommen " + fullName + " till " + libraryName);

        if(isOpen){
            IO.println("Välkommen in!");
        }
        else {
            IO.println("Biblioteket är stängt");
        }

    }
}
