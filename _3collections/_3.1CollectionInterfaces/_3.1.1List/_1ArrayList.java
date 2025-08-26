import java.util.ArrayList;

public class _1ArrayList {
  public static void main(String[] args) {
    // Syntax : ArrayList<any object type> <variableName> = new ArrayList<>();
    ArrayList<Integer> ages = new ArrayList<>();
    ages.add(10);
    ages.add(20);
    ages.add(30);
    System.out.println(ages); // [10, 20, 30]

    // ------ Methods ------

    // .size() returns the number of elements in the list
    System.out.println(ages.size()); // 3

    // .get(index) returns the element at the specified index
    System.out.println(ages.get(0)); // 10

    // .remove(index) removes the element at the specified index and returns it
    System.out.println(ages.remove(1)); // 20
    System.out.println(ages); // [10, 30]

    // .add(index, element) adds the element at the specified index and shifts
    // the other elements to the right
    ages.add(1, 20);
    System.out.println(ages); // [10, 20, 30]

    // .set(index, element) replaces the element at the specified index with the
    // new element and returns the element previously at the specified position
    System.out.println(ages.set(1, 20)); // 20
    System.out.println(ages); // [10, 20, 30]

    // .isEmpty() returns true if the list is empty, false otherwise
    System.out.println(ages.isEmpty()); // false

    // .contains(element) returns true if the list contains the specified element,
    // false otherwise
    System.out.println(ages.contains(20)); // true

    // .clear() removes all elements from the list
    ages.clear();
    System.out.println(ages); // []
  }
}
