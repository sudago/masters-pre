package week3.first_mission.mission2;

public class WhippedCream extends Decorator{

    public WhippedCream(Coffee coffee) {
        super(coffee);
    }

    public void brewing(){
        coffee.brewing();
        System.out.print("Adding WhippedCream ");
    }
}
