package hw;

public class BuySellTest {
  public static void main(String[] args) {
    Seller seller = new Seller();
    seller.money = 0;
    seller.productAmount = 10;
    seller.sell(5);

    System.out.println("판매자 재고 수: " + seller.productAmount);
    System.out.println("판매자 자본금: " + seller.money);
    System.out.println();

    Buyer buyer = new Buyer();
    buyer.money = 8000;
    buyer.maxWeight = 5000;
    buyer.cartCount = 0;
    buyer.buy(10);
    System.out.println("구매자 상품 수: " + buyer.cartCount);
    System.out.println("구매자 장바구니 무게: " + buyer.cartWeight+"/"+buyer.maxWeight);
    System.out.println("구매자 소지금: " + buyer.money);
  }
}
