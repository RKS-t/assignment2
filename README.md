# KioskProject

### 프로젝트 소개

* 설정된 메뉴판을 보여주고 사용자의 선택에 따라 화면 출력하기

* 객체의 필요성을 이해하고 고급 기능 숙달

---
### Stacks

Environoment

 <img src="https://img.shields.io/badge/Intellij-000000?style=for-the-badge&logo=IntelliJ IDEA&logoColor=white"> <img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white"> <img src="https://img.shields.io/badge/git-F05032?style=for-the-badge&logo=git&logoColor=white"> 

Development

<img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white">

Communication

<img src="https://img.shields.io/badge/slack-4A154B?style=for-the-badge&logo=slack&logoColor=white"> <img src="https://img.shields.io/badge/notion-333333?style=for-the-badge&logo=notion&logoColor=white">

---

### 주요 기능

* 메뉴판 표시 기능 

* 주문한 메뉴들을 모아서 볼 수 있는 장바구니 기능
      
* 장바구니 항목 삭제 및 초기화 기능

* 할인 정보에 따른 가격 할인 기능

---
### 이 코드의 특징

* Enum으로 고객정보를 상수화 하여 할인정보 취급

* 캡슐화를 통해서 메뉴 항목들을 안전하게 취급

* 메뉴아이템 항목을 제네릭으로 설정해 혹시나 수정될 타입에 대한 유연성 증가

* 예외 처리 후 코드의 방향성을 설정 (계산기 피드백 반영)

* 반복되는 출력을 최대한 적은 수의 함수로 표현 

---
### 사용상 주의할 점

* 메뉴 아이템 항목 추가시 Menu 생성자 라인에 추가하세요

* 상위 그룹 메뉴를 만들시 menu에 상위메뉴 이름, menuItemList에 상위메뉴 리스트를 add 해주시면 됩니다.

* 상위그룹이름과 리스트는 순서가 같도록 넣어주세요.

---
### 코드 보완 필요 사항

* 반복되는 긴 항목의 변수, 리스트, 객체들 미리 선언하여 거기에 저장함으로써 가독성 향상 및 최적화해보기

* 주문리스트 저장시도 스트림으로 표현, 카운트 구분하는것도 포함하여 삭제함수를 스트림으로 표현하여 코드 간결화해보기

* 스캐너 입력문을 일일이 예외처리하지말고 하나의 함수로 표현해보기

* 깃 허브 이용을 일찍하여 커밋을 잘 하기

### 디렉토리
📦src
 ┣ 📂challenge
 ┃ ┣ 📂kiosk1
 ┃ ┃ ┣ 📜Cart.java
 ┃ ┃ ┣ 📜Kiosk.java
 ┃ ┃ ┣ 📜Main.java
 ┃ ┃ ┣ 📜Menu.java
 ┃ ┃ ┗ 📜MenuItem.java
 ┃ ┣ 📂kiosk2
 ┃ ┃ ┣ 📜Cart.java
 ┃ ┃ ┣ 📜Customer.java
 ┃ ┃ ┣ 📜Kiosk.java
 ┃ ┃ ┣ 📜Main.java
 ┃ ┃ ┣ 📜Menu.java
 ┃ ┃ ┗ 📜MenuItem.java
 ┃ ┗ 📜Main.java
 ┣ 📂normal
 ┃ ┣ 📂kiosk1
 ┃ ┃ ┗ 📜Main.java
 ┃ ┣ 📂kiosk2
 ┃ ┃ ┣ 📜Main.java
 ┃ ┃ ┗ 📜MenuItem.java
 ┃ ┣ 📂kiosk3
 ┃ ┃ ┣ 📜Kiosk.java
 ┃ ┃ ┣ 📜Main.java
 ┃ ┃ ┗ 📜MenuItem.java
 ┃ ┣ 📂kiosk4
 ┃ ┃ ┣ 📜Kiosk.java
 ┃ ┃ ┣ 📜Main.java
 ┃ ┃ ┣ 📜Menu.java
 ┃ ┃ ┗ 📜MenuItem.java
 ┃ ┣ 📂kiosk5
 ┃ ┃ ┣ 📜Kiosk.java
 ┃ ┃ ┣ 📜Main.java
 ┃ ┃ ┣ 📜Menu.java
 ┃ ┃ ┗ 📜MenuItem.java
 ┃ ┗ 📜Main.java
 ┗ 📜Main.java
 ----

 ### 개발일지기록 
 [티스토리블로그](https://rudtjs2.tistory.com/category/%EA%B3%BC%EC%A0%9C)
