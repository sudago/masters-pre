package week3.first_mission.mission1;

public class PlatinumMember extends Member{
    public PlatinumMember(String memberName, int shoppingPrice, int stayHour) {
        super(memberName, shoppingPrice, stayHour);
        memberGrade = "PLATINUM";
        bonusRatio = 0.05;
        parkingFee = 1000;
        discountRatio = 0.05;
    }
}
