class Employee {
  String name;
  int id;

  // constructor is a special method that is used to initialize objects
  // it is called when an object of a class is created
  // it must have the same name as the class
  // it does not have a return type
  // it is used to initialize objects
  Employee(String name, int id) {
    this.name = name;
    this.id = id;
  }

  // constructor overloading (no. of parameters)
  Employee(String name) {
    this.name = name;
  }

  // constructor overloading
  Employee() {
    System.out.println("Default constructor called");
  }

  // constructor overloading (order of parameters)
  Employee(int id, String name) {
    this.name = name;
    this.id = id;
  }
}

public class _2Constructor {
  public static void main(String[] args) {
    Employee e1 = new Employee("Sri", 10);
    System.out.println(e1.name);
    System.out.println(e1.id);

    Employee e2 = new Employee();
    System.out.println(e2.name); // null
    System.out.println(e2.id); // 0

    Employee e3 = new Employee("Sri");
    System.out.println(e3.name); // Sri
    System.out.println(e3.id); // 0

    Employee e4 = new Employee(10, "Sri");
    System.out.println(e4.name); // Sri
    System.out.println(e4.id); // 10
  }
}
