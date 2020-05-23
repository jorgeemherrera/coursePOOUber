class Car {
  private Integer id;
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

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getLicense() {
    return license;
  }

  public void setLicense(String license) {
    this.license = license;
  }

  public Account getDriver() {
    return driver;
  }

  public void setDriver(Account driver) {
    this.driver = driver;
  }

  
}