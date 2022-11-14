package week3.first_mission.mission1;

public class DiamondMember extends Member{
    boolean adviser = true;
    public DiamondMember(String memberName, int shoppingPrice, int stayHour) {
        super(memberName, shoppingPrice, stayHour);
        memberGrade = "DIAMOND";
        bonusRatio = 0.1;
        parkingFee = 0;
        discountRatio = 0.1;
    }
}
