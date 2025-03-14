package challenge.kiosk2;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Kiosk {
    Scanner input = new Scanner(System.in);
    Menu menu = new Menu();
    Cart cart = new Cart();


    //생성자
    public Kiosk(){}
    //함수
    public void start( ){
            int order = -1;
            int suborder ;

        while (0 != order) {

            System.out.println("[LOTTERIA MENU]");  //가장 상위 메뉴판
            for (String menuList : menu.getMenu()) {
                int num = menu.getMenu().indexOf(menuList) + 1;
                System.out.printf("%-20s\n",
                        num + ". " + menuList
                );
            }
            System.out.println("0. 종료     | 종료");

            if (!cart.getOrderList().isEmpty()) {   //조건문으로 장바구니가 비어있지 않으면 표시
                System.out.println("[ORDER MENU]");
                System.out.println(menu.getMenuItemList().size() + 1 + ". Orders        |장바구니를 확인 후 주문합니다.");
                System.out.println(menu.getMenuItemList().size() + 2 + ". Cancel        |진행중인 주문을 취소합니다.");
            }
            try {
                order = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다.");
                continue;  //잘못된 입력이 들어오면 반복문 다시시작 하도록 예외처리
            }
            if (order == 0) { //order=0 일때 주문 종료
                System.out.println("주문을 종료합니다.");
            } else if (order <= menu.getMenuItemList().size() && order > 0) { //아이템 리스트 (버거 음료수 등등) 만큼의 범위
                menu.showMenuItemList(order - 1); //메뉴에 있는 보여주기 함수
                try {
                    suborder = input.nextInt(); //다음 주문 입력
                } catch (InputMismatchException e) {
                    System.out.println("잘못된 입력입니다.");
                    continue; //잘못된 입력이 들어오면 반복문 다시시작 하도록 예외처리
                }
                if (suborder <= menu.getMenuItemList().get(order - 1).size() && suborder > 0) { //아이템 종류 만큼의 범위
                    System.out.print("선택한 메뉴: ");
                    menu.getMenuItemList().get(order - 1).get(suborder - 1).showMenuItem(); //메뉴 아이템에 있는 보여주기 함수
                    cart.addItem(menu.getMenuItemList().get(order - 1).get(suborder - 1)); //선택한 아이템을 카트에 추가
                } else if (suborder == 0) {
                    continue; //0 입력시 와일문 처음으로 돌아가 반복
                } else {
                    System.out.println("잘못된 주문번호 입니다. 메뉴판으로 돌아갑니다."); //입력한 번호가 범위를 벗어났을때 표시
                }
            } else if (!cart.getOrderList().isEmpty() && order == menu.getMenuItemList().size() + 1) {  //해당번호 선택시 주문
                System.out.println("아래와 같이 주문하시겠습니까?");
                int totalPrice = cart.showOrder();
                System.out.println("1.주문       2.메뉴판");
                int finalOrder;
                try {
                    finalOrder = input.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("잘못된 입력입니다.");
                    continue; //잘못된 입력이 들어오면 반복문 다시시작 하도록 예외처리
                }
                if (finalOrder == 1) {
                    System.out.println("할인 정보를 입력해 주세요");
                    for (Customer customer : Customer.values()) {
                        System.out.printf("%-10s %-10s\n", (customer.ordinal() + 1) + ". " + customer.getPersonal(),
                                "할인율" + customer.getRate() + "%");
                    }
                    int discountOrder;
                    try {
                        discountOrder = input.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("잘못된 입력입니다.");
                        continue; //잘못된 입력이 들어오면 반복문 다시시작 하도록 예외처리
                    }
                    if (discountOrder <= Customer.values().length) {
                        int discountPrice = Customer.values()[discountOrder].discount(totalPrice);
                        System.out.println("주문이 완료되었습니다. 금액은 " + discountPrice + "원 입니다.");
                        order = 0;
                    } else {
                        System.out.println("잘못된 입력입니다. 메뉴판으로 돌아갑니다.");
                        continue;
                    }

                } else {
                    continue;
                }
            } else if (!cart.getOrderList().isEmpty() && order == menu.getMenuItemList().size() + 2) {
                cart.removeOrder(); //주문 목록 지우기 함수
                System.out.println("메뉴판으로 돌아갑니다.");
                continue;
            } else {
                System.out.println("잘못된 주문번호 입니다. 메뉴판으로 돌아갑니다.");
                continue;
            }
            System.out.println("키오스크를 종료합니다.");
        }

    }
}
