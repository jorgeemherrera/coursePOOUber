class Main {
  public static void main(String[] args) {

    Car car = new Car("AMQ123", new Account("Andres Herrera", "102040090"));
    car.passenger = 4;

    car.printDatCar();
  }
}