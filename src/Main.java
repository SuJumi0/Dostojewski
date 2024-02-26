public class Main {
    public static void main(String[] args) {
        BookShelf bookcase1 = new BookShelf();
        bookcase1.addBook("F.M.Dostojewski", "Schuld und Sühne", 1866);
        bookcase1.addBook("F.M.Dostojewski", "Die Brüder Karamasow", 1880);
        bookcase1.addBook("F.M.Dostojewski", "Weiße Nächte", 1848);
        bookcase1.addBook("F.M.Dostojewski", "Die Besessenen", 1872);
        bookcase1.addBook("F.M.Dostojewski", "Der Spieler", 1866);
        bookcase1.addBook("F.M.Dostojewski", "Arme Leute", 1846);
        bookcase1.addBook("F.M.Dostojewski", "Der Idiot", 1869);
        bookcase1.addBook("F.M.Dostojewski", "Aufzeichnungen aus dem Kellerloch", 1864);
        bookcase1.addBook("F.M.Dostojewski", "Die Sanfte", 1876);
        bookcase1.findBookcase();
        System.out.println("Deleting a book with index 3");
        bookcase1.removeBook(3);
        bookcase1.findBookcase();


        System.out.println("Create an iterator");
        BookShelf.Iterator myIterator = bookcase1.new Iterator();
        for (int i = 0; i < bookcase1.getSize(); i++)
            System.out.println(myIterator.checkBookcase());
        myIterator.checkBookcase();

    }
}