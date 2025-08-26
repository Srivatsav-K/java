# Java packages

In Java, a package is basically a namespace (and a folder structure) that groups related classes, interfaces, and sub-packages together.

Think of it as:

- A folder on disk → for organizing .class and .java files
- A name prefix → to avoid class name conflicts

## Why Packages Exist

1. Organization → Keep related code in logical groups (e.g., java.util for utility classes, java.io for input/output).

2. Name conflict avoidance → Two classes can have the same name if they’re in different packages (com.example.User vs org.example.User).

3. Access control → protected and package-private (default) access modifiers use packages to determine visibility.

4. Reusability → You can import packages into other projects.

## Declaring a Package

At the top of your .java file:

```java
package animals;

public class Dog {
  public void bark() {
    System.out.println("Woof!");
  }
}
```

The file must be saved in a folder named animals:

```markdown
project/
└── animals/
└── Dog.java
```

## Using a Package

```java
import animals.Dog;

public class Main {
  public static void main(String[] args) {
      Dog d = new Dog();
      d.bark();
  }
}
```

## Package Types

1. Built-in packages → provided by Java (e.g., java.util, java.io, java.net)

2. User-defined packages → you create them for your own code
