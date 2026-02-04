package com.ktdsuniversity.edu.datetime.mart;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Store {
  private List<Item> items;

  public Store(List<Item> items) {
    this.items = new ArrayList<>();
    // ASK 왜 밑에가 아닐까요
    // this.items = items;
  }

  public void addItem(Item item) {
    this.items.add(item);
  }

  public void sell(int index) {

    if (index < 0 || index >= this.items.size()) {
      System.out.println("해당 인덱스에 상품이 없습니다.");
      return;
    }

    Item indexedItem = this.items.get(index);
    System.out.println("상품명: " + indexedItem.getName() + ", 소비기한: " + indexedItem.getExpiredDate());
    /*
     * index에 할당된 제품의 소비기한이 당일이라면 "오늘까지 드세요." 출력
     * 소비기한이 3일 이내라면 "가능한 빨리 드세요." 출력
     * 소비기한이 지났다면 "소비기한이 지나 판매하지 않습니다." 출력
     */
    // ASK 3일이 필요한가?

    // 주체가 소비기한.
    LocalDate today = LocalDate.now();
    if (today.isEqual(indexedItem.getExpiredDate())) {
      System.out.println("오늘까지 드세요.");
    } else if (today.isAfter(indexedItem.getExpiredDate())) {
      System.out.println("소비기한이 지나 판매하지 않습니다.");
    } else if (today.isBefore(indexedItem.getExpiredDate())) {
      System.out.println("가능한 빨리 드세요.");
    }
  }

}
