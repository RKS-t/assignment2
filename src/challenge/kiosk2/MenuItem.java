package challenge.kiosk2;

public class MenuItem {

    //속성
    private String name ;
    private int price ;
    private String description;
    private  int count ;  //갯수 체크 추가

    //생성자
    public MenuItem(String name, int price, String description){

        this.name = name ;
        this.price = price ;
        this.description = description;
        this.count = 1; //갯수를 지정하지 않은 생성자는 자동으로 하나의 수량
    }

    public MenuItem(String name, int price, String description, int count){
        this.name = name ;
        this.price = price ;
        this.description = description;
        this.count =count;

    }


    //함수

    //게더

    public String getName(){
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public int getCount(){
        return  count;
    }

    //세터

    public void setCount(int count){
        this.count=count;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //단일 아이템을 보여주는 함수 (카운트가 >1 일때는 카운트 까지 표시)

    public void showMenuItem( ) {
        if(count==1) {
            System.out.printf("%-25s %-6s %-50s\n",
                    name,
                    "|" + price, "원|       " +
                            description);
        } else {
            System.out.printf("%-25s %-6s %-30s\n",
                    name,
                    "|" + price, "원| x" +count +"개  " +
                            description);
        }
    }
}
