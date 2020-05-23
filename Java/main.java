class Main {
  public static void main(String[] args) {

    UberX uberX = new UberX("AMQ123", new Account("Andres Herrera", "102040090"), "Chevrolet", "Spark");
    uberX.setPassenger(4);
    uberX.printDatCar();
  }
}