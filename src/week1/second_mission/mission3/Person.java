package week1.second_mission.mission3;

public class Person {
    String name;
    int money;
    String leftMoney;

    public Person(String name, int money){
        this.name = name;
        this.money = money;
    }

    public void orderAmericano(ByulCafe byulCafe){
        money -= byulCafe.getPrice();
        String info = name + "님의 남은 돈은 " + Integer.toString(money) + "원 입니다. "
                + byulCafe.getCafeName() + "에서 " + byulCafe.getMenu() + "를 마셨습니다.";
        System.out.println(info);
    }

    public void orderLatte(KongCafe kongCafe){
        money -= kongCafe.getPrice();
        String info = name + "님의 남은 돈은 " + Integer.toString(money) + "원 입니다. "
                + kongCafe.getCafeName() + "에서 " + kongCafe.getMenu() + "를 마셨습니다.";
        System.out.println(info);
    }
}