import  java.util.List;
import java.util.ArrayList;

public class BookShelf {
    private List<Book> books = new ArrayList<>();

    class  Book {
        String author;
        String title;
        int year;

        Book(String author, String title, int year) {
            this.author = author;
            this.title = title;
            this.year = year;
        }
        @Override
        public String toString() {
            return "Author: " + author + " books '" + title + "', " + year + " year of publication";
        }
    }

    class Iterator {
        int index;
        Iterator () {
            this.index = 0;
        }

        public Book checkBookcase() {
            Book book = books.get(index);

            if (this.index+1<books.size()) {
                this.index++;
                System.out.println("Iterator moves forward");
            } else {
                this.index = 0;
                System.out.println("Iterator returns to the beginning");
            }
            return  book;
        }
    }

    public int getSize() {
        return books.size();
    }

    void addBook(String author, String title, int year) {
        books.add(new Book(author,title, year));
    }

    void removeBook(int number) {
        books.remove(number);
    }

    void findBookcase() {
        System.out.println("_______________________");
        System.out.println(this.books.size() + " books on a bookshelf");
        for (Book b : books) {
            System.out.println(b);
        }
        System.out.println("_____________");
    }
}