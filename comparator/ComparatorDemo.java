package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
  public static void main(String[] args) {
    List<Integer> nums = new ArrayList<>();

    nums.add(12);
    nums.add(25);
    nums.add(4);
    nums.add(1);

    System.out.println(nums); // [12, 25, 4, 1]
    System.out.println(nums.reversed());

    Collections.sort(nums);
    System.out.println(nums); // [1, 4, 12, 25]

    Collections.sort(nums.reversed());
    System.out.println(nums); // [25, 12, 4, 1]

    List<Integer> sortedNumsUsingStreams = nums.stream().sorted().toList();
    System.out.println(sortedNumsUsingStreams); // [1, 4, 12, 25]

    List<Integer> reverseSortedNumsUsingStreams = nums.reversed().stream().sorted(Comparator.reverseOrder()).toList();
    System.out.println(reverseSortedNumsUsingStreams); // [1, 4, 12, 25]

    // sort by ascending order of the last digit
    Comparator<Integer> comp = (n1, n2) -> {
      if (n1 % 10 > n2 % 10) {
        return 1;
      } else {
        return -1;
      }
    };
    Collections.sort(nums, comp);
    System.out.println(nums); // [1, 12, 4, 25]

    // Sorting classes
    List<Student> students = new ArrayList<>();

    students.add(new Student(14, "Peter"));
    students.add(new Student(12, "John"));
    students.add(new Student(13, "Zac"));

    List<Student> sortByAgeStreams = students.stream()
        .sorted(Comparator.comparingInt((student) -> student.getAge()))
        .toList();
    System.out.println(sortByAgeStreams);

    List<Student> sortByNameStreams = students.stream()
        .sorted(Comparator.comparing((student) -> student.getName()))
        .toList();
    System.out.println(sortByNameStreams);

    // Asc order of name
    Collections.sort(students, (a, b) -> {
      return a.getName().compareTo(b.getName());
    });
    students.stream().forEach(System.out::println);

    // ! This does not work as Student class does not implement Comparable
    // Collections.sort(students);

    List<StudentComparable> studentsComparable = new ArrayList<>();
    studentsComparable.add(new StudentComparable(14, "Peter"));
    studentsComparable.add(new StudentComparable(12, "John"));
    studentsComparable.add(new StudentComparable(13, "Zac"));

    Collections.sort(studentsComparable);

    studentsComparable.stream().forEach(System.out::println);

  }
}
