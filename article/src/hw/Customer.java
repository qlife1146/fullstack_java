package hw;

public class Customer {
  private int money;
  private int point;
  private int rank;

  public Customer(int money) {
    this.money = money;
    this.point = 0;
    this.rank = 0;
  }

  public Customer(int money, int point) {
    this.money = money;
    this.point = point;
    this.rank = 0;
  }

  public Customer(int money, int point, int rank) {
    this.money = money;
    this.point = point;
    this.rank = rank;
  }

  public int getMoney() {
    return this.money;
  }

  public void setMoney(int money) {
    this.money = money;
  }

  public int getPoint() {
    return this.point;
  }

  public void setPoint(int point) {
    this.point = point;
  }

  public int getRank() {
    return this.rank;
  }
}
