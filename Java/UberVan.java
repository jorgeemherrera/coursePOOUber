import java.util.ArrayList;
import java.util.Map;

public class UberVan extends Car {
  Map<String, ArrayList<Integer>> typeCarAccepted;
  ArrayList<String> seatsMaterial;

  private Integer passenger;
  
  public UberVan(
    String license,
    Account driver,
    Map<String, ArrayList<Integer>> typeCarAccepted,
    ArrayList<String> seatsMaterial) {
    super(license, driver);

    this.typeCarAccepted = typeCarAccepted;
    this.seatsMaterial = seatsMaterial;
  }

  @Override
  public void setPassenger(Integer passenger) {
    if (passenger == 6) {
      this.passenger = passenger;
    } else {
      System.out.println("You must assign 6 passengers");
    }
  }
}