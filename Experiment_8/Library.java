
class Library {

    // Static nested class
    static class Book {

        private final String title;
        private final String author;
        private final String ISBN;

        // Constructor
        public Book(String title, String author, String ISBN) {
            this.title = title;
            this.author = author;
            this.ISBN = ISBN;
        }

        // Method to display book details
        public void displayDetails() {
            System.out.println("Book Details:");
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + ISBN);
        }
    }

    // Main method
    public static void main(String[] args) {
        // Creating an instance of the static nested class
        Library.Book book1 = new Library.Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0743273565");

        // Displaying book details
        book1.displayDetails();
    }
}
