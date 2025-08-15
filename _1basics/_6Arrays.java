import java.util.Arrays;

public class _6Arrays {
  public static void main(String[] args) {
    // Syntax : <dataType>[] <variableName> = {<value1>, <value2>, <value3>};
    int[] numbers = { 1, 2, 3, 4, 5 };
    System.out.println(numbers[0]);
    System.out.println(numbers); // prints the address of the array

    // Initialize an array with a specific size
    // Syntax : <dataType>[] <variableName> = new <dataType>[<size>];
    String[] names = new String[3];
    names[0] = "John";
    names[1] = "Jane";
    names[2] = "Jim";
    // names[3] = "Jill"; // ! java.lang.ArrayIndexOutOfBoundsException: Index 3 out
    // of bounds for length
    // 3
    System.out.println(names[0]);

    // Properties
    System.out.println(names.length); // prints the length of the array

    // Methods
    System.out.println(Arrays.toString(names)); // prints the array

    // 2D Arrays
    int[][] matrix = { { 1, 2 }, { 3, 4, 5 }, { 6 } };
    System.out.println(matrix[0][0]);
    System.out.println(Arrays.toString(matrix[0])); // prints the first row

    String[][] names2D = new String[2][3];
    names2D[0][1] = "John";
    System.out.println(names2D[0][1]);
    System.out.println(Arrays.deepToString(names2D)); // prints the 2D array [[null, John, null], [null, null, null]]

    // For loop
    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }

    // For each loop
    for (int number : numbers) {
      System.out.println(number);
    }
  }
}
