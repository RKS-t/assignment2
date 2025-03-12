package normal.kiosk2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {


        List<MenuItem> menuItems = new ArrayList<>(); //메뉴아이템 객체를 담는 컬렉션 필드 생성

        //메뉴 아이템 입력
        menuItems.add(new MenuItem("NapolyBurger", 8900, "바질마요소스에 토마토소스로 맛을 낸 나폴리맛피아식 스페셜버거")) ;
        menuItems.add(new MenuItem("BibimBurger", 6900, "전주비빔밥 라이스번과 반숙란, 고추장 소스가 어우러진 버거"));
        menuItems.add(new MenuItem("ShrimpBurger", 5900, "미니새우패티 2장의 새우 매니아를 위한버거"));
        menuItems.add(new MenuItem("TeriBurger", 3500, "쇠고기패티에 달콤 짭짤한 데리소스를 더한 가성비 버거"));

        //스캐너
        Scanner input = new Scanner(System.in);

        int order = -1;
        while (0 != order) {

            System.out.println("[LOTTERIA MENU]");
            for (MenuItem burger : menuItems) {//반복문으로 메뉴아이템 모두 출력
                int num = menuItems.indexOf(burger) + 1; //메뉴아이템 인덱스
                System.out.printf("%-20s %-10s %-50s\n", num + ". " + burger.name, "|" + burger.price + " 원|", burger.description);
            }
            System.out.println("0. 종료     | 종료");
            try {
                order = input.nextInt();
            } catch (InputMismatchException e) { //잘못된 입력에 대한 예외 처리
                System.out.println("잘못된 주문번호 입니다.");
                input.nextLine();
                continue;
            }//입력에 따른 문자 출력
            if (order == 0) {
                System.out.println("주문을 종료합니다.");
            } else if (order == 1) {
                System.out.println("NapolyBurger를 주문합니다.");
            } else if (order == 2) {
                System.out.println("BibimBurger를 주문합니다.");
            } else if (order == 3) {
                System.out.println("ShrimpBurger를 주문합니다.");
            } else if (order == 4) {
                System.out.println("TeriBurger를 주문합니다.");
            } else {
                System.out.println("잘못된 주문번호 입니다.");

            }


        }
    }
}
