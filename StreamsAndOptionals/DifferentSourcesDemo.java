package StreamsAndOptionals;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DifferentSourcesDemo {
  // Streams can be made from different sources
  public static void main(String[] args) {
    // From collections
    List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
    Stream<Integer> intStream = nums.stream();
    intStream.forEach(System.out::println);

    // From Arrays
    int[] numArray = { 6, 7, 8, 9 };
    IntStream arrStream = Arrays.stream(numArray);
    arrStream.forEach(System.out::println);

    // From strings
    Stream<String> strStream = Stream.of("John", "Peter");
    strStream.forEach(System.out::println);

    // From functions
    Stream<Integer> intFuncStream = Stream.iterate(0, (n) -> n + 2);
    // intFuncStream.forEach(System.out::println); // Infinite loop

    // From files
    try {
      Stream<String> fileStream = Files.lines(Path.of("StreamsAndOptionals/FirstStreamDemo.java"));
      fileStream.forEach(System.out::println);
      fileStream.close();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    // Empty Stream
    Stream<String> emptyStream = Stream.empty();
    emptyStream.forEach((s) -> System.out.println("Empty stream :" + s)); // Never printed

  }
}
