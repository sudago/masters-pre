package week1.second_mission.mission3;

public class TestMoney {
    public static void main(String[] args) {
        Person james = new Person("James", 5000);
        Person tomas = new Person("Tomas", 10000);

        ByulCafe byulCafe = new ByulCafe();
        KongCafe kongcafe = new KongCafe();

        james.orderAmericano(byulCafe);
        tomas.orderLatte(kongcafe);
    }
}
