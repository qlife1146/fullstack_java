package hw.airport;

public class Sheet {
  private int number; // 1-9
  private Boolean status; // O or X

  public Sheet(int number, Boolean status) {
    this.number = number;
    this.status = status;
  }

  @Override
  public String toString() {
    String check = null;
    if (this.status) {
      check = "O";
    } else {
      check = "X";
    }
    // TODO: [] 없애도록 노력하기
    return this.number + ": " + check + ", ";
  }
}
