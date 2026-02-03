package hw.airport;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Airport {

  private static String promptFlightName(Scanner sc, Map<String, List<Sheet>> flights) {
    System.out.print("비행기 편의 이름을 입력하세요: ");
    String flightName = sc.nextLine();
    while (!flights.containsKey(flightName)) {
      System.out.println();
      System.out.println("\"" + flightName + "\" 편은 존재하지 않습니다.");
      System.out.print("다른 비행기 편의 이름을 입력하세요: ");
      flightName = sc.nextLine();
    }
    return flightName;
  }

  private static boolean hasAvailableSeat(Map<String, List<Sheet>> flights, String flightName) {
    List<Sheet> sheets = flights.get(flightName);
    for (Sheet sheet : sheets) {
      if (sheet.isAvailable()) {
        return true;
      }
    }
    return false;
  }

  private static void reserveSeat(Scanner sc, Map<String, List<Sheet>> flights, String flightName) {
    printSheets(flights, flightName);
    while (true) {
      System.out.print("좌석 예약을 하려면 번호를 입력하세요: ");
      int sheetNumber = sc.nextInt();
      if (sheetNumber < 1 || sheetNumber > 9) {
        System.out.println("올바르지 않은 좌석 번호입니다.");
        continue;
      }

      Sheet choice = flights.get(flightName).get(sheetNumber - 1);
      if (!choice.isAvailable()) {
        System.out.println("\"" + sheetNumber + "\"번 좌석은 이미 예약된 좌석입니다. 다른 좌석을 입력하세요: ");
        System.out.println();
        continue;
      }

      System.out.print("\"" + sheetNumber + "\"번 좌석을 예약하시겠습니까? (y/N): ");
      String answer = sc.next();
      if (answer.equals("y")) {
        choice.setStatus();
        System.out.println("\"" + sheetNumber + "\"번 좌석이 예약되었습니다.");
        break;
      } else {
        System.out.println("예약을 취소했습니다. 처음으로 돌아갑니다.");
        System.out.println();
      }
    }
  }

  /**
   * 
   * @param flights   key. 고정값(flights)
   * @param sheetsNum value. 좌석 번호 (scanner로 대체)
   */
  public static void printSheets(Map<String, List<Sheet>> flights, String sheetsNum) {
    List<Sheet> sheets = flights.get(sheetsNum);

    System.out.println("\"" + sheetsNum + "\" 편의 좌석 현황입니다. (O: 예약 가능, X: 예약 불가능)");
    System.out.println(sheets);
    System.out.println();

  }

  public static void main(String[] args) {
    Random random = new Random();
    Map<String, List<Sheet>> flights = new HashMap<>();
    flights.put("0001", new ArrayList<>());
    flights.put("0002", new ArrayList<>());
    List<Sheet> sheets0001 = flights.get("0001");
    for (int i = 0; i < 9; i++) {
      // sheets0001.add(new Sheet(i + 1, random.nextBoolean()));
      sheets0001.add(new Sheet(i + 1, false));
    }
    List<Sheet> sheets0002 = flights.get("0002");
    for (int i = 0; i < 9; i++) {
      sheets0002.add(new Sheet(i + 1, random.nextBoolean()));
    }

    Scanner sc = new Scanner(System.in);
    String flightName = null;
    int sheetNumber = 0;

    System.out.println("비행기 편의 이름을 입력하면, 좌석 현황을 볼 수 있습니다.");
    while (true) {
      // 1. 편명 입력(예: 0001-0009)
      flightName = promptFlightName(sc, flights);

      if (!hasAvailableSeat(flights, flightName)) {

        printSheets(flights, flightName);
        System.out.println("예약 가능한 좌석이 없습니다. 다른 비행기 편을 이용해 주세요.");
        System.out.println();
        continue;
      }
      // 2. 좌석 입력(예: 1-9)
      // T - 아래로
      // T - 좌석 현황 표시
      System.out.println("");

      while (true) {
        reserveSeat(sc, flights, flightName);
        break;
        // // TODO: isAvailable sheet check (y/N) (no Y or n, just use 'y' and 'N')
        // // TODO: and if isAvailable True = reservation check
        // // TODO: or False = Plz choose another sheetNumber

      }
      break;
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
  }
}
