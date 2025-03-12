package challenge.kiosk2;

import java.util.ArrayList;
import java.util.List;

public class Menu {


    //속성 각각의 요소를 담을수 있는 컬렉션 필드
    private List<String> menu = new ArrayList<>();
    private List<List<MenuItem>> menuItemList = new ArrayList<>();
    private List<MenuItem> menuBurgers = new ArrayList<>();
    private List<MenuItem> menuDrinks = new ArrayList<>();
    private List<MenuItem> menuDesert = new ArrayList<>();
    private List<MenuItem> menuChickens = new ArrayList<>();


    //생성자 (메뉴 목록 추가)
    public Menu ( ) {
        menuBurgers.add(new MenuItem("NapolyBurger", 8900, "바질마요소스에 토마토소스로 맛을 낸 나폴리맛피아식 스페셜버거"));
        menuBurgers.add(new MenuItem("BibimBurger", 6900, "전주비빔밥 라이스번과 반숙란, 고추장 소스가 어우러진 버거"));
        menuBurgers.add(new MenuItem("ShrimpBurger", 5900, "미니새우패티 2장의 새우 매니아를 위한버거"));
        menuBurgers.add(new MenuItem("Teriburger", 3500, "쇠고기패티에 달콤 짭짤한 데리소스를 더한 가성비 버거"));
        menuDrinks.add(new MenuItem("Coke", 2000, "톡 쏘는 시원 상큼한 코카콜라"));
        menuDrinks.add(new MenuItem("ZeroSugarCoke", 2000, "칼로리 걱정 없는 시원 상쾌한 제로 슈거 콜라"));
        menuDrinks.add(new MenuItem("IceAmericano", 2500, "부드럽고 마일드한 바디감을 느낄 수 있는 ICE 아메리카노"));
        menuDrinks.add(new MenuItem("IceTea", 2300, "달콤한 복숭아 맛의 시원한 아이스 드링크"));
        menuDesert.add(new MenuItem("FriedSquidRing", 2600, "통오징어로 식감과 풍미가 가득한 디저트(잠발라야 소스제공)"));
        menuDesert.add(new MenuItem("CheeseStick", 2600, "통모짜렐라치즈에 튀김옷을 입혀 만든 바삭하고 고소한 메뉴"));
        menuDesert.add(new MenuItem("FriedPotato", 1900, "바로 튀겨낸 바삭바삭한 후렌치 포테이토"));
        menuDesert.add(new MenuItem(" ji pai", 4500, "바삭한 외피와 부드럽고 촉촉한 가슴살을 즐길 수 있는 대형 사이즈 디저트"));
        menuChickens.add(new MenuItem("Chicken 1p", 2900, "담백함과 매콤한맛의 후라이드 치킨(부위랜덤)"));
        menuChickens.add(new MenuItem("FullPackage 9p legs", 20900, "치킨다리로만 구성되어있는 후라이드 치킨 치킨다리 풀팩"));
        menuChickens.add(new MenuItem("HalfPackage 4p legs", 10900, "치킨다리로만 구성되어있는 후라이드 치킨 치킨다리 하프팩"));
        menu.add("BURGER"); //메뉴와 그에 맞는 버거를 서로 인덱스가 맞도록 순서대로 추가해야함
        menu.add("DRINK");
        menu.add("DESERT");
        menu.add("CHICKEN");
        menuItemList.add(menuBurgers);
        menuItemList.add(menuDrinks);
        menuItemList.add(menuDesert);
        menuItemList.add(menuChickens);
    }


    //함수

    //게더
    public List<MenuItem> getMenuBurgers (){
         return menuBurgers;
    }

    public List<MenuItem> getMenuDrinks (){
        return menuDrinks;
    }

    public List<MenuItem> getMenuDesert (){
        return menuDesert;
    }

    public List<MenuItem> getMenuChickens (){
        return menuChickens;
    }

    public List<List<MenuItem>> getMenuItemList () {
        return  menuItemList;
    }

    public  List<String> getMenu (){
        return  menu;
    }


    //종류에 맞는 메뉴판 출력 함수


    public void showMenuItemList (int index){
        System.out.println("[" + menu.get(index) +" MENU]");
        for (MenuItem menuItem : menuItemList.get(index)) {
            int num = menuItemList.get(index).indexOf(menuItem) + 1;
            System.out.printf("%-20s %-10s %-50s\n",
                    num + ". " + menuItem.getName(),
                    "|" + menuItem.getPrice() + " 원|",
                    menuItem.getDescription());
        }
        System.out.println("0. 뒤로가기");
    }




}
