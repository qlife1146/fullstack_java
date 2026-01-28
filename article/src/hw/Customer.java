package hw;

public class Customer {
  private int money;
  private float point;
  private int rank;

  public Customer(int money, int rank) {
    this.money = money;
    this.point = 0;
    this.rank = rank;
  }

  public Customer(int money, float point, int rank) {
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

  public float getPoint() {
    return this.point;
  }

  public void setPoint(float point) {
    this.point = point;
  }

  public int getRank(int rank) {
    return this.rank;
  }
}