package comparator;

public class StudentComparable implements Comparable<StudentComparable> {
  int age;
  String name;

  public StudentComparable(int age, String name) {
    this.age = age;
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Student [age=" + age + ", name=" + name + ", toString()=" + super.toString() + "]";
  }

  @Override
  public int compareTo(StudentComparable that) {
    // Ascending order of age
    if (this.age > that.age) {
      return 1;
    } else {
      return -1;
    }
  }
}
