package hw.airport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Airport {

  /**
   * 
   * @param flights   key. 고정값(flights)
   * @param sheetsNum value. 좌석 번호 (scanner로 대체)
   */
  public static void printSheets(Map<String, List<Sheet>> flights, String sheetsNum) {
    List<Sheet> sheets = flights.get(sheetsNum);

    System.out.println("\"" + sheetsNum + "\" 편의 좌석 현황입니다. (O: 예약 가능, X: 예약 불가능)");
    System.out.println(sheets);

  }

  public static void main(String[] args) {
    Random random = new Random();
    Map<String, List<Sheet>> flights = new HashMap<>();
    flights.put("0001", new ArrayList<>());
    flights.put("0002", new ArrayList<>());
    List<Sheet> sheets0001 = flights.get("0001");
    for (int i = 0; i < 9; i++) {
      sheets0001.add(new Sheet(i + 1, random.nextBoolean()));
    }
    List<Sheet> sheets0002 = flights.get("0002");
    for (int i = 0; i < 9; i++) {
      sheets0002.add(new Sheet(i + 1, random.nextBoolean()));
    }

    Scanner sc = new Scanner(System.in);
    String flightName = null;
    int sheetNumber = 0;

    System.out.println("비행기 편의 이름을 입력하면 좌석 현황을 볼 수 있습니다.");
    System.out.print("비행기 편의 이름을 입력하세요: ");
    while (true) {
      // 1. 편명 입력(예: 0001-0009)
      while (true) {
        flightName = sc.nextLine();
        // <>해당 편명이 있는지 확인
        // F - 편명 입력으로 이동
        if (!flights.containsKey(flightName)) {
          // F - 좌석 현황 표시 및 편명 입력(1)으로 이동
          System.out.println();
          System.out.println("\"" + flightName + "\" 편은 존재하지 않습니다.");
          System.out.print("다른 비행기 편의 이름을 입력하세요: ");
          flightName = sc.nextLine();
        } else {
          if (flights.containsKey(flightName)) {
            // TODO: <>해당 편명에 남은 좌석이 있는지 확인
          }

          // T - 아래로
          // T - 좌석 현황 표시
          System.out.println("\"" + flightName + "\" 편의 좌석 현황입니다. (O: 예약 가능, X: 예약 불가능)");
          System.out.println(flights.get(flightName));
          System.out.print("좌석 예약을 하려면 번호를 입력하세요: ");
          break;
        }
      }
      // 2. 좌석 입력(예: 1-9)
      while (true) {
        sheetNumber = sc.nextInt();
        // <>올바른 숫자인지 확인
        if (!(sheetNumber > 0 && sheetNumber < 10)) {
          // F - 좌석 입력(2)으로 이동
          System.out.println("올바르지 않은 좌석 번호입니다.");
          System.out.print("좌석 번호를 다시 입력하세요: ");
        } else {
          System.out.println("hihi");
          break;
        }
      }

      while (true) {
      }
      // <> 해당 자리가 Y인지(Y = 선택 가능)
      // F - 좌석 입력(2)으로 이동
      // T - 아래로
      // 3. 예약 확인(예: y/N)
      // <>제대로된 입력값인지 확인
      // F - 예약 확인(3)으로 이동
      // T - 아래로
      // <>y인지
      // F - 편명 입력(1)으로 이동
      // T - 해당 좌석 value를 false로 변경
    }

    // System.out.println(flights.get(flightName));
    // printSheets(flights, "0001");
  }
}
