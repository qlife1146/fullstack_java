package hw;

public class Social {
  public static void main(String[] args) {
    Customer a = new Customer(100000, 20, 0);

    Product[] products = {
        new Product(10000),
        new Product(20000),
        new Product(30000),
        new Product(40000),
        new Product(50000),
    };
    Mart socialMart = new Mart(products);
    // System.out.println(socialMart.order(a.getMoney(), 0, 4));
    socialMart.order(a, 0, 5);
    System.out.println(a.getMoney());
  }
}
