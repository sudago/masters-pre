package week3.first_mission.mission2;

public class Mocha extends Decorator{

    public Mocha(Coffee coffee){
        super(coffee);
    }

    public void brewing(){
        super.brewing();
        System.out.print("Adding Mocha syrup ");
    }
}
