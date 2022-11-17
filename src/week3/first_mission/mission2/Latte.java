package week3.first_mission.mission2;

public class Latte extends Decorator {
    public Latte(Coffee coffee){
        super(coffee);
    }

    public void brewing(){
        super.brewing();
        System.out.print("Adding Milk ");
    }
}
