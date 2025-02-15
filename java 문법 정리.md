# Java 문법 정리


## Class 클래스
### 클래스는 프로그램에서 사용될 객체의 틀을 정의하며, 객체를 생성하기 위한 설계도 역할을 함.
### 변수(데이터, 속성)와 메서드(행위)를 가지고 있는 집합이자 객체를 생성하기 위한 틀임.

### 예를 들어 붕어빵을 만들기 위해서는 붕어빵 틀이 필요한데 여기서 붕이빵 틀이 class(클래스)이고 만들어진 붕어빵을 객체(object)라고 함.

### 객체 지향 프로그래밍에서는 메소드를 통해 데이터를 변경하는 방법을 선호함.
### 데이터는 외부에서 접근하지 않도록 막고, 메소드는 공개해서 외부에서 메소드를 통해 데이터에 접근하지 않도록 유도함.

public class Book{ //Book 클래스
    String company;
    String model;
    String color; 
    int maxSpeed;
    
    public static void main(String[] args){
        System.out.println("Hello World !");
    }
}


## Method 메서드
### 클래스 내부에 존재하는 영역으로, 특정 기능을 하는 코드를 묶어서 나타내는 것이 특징임. 즉, 특정 기능을 수행하기 위한 코드들의 집합체임.
### 특정 기능을 수행한다는 것은 데이터를 입력받아 해당 데이터를 일련의 처리 과정을 통해 만들어진 결괏값을 반환하는 것을 의미함.

### [반환 타입]
### - 메서드는 처리 결괏값을 반환. 처리 결과는 값의 형태로된 데이터를 뜻하며, 이 데이터가 반환 값임. 값은 정수, 문자, boolean 등 다양함 -> 데이터 타입 또는 자료형이라고 함.

int add(int num1, int num2){
    return num1 + num2
}

/*
반환타입 메서드 이름(매개변수타입, 매개변수 이름){
    메서드 바디
}
*/

### 메서드 호출
add(5, 10);

/*
메서드 이름(값1, 값2, ...)
*/


## Field 필드
### 필드란 객체의 데이터가 저장되는 곳임. 

int fieldName;

### 객체의 고유 데이터, 부품 객체, 상태 정보를 저장하는 곳임. 선언된 형태는 변수와 비슷하지만, 필드는 변수라 부르지 않음.
### 변수는 생성자와 메소드 내에서만 사용되고, 생성자와 메소드가 실행 종료되면 자동 소멸.
### **필드는 생성자와 메소드 전체에서 사용되며, 객체가 소멸되지 않는 한 객체와 함께 존재함.


## Constructor 생성자
### 객체 생성시 초기화 역할을 담당함.
### 1. 생성자의 이름은 **클래스 이름과 동일**해야 합니다.
### 2. 생성자는 리턴 타입이 없으며, **객체가 생성될때 자동으로 한번 호출**됩니다.
### 3. **매개 변수 조건에 따라 여러개 작성 가능**하며 (오버로딩), 생성자는 클래스에 최소 1개는 있어야함. 생성자 코드가 없을 경우 컴파일러가 기본 생성자를 자동으로 생성함.
### 4. **(주의할점은, 생성자 코드가 1개라도 작성되어 있다면, 기본 생성자를 자동으로 생성하지 않음.)**


public class Car{ //Book 클래스
    //필드
    String company = "KIA";
    String model = "Sorento";
    String color = "black"; 
    int maxSpeed = 280;
    int spped;
    
    public Car() { //기본생성자
    
    }   

    public Car(String company, String model, String color, int maxSpeed, int spped) { //매개변수를 가진 생성자
        this.company = company;
        this.model = model;
        this.color = color;
        this maxSpeed = 0;
        this.speed = 0;
    }
    
    //생성자
    Car(){
        speed =0;
    }
    
    //메소드
    void method(...){
        speed =10;
    }
    
    public static void main(String[] args){
        System.out.println("Hello World !");
    }
}
