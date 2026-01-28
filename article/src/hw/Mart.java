package hw;

public class Mart {
  Product[] products;

  public Mart(Product... products) {
    this.products = new Product[products.length];
    for (int index = 0; index < products.length; index++) {
      this.products[index] = products[index];
    }
  }

  public Product[] getProducts() {
    return this.products;
  }

  public void order(Customer customer, int index, int quantity) {
    int totalPrice = products[index].getPrice() * quantity;
    if (index < 0 || index >= products.length) {
      System.out.println("존재하지 않는 인덱스");
    }
    if (products[index].getPrice() * quantity > customer.getMoney()) {
      System.out.println("돈 부족");
    }

    customer.setMoney(customer.getMoney() - totalPrice);
  }
}
