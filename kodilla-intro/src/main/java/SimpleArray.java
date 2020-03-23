public class SimpleArray {
    public static void main(String[]args) {

        String[] books = new String[] {"The Girl on the Train", "Hobbit", "Game of Thrones", "The Great Gatsby", "Brave New World"};

        String book = books[3];
        System.out.println(book);

        int numberOfElements = books.length;

        System.out.println("Moja tablica zawiera " + numberOfElements + " książek.");
    }
}
