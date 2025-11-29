package StreamsAndOptionals.Terminal;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import StreamsAndOptionals.Intermediate.Book;

public class TerminalOperationsChallengesDemo {

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

    // Total cost of all the books in the bookstore
    double totalCost = books.stream()
        .mapToDouble((book) -> book.getPrice())
        .reduce(0, (acc, currPrice) -> acc + currPrice);
    System.out.println(totalCost);

    // Collecting Books into a List of titles
    List<String> titleList = books.stream()
        .map(book -> book.getTitle())
        .collect(Collectors.toList());
    System.out.println(titleList);

    // Group books by category
    Map<String, List<Book>> bookGroupedByCategory = books.stream()
        .collect(Collectors.groupingBy((book) -> {
          return book.getCategory();
        }));
    bookGroupedByCategory.forEach((category, booksInCategory) -> {
      System.out.println("Printing books of category : " + category);

      booksInCategory.forEach(System.out::println);

      System.out.println();
    });

  }

}
