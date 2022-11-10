package week2.second_mission.mission1;

public class HyundaiFactory {
    // 외부에서 사용될 단 하나의 인스턴스 이므로 private, static을 사용.
    private static HyundaiFactory hyundaiFactory = new HyundaiFactory();
    // 외부에서 접근하지 못하게 하기 위해 private으로 생성자 선언.
    private HyundaiFactory(){}
    // 외부에서 접근 할 수 있는 하나의 방법.
    public static HyundaiFactory getFactory(){
        // 이런식으로 쓰기도 한다. 방어 코드.
        if(hyundaiFactory == null) {
            hyundaiFactory = new HyundaiFactory();
        }
        return hyundaiFactory;
    }
    public Car createCar(){
        return new Car();
    }
}
