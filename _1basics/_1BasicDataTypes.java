public class _1BasicDataTypes {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    // byte -128 to 127
    byte myNum = 100; // Takes 8 bits in memory (8 bits -> 1 byte)
    System.out.println(myNum);

    // short -32,768 to 32,767
    short myShort = 10_000; // 16 bits
    System.out.println(myShort);

    // int -2^31 to 2^31 - 1
    int myInt = 50_0000; // 32 bits (use for no.s ranging between 10^7 to 10^9)
    System.out.println(myInt);

    // long -2^63 to 2^63 - 1
    long myLong = 90_0000; // 64 bits (10^10)
    System.out.println(myLong);

    // float Approx plus or minus 3.4028234E+38f
    float myFloat = 1.01f; // 32 bits (6-7 decimal digits of precision). Without f java will treat it as
                           // double.
    System.out.println(myFloat);

    // double Decimal numbers are treated as double unless specified
    double myDouble = 1.213123123123; // 64 bits (15 digits of precision)
    System.out.println(myDouble);

    // char
    char myChar = 'a';
    System.out.println(myChar);

    // boolean
    boolean myBoolean = true;
    System.out.println(myBoolean);
  }
}