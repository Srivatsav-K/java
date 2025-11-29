package StreamsAndOptionals;

import java.util.List;

public class ErrorHandlingStreams {
  public static void main(String[] args) {
    List<String> languages = List.of("JS", "Java", "Python");

    languages.stream()
        .forEach((language) -> {
          try {
            if (language == "Java") {
              throw new Exception("Bad language : " + language);
            }

            System.out.println(language);
          } catch (Exception e) {
            e.printStackTrace();
          }
        });
  }
}
