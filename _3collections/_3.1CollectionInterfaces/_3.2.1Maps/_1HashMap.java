import java.util.HashMap;
import java.util.Map;

public class _1HashMap {
  public static void main(String[] args) {
    // Syntax : HashMap<key type, value type> <variableName> = new HashMap<>();
    HashMap<String, Object> mymap = new HashMap<>();

    mymap.put("name", "Sri");
    mymap.put("age", 25);
    System.out.println(mymap.getOrDefault("city", "bangalore"));

    System.out.println(mymap);

    System.out.println(mymap.get("age"));

    System.out.println(mymap.keySet());
    System.out.println(mymap.values());
    System.out.println(mymap.entrySet());

    System.out.println("Iterating a hashmap over entries");
    for (Map.Entry<String, Object> e : mymap.entrySet()) {
      System.out.println(e.getKey() + " = " + e.getValue());
    }

    System.out.println("Iterating a hashmap using forEach");
    mymap.forEach((k, v) -> {
      System.out.println(k + " : " + v);
    });

    // WORD COUNTER EXAMPLE
    String text = "apple banana apple orange banana apple";
    var words = text.split(" ");

    HashMap<String, Integer> wordCounter = new HashMap<>();

    for (var word : words) {
      // if (wordCounter.containsKey(word)) {
      // Integer currVal = wordCounter.get(word);
      // wordCounter.put(word, currVal += 1);
      // } else {
      // wordCounter.put(word, 1);
      // }

      wordCounter.put(word, wordCounter.getOrDefault(word, 0) + 1);
    }

    System.out.println(wordCounter);

    // null pointer exception
    HashMap<String, String> myMap2 = new HashMap<>();
    System.out.println(myMap2.get("myMap2").length());
  }

}
