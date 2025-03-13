package challenge.kiosk2;

public enum Customer  {
    NORMAL("일반",0 ),
    ARMY("군인",15),
    STUDENT("학생",10),
    CHILDREN("어린이",10),
    DISABLED("장애인",20);


    //저장공간

    private String personal;
    private int rate;


    //생성자
     Customer(String personal,int rate) {
         this.personal =personal;
         this.rate =rate;
    }

    //메서드
    // 할인 계산 함수
    public int discount(int totalPrice){
         return (totalPrice*(100-rate)/100);
    }



    //게더
    public String getPersonal(){
         return personal;
    }

    public double getRate(){
         return rate;
    }


}
