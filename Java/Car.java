class Car {
  Integer id;
  String license;
  Account driver;
  private Integer passenger;

  // Constructor method
  public Car(String license, Account driver) {
    this.license = license;
    this.driver = driver;
  }

  // Method
  void printDatCar() {
    if (passenger != null) {
      System.out.println("License: " + license + " Driver: " + driver.name + " Passengers: " + passenger);
    }
  }

  // Getter
  public Integer getPassenger() {
    return passenger;
  }

  // Setter
  public void setPassenger(Integer passenger) {
    if (passenger == 4) {
      this.passenger = passenger;
    } else {
      System.out.println("You must assign 4 passengers");
    }
  }
}