package com.ktdsuniversity.edu.datetime.mart;

import java.util.ArrayList;
import java.util.List;

public class Store {
  private List<Item> items;

  public Store(List<Item> items) {
    this.items = new ArrayList<>();
  }

  public void addItem(Item item) {
    // TODO Item 추가
    this.items.add(item);
  }

  // TODO 조건에 맞는 코드 작성
  public void sell(int index) {
    /*
     * index에 할당된 제품의 소비기한이 당일이라면 "오늘까지 드세요." 출력
     * 소비기한이 3일 이내라면 "가능한 빨리 드세요." 출력
     * 소비기한이 지났다면 "소비기한이 지나 판매하지 않습니다." 출력
     */
  }

}
