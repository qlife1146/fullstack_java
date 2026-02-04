package hw.airport;

public class Sheet {
  private int number; // 1-9
  private Boolean status; // O or X

  public Sheet(int number, Boolean status) {
    this.number = number;
    this.status = status;
  }

  public boolean isAvailable() {
    return Boolean.TRUE.equals(status);
  }

  public void setStatus() {
    this.status = false;
  }

  @Override
  public String toString() {
    String check = null;
    if (this.status) {
      check = "O";
    } else {
      check = "X";
    }

    return this.number + ": " + check + ", ";
  }
}
