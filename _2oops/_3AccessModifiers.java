class Animal {
  private String name;

  Animal(String name) {
    this.name = name;
  }

  // Accessible within the same package and also in subclasses (even if the
  // subclass is in a different package). Refer to packages.md for more details.
  protected String getName() {
    return name;
  }
}

class Dog extends Animal {
  Dog(String name) {
    super(name);

    // System.out.println(this.name); // ! The field Animal.name is not visible
  }
}

public class _3AccessModifiers {
  public static void main(String[] args) {
    Dog d1 = new Dog("Cooper");
    System.out.println(d1.getName()); // This is accessible because Animal is in the same package as Dog
  }
}
