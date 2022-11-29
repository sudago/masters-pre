package week4.first_mission;

public class GRADE {
    // static 으로 선언해야 메모리 윗쪽에 존재해서 생성자로 생성하지 않고 .RED 이런식으로 사용할 수 있다.
    // 그런데 이렇게 하면 초기에 만든 인스턴스 3개 이외에 새로운 인스턴스가 생성되지 않기 때문에 코드를 수정했다.
    public static String RED = "Red";
    public static String PLATINUM = "Platinum";
    public static String DIAMOND = "Diamond";
    public GRADE(){}; // new 생성자 없이 멤버변수 호출.
}
