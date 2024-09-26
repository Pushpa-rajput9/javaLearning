package Library;

class lib {
    String[] books;
    int no_of_books;

    lib() {
        this.books = new String[20];
        no_of_books = 0;
    }

    void addBook(String book) {
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " book has been added to library");
    }

    void showAvailableBook() {
        System.out.println("Available books are :-");
        for (String b : this.books) {
            if (b == null) {
                continue;
            }
            System.out.println("* " + b);
        }
    }

    void issueBook(String book) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i].equals(book)) {
                System.out.println(book + " book has been issued");
                this.books[i] = null;
                return;
            }

        }
    }

    void returnBook(String book) {
        System.out.println("you returned book " + book);
        addBook(book);

    }
}

public class Library {
    public static void main(String[] args) {
        lib L = new lib();
        L.addBook("java");
        L.addBook("c++");
        L.addBook("python");
        L.addBook("json");
        L.showAvailableBook();
        L.issueBook("c++");
        L.issueBook("json");
        L.showAvailableBook();
        L.returnBook("c++");
        L.showAvailableBook();
    }
}
