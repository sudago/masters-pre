package week3.first_mission.mission2;

public abstract class Decorator extends Coffee{
    Coffee coffee;
    public Decorator (Coffee coffee) {
        super();
        this.coffee = coffee;
    }
    @Override
    public void brewing(){
        coffee.brewing();
    }
}
