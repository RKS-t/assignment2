package challenge.kiosk1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cart {
    Scanner input = new Scanner(System.in);
    //속성

    private List<MenuItem> orderList = new ArrayList<>(); //주문을 담을 객체 컬렉션 필드 생성

    //생성자 담기

    //매서드 출력

    //게더
    public List<MenuItem> getOrderList(){
        return orderList;
    }




    //오더리스트에 주문 추가하는 함수
    public void addItem(MenuItem menuItems){
        int getIndex = -1;
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1.추가          2.취소");
        int addOrder = input.nextInt();
        if (addOrder == 1) {

            if (orderList.isEmpty()) { // 장바구니가 비어있으면 바로 추가
                orderList.add(menuItems);
                System.out.println(menuItems.getName() + "이(가) 장바구니에 추가되었습니다.");
            }else {
                for (int i = 0; i < orderList.size(); i++) { //장바구니가 비어있지 않을때는 같은 이름이 있는지 확인
                    if (menuItems.getName().equals(orderList.get(i).getName())) {
                        getIndex = i; //같은 이름을 찾으면 그 인덱스 저장
                    }
                }
                if (getIndex == -1) { //장바구니에 없으면 index=-1 이므로 바로 추가
                    orderList.add(menuItems);
                    System.out.println(menuItems.getName() + "이(가) 장바구니에 추가되었습니다.");
                } else { //장바구니에 있으면 메뉴아이템 객체 count 요소를 +1 해주기
                    orderList.get(getIndex).setCount(orderList.get(getIndex).getCount() + 1);
                    System.out.println(menuItems.getName() + "이(가) 장바구니에 한 개 더 추가되었습니다.");
                }

            }
        }


    }

    //장바구니 목록 불러오기
    public int showOrder() {
        int totalPrice = 0;
        System.out.println("[ Orders ]");
        for(int i = 0; i < orderList.size(); i++ ){
            System.out.print((i+1)+". ");
            orderList.get(i).showMenuItem();
            totalPrice += orderList.get(i).getPrice()*orderList.get(i).getCount();
        }
        System.out.println("[ Total ]");
        System.out.println(totalPrice + "원 입니다.");
        return totalPrice;
    }

    //장바구니 목록 초기화
    public void resetOrder() {
        orderList.clear();
    }



}
