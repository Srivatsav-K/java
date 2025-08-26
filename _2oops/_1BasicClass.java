class Student {
  String name;
  int rollNumber;

  // static methods can be called without creating an object
  static void getClassName() {
    System.out.println("Class name : Student");
  }

  void setDetails(String name, int rollNumber) {
    this.name = name;
    this.rollNumber = rollNumber;
  }

  void getDetails() {
    System.out.println("Name : " + this.name);
    System.out.println("Roll Number : " + this.rollNumber);
  }
}

class _1BasicClass {
  public static void main(String[] args) {
    Student s1 = new Student();
    Student.getClassName(); // static method can be called using class name
    s1.setDetails("Sri", 10);
    s1.getDetails();
  }
}
