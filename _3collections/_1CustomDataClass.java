// We can create custom classes to hold the data types we want if java doesnt provide one. 
// For example the below class could hold both an int and String
class MyData {
  private int num;
  private String str;

  MyData(int num, String str) {
    this.num = num;
    this.str = str;
  }

  public int getNum() {
    return num;
  }

  public String getStr() {
    return str;
  }

  public void setNum(int num) {
    this.num = num;
  }

  public void setStr(String str) {
    this.str = str;
  }
}

class _1CustomDataClass {
  public static void main(String[] args) {
    MyData myData1 = new MyData(10, "Sri");
    System.out.println(myData1.getNum());
    System.out.println(myData1.getStr());
  }
}
