class Car {
  Integer id;
  String license;
  Account driver;
  Integer passenger;

  // Constructor method
  public Car(String license, Account driver) {
    this.license = license;
    this.driver = driver;
  }

  // Method
  void printDatCar() {
    System.out.println("License: " + license + " Driver: " + driver.name);
  }
}