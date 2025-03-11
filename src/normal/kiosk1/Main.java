package normal.kiosk1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int order = 10;
            while (0!=order) {
                try {
                    System.out.println("[LOTTERIA MENU]");
                    System.out.println("1. NapolyBurger    | W 8.9 | 바질마요소스에 토마토소스로 맛을 낸 나폴리맛피아식 스페셜버거");
                    System.out.println("2. BibimBurger     | W 6.9 | 전주비빔밥 라이스번과 반숙란, 고추장 소스가 어우러진 버거");
                    System.out.println("3. ShrimpBurger    | W 5.9 | 미니새우패티 2장의 새우 매니아를 위한버거");
                    System.out.println("4. Teriburger      | W 3.5 | 쇠고기패티에 달콤 짭짤한 데리소스를 더한 가성비 버거");
                    System.out.println("0. 종료     | 종료");
                    order = input.nextInt();
                    if (order == 0) {
                        System.out.println("주문을 종료합니다.");
                    } else if (order == 1) {
                        System.out.println("NapolyBurger를 주문합니다.");
                    } else if (order == 2) {
                        System.out.println("BibimBurger를 주문합니다.");
                    } else if (order == 3) {
                        System.out.println("ShrimpBurger를 주문합니다.");
                    } else if (order == 4) {
                        System.out.println("Teriburger를 주문합니다.");
                    } else {
                        System.out.println("잘못된 주문번호 입니다.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("잘못된 주문번호 입니다.");
                    input.nextLine();
                    return;
            }

        }
    }
}
