package hw.airport;

public class Flight {
  private String flighNumber; // "0001"
  private int sheet; // 1-9(0-8)

  public Flight(String flighNumber, int sheet) {
    this.flighNumber = flighNumber;
    this.sheet = sheet;
  }
}
