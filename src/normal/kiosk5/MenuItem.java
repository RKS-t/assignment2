package normal.kiosk5;

public class MenuItem {

    //속성
    private String name ;
    private int price ;
    private String description;

    //생성자
    public MenuItem(String name, int price, String description){

        this.name = name ;
        this.price = price ;
        this.description = description;

    }


    //함수

    public String getName(){
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }
}
