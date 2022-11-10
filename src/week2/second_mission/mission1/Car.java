package week2.second_mission.mission1;

public class Car {
    // 외부에서 건들면 안되는 소중한 변수이기 때문에 private
    private static int serialNum = 1000;

    private final int carNum; // 컴파일러가 final 붙여주라해서 붙여줌.

    public Car() { // 디폴트 생성자
        carNum = serialNum;
        serialNum++;
    }
    public int showCarNumber(){
        return carNum;
    }

}
