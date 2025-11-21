package StreamsAndOptionals.Intermediate;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateDemo {
  public static void main(String[] args) {

    List<Book> books = List.of(
        new Book("The Great Gatsby", "1925-04-10", 15.99, "Classic"),
        new Book("Clean Code", "2008-08-01", 42.50, "Technology"),
        new Book("Sapiens: A Brief History of Humankind", "2011-09-04", 18.00, "History"),
        new Book("The Hobbit", "1937-09-21", 12.99, "Fantasy"),
        new Book("Effective Java", "2017-12-27", 52.00, "Technology"),
        new Book("1984", "1949-06-08", 9.99, "Fiction"),
        new Book("Atomic Habits", "2018-10-16", 21.50, "Self-Help"),
        new Book("Project Hail Mary", "2021-05-04", 19.99, "Sci-Fi"),
        new Book("Design Patterns", "1994-10-21", 55.99, "Technology"),
        new Book("Dune", "1965-08-01", 14.95, "Sci-Fi"),
        new Book("Thinking, Fast and Slow", "2011-10-25", 16.99, "Psychology"),
        new Book("The Pragmatic Programmer", "1999-10-30", 39.99, "Technology"),
        new Book("The Pragmatic Programmer", "1999-10-30", 39.99, "Technology"),
        new Book("Future is doomed book", "2026-10-30", 30.99, "Sci-Fi"));

    // 1. Filtering: Books cheaper than $30
    List<Book> booksCheaperThan30 = books.stream().filter(book -> book.getPrice() < 30).toList();
    System.out.println(booksCheaperThan30.size());
    System.out.println(booksCheaperThan30);

    // 2. Mapping: Convert book titles to uppercase
    List<Book> uppercasedBookTitles = books.stream()
        .map(book -> {
          book.setTitle(book.getTitle().toUpperCase());
          return book;
        })
        .toList();
    System.out.println(uppercasedBookTitles);

    List<String> uppercasedBookTitles2 = books.stream()
        .map(book -> book.getTitle().toUpperCase())
        .toList();
    System.out.println(uppercasedBookTitles2);

    // 3. Sorting: Books by publication date
    Stream<Book> sortedBooksByPubDate = books.stream()
        .sorted(Comparator.comparing(book -> LocalDate.parse(book.getPublicationDate())));
    sortedBooksByPubDate.forEach(book -> System.out.println(book.getPublicationDate()));

    List<Book> sortedBooksByPrice = books.stream()
        .sorted(Comparator.comparingDouble((Book book) -> book.getPrice()).reversed())
        .toList();
    System.out.println(sortedBooksByPrice);

    // 4. Distinct: Remove duplicate titles
    Stream<Book> distinctStream = books.stream().distinct(); // hashCode() & equals() must be implemented in Book class
    distinctStream.forEach(System.out::println);

    // 5. Limit: Display only the first 3 books
    Stream<Book> first3Books = books.stream().limit(3);
    System.out.println("\n Printing first 3 books : \n");
    first3Books.forEach(System.out::println);

    // 6. Skip: Skip the first 2 books
    Stream<Book> skipFirst2Books = books.stream().skip(2);
    System.out.println("\n Skipping first 2 books : \n");
    skipFirst2Books.forEach(System.out::println);

    // - Classics Collection: The bookstore is launching a classics collection.
    // Identify and display books that were published before the year 2000.
    Stream<Book> classicBooks = books.stream().filter(book -> {
      String[] dateSplit = book.getPublicationDate().split("-");
      int year = Integer.parseInt(dateSplit[0]);
      return year < 2000;
      // return LocalDate.parse(book.publicationDate).getYear() < 2000;
    });
    System.out.println("\n Classic books older than 2000 : \n");
    classicBooks.forEach(System.out::println);

    // - Upcoming Titles: Generate a list of future book titles for the next year
    // by adding the suffix "(Coming Soon)" to the titles.
    int currentYear = 2025;
    // int currentYear = LocalDate.now().getYear();
    Stream<Book> futureBooks = books.stream()
        .filter(book -> {
          int publishYear = LocalDate.parse(book.getPublicationDate()).getYear();
          return publishYear == currentYear + 1;
        });
    System.out.println("\n Books tagged coming soon : \n");
    futureBooks.forEach(book -> {
      book.setTitle(book.getTitle() + " (Coming soon)");
      System.out.println(book);
    });

    // - Rare Books: The bookstore believes there might be rare books in the
    // collection. A rare book is one where the title has more than 20
    // characters. Identify and display these books.
    Stream<Book> rareBooks = books.stream().filter(book -> book.getTitle().length() > 20);
    System.out.println("\n Rare books : \n");
    rareBooks.forEach(book -> System.out.println("Title length :" + book.getTitle().length() + " " + book));

  }
}
