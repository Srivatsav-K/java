class Vehicle {
  private String vehicleNumber;

  Vehicle(String vehicleNumber) {
    this.vehicleNumber = vehicleNumber;
  }

  String getVehicleNumber() {
    return this.vehicleNumber;
  }

  String honk() {
    return "Honk honk!!";
  }
}

class Car extends Vehicle {

  Car(String vehicleNumber) {
    super(vehicleNumber);
  }

  String getCarNumber() {
    return this.getVehicleNumber();
  }

  @Override // This is a way to tell the compiler that we are overriding the method in the
            // parent class (polymorphism)
  String honk() {
    return "Car is honking";
  }
}

public class _4Inheritance {
  public static void main(String[] args) {
    Car c1 = new Car("1234");
    System.out.println(c1.getCarNumber());
    System.out.println(c1.honk());
  }
}
