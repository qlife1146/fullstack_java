package hw;

public class ConvenienceStore extends Mart {
  float savingRate = 0.1f;

  public ConvenienceStore(Product[] products) {
    super(products);
  }

  public void order(Customer customer, int index, int quantity) {

    int totalPrice = products[index].getPrice() * quantity;

    if (index < 0 || index >= products.length) {
      System.out.println("존재하지 않는 인덱스");
    }
    if (customer.getPoint() >= 100) {
      if (products[index].getPrice() * quantity - customer.getPoint() > customer.getMoney()) {
        System.out.println("돈 부족");
      } else {
        if (products[index].getPrice() * quantity <= customer.getPoint()) {
          customer.setPoint(0);
          customer.setPoint(customer.getPoint() + totalPrice * savingRate);
        } else {
          customer.setPoint(0);
          customer.setMoney(customer.getMoney() - totalPrice);
          customer.setPoint(customer.getPoint() + totalPrice * savingRate);
        }
      }

    } else {
      customer.setMoney(customer.getMoney() - totalPrice);
      customer.setPoint(customer.getPoint() + totalPrice * savingRate);
    }
  }
}
