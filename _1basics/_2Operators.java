public class _2Operators {
  public static void main(String[] args) {
    // Arithmetic operators +, -, /, *, %
    int num1 = 5;
    int num2 = 12;
    System.out.println(num1 + num2);
    System.out.println(num1 - num2);
    System.out.println(num1 * num2);
    System.out.println(num2 % num1); // remainder
    System.out.println(num2 / num2); // int / int => int
    System.out.println((double) num2 / num1); // typecast

    // Unary operators + , -, !, ++, --
    int num3 = -6;
    int num4 = 4;
    System.out.println(-num3); // +6 (- of - => +)
    System.out.println(+num3); // -6 (+ of - => -)
    System.out.println(-num4); // -4 (- of + => -)

    boolean fl1 = true;
    System.out.println(!fl1); // false
    System.out.println(!!fl1); // true

    int num5 = 9;
    int num6 = num5++; // post increment => assign then incerement
    System.out.println(num6); // 9

    int num7 = 9; // pre increment => incerement then assign
    int num8 = ++num7; // pre increment => incerement then assign
    System.out.println(num8); // 10

    // Relational operators ==, !==, >, <, >=, <=
    int num9 = 5;
    int num10 = 10;
    System.out.println(num9 == num10); // false
    System.out.println(num9 != num10); // true
    System.out.println(num9 > num10); // false
    System.out.println(num9 < num10); // true
    System.out.println(num9 >= num10); // false
    System.out.println(num9 <= num10); // true

    // Logical operators &&, ||, !
    boolean fl2 = true;
    boolean fl3 = false;
    System.out.println(fl2 && fl3); // false
    System.out.println(fl2 || fl3); // true
    System.out.println(fl2 & fl3); // false
    System.out.println(fl2 | fl3); // true
    System.out.println(fl2 ^ fl3); // true
    System.out.println(!fl2); // false
    System.out.println(!fl3); // true

    // Bitwise operators &, |, ^, ~, <<, >>
    int num11 = 5; // 0101
    int num12 = 3; // 0011
    System.out.println(num11 & num12); // 0001 => 1
    System.out.println(num11 | num12); // 0111 => 7
    System.out.println(num11 ^ num12); // 0110 => 6
    System.out.println(~num11); // 1010 => -6
    System.out.println(num11 << 1); // 1010 => 10
    System.out.println(num11 >> 1); // 0010 => 2
    System.out.println(num11 >>> 1); // 0010 => 2

    // Assignment operators =, +=, -=, *=, /=, %=
    int num13 = 5;
    int num14 = 10;
    num13 += num14; // num13 = num13 + num14
    System.out.println(num13); // 15
    num13 -= num14; // num13 = num13 - num14
    System.out.println(num13); // 5
    num13 *= num14; // num13 = num13 * num14
    System.out.println(num13); // 50
    num13 /= num14; // num13 = num13 / num14
    System.out.println(num13); // 5
    num13 %= num14; // num13 = num13 % num14
    System.out.println(num13); // 5

    // Ternary operator ? :
    int num15 = 5;
    int num16 = 10;
    int max = (num15 > num16) ? num15 : num16; // if num15 > num16 then max = num15 else max = num16
    System.out.println(max); // 10

    // Instanceof operator
    String str = "Hello";
    boolean result = str instanceof String; // checks if str is an instance of String
    System.out.println(result); // true

    // Typecasting
    int num17 = 10;
    double num18 = 20.5;
    double result1 = num17 + num18; // implicit typecasting
    System.out.println(result1); // 30.5
    int num19 = (int) num18; // explicit typecasting
    System.out.println(num19); // 20
  }
}
