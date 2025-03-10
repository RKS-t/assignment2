package normal.kiosk4;

import java.util.*;

public class Kiosk {
    Scanner input = new Scanner(System.in);

    Menu menu = new Menu();
    List<MenuItem> selectedOrder = new ArrayList<>();


    //생성자
    public Kiosk(){

    }


    //함수

    public void start( ){
            int order = 10;
            int suborder = 10;

            while (0 != order) {
                try {
                    System.out.println("[LOTTERIA MENU]");
                    for (String menuList : menu.getMenu()) {
                        int num = menu.getMenu().indexOf(menuList) + 1;
                        System.out.printf("%-20s\n",
                                num + ". " + menuList
                                );
                    }
                    System.out.println("0. 종료     | 종료");

                    order = input.nextInt();
                    if (order == 0) {
                        System.out.println("주문을 종료합니다.");
                    } else if (order == 1) {
                        menu.showBurgers();
                        suborder = input.nextInt();
                        if(suborder<=4){
                            selectedOrder = menu.getMenuBurgers();
                            System.out.println("선택한 메뉴는 " + selectedOrder.get(suborder-1).getName() + "입니다.");
                        } else {
                            System.out.println("잘못된 주문번호 입니다.");
                        }
                    } else if (order == 2) {
                        menu.showDrinks();
                        suborder = input.nextInt();
                        if(suborder<=4){
                            selectedOrder = menu.getMenuDrinks();
                            System.out.println("선택한 메뉴는 " + selectedOrder.get(suborder-1).getName() + "입니다.");
                        } else {
                            System.out.println("잘못된 주문번호 입니다.");
                        }
                    } else if (order == 3) {
                        menu.showDesert();
                        suborder = input.nextInt();
                        if(suborder<=4){
                            selectedOrder = menu.getMenuDesert();
                            System.out.println("선택한 메뉴는 " + selectedOrder.get(suborder-1).getName() + "입니다.");
                        } else {
                            System.out.println("잘못된 주문번호 입니다.");
                        }
                    } else if (order == 4) {
                        menu.showChickens();
                        suborder = input.nextInt();
                        if(suborder<=4){
                            selectedOrder = menu.getMenuChickens();
                            System.out.println("선택한 메뉴는 " + selectedOrder.get(suborder-1).getName() + "입니다.");
                        } else {
                            System.out.println("잘못된 주문번호 입니다.");
                        }
                    } else {
                        System.out.println("잘못된 주문번호 입니다.");
                    }
                } catch (InputMismatchException e){
                    System.out.println("잘못된 주문번호 입니다.");
                    input.nextLine();
                }


            }

    }

}
