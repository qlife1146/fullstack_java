package com.ktdsuniversity.edu.restaurant;

public class Restaurant {
  Menu[] menues;

  private int standardHunger;
  private float standardTipsiness;

  public Restaurant(int standardFull, float standardDrunk, Menu... menues) {
    this.standardHunger = standardFull;
    this.standardTipsiness = standardDrunk;
    if (menues == null) {
      // null 입력 방어: 빈 배열로 대체
      this.menues = new Menu[0];
      return;
    }
    this.menues = new Menu[menues.length];
    for (int i = 0; i < menues.length; i += 1) {
      this.menues[i] = menues[i];
    }
  }

  public Menu getMenu(int index) {
    if (this.menues == null) {
      throw new NullPointerException("메뉴 목록이 없습니다.");
    }
    if (index < 0 || index >= this.menues.length) {
      throw new ArrayIndexOutOfBoundsException("메뉴 인덱스가 범위를 벗어났습니다: " + index);
    }
    if (this.menues[index] == null) {
      throw new NullPointerException("해당 인덱스의 내용이 nil입니다.");
    }
    return this.menues[index];
  }

  public boolean isFull(int hunger) {
    return hunger >= getStandardHunger();
  }

  public boolean isDrunk(float tipsiness) {
    return tipsiness >= getStandardTipsiness();
  }

  public int getStandardHunger() {
    return this.standardHunger;
  }

  public float getStandardTipsiness() {
    return this.standardTipsiness;
  }
}
