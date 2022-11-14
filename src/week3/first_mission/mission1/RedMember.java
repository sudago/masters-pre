package week3.first_mission.mission1;

public class RedMember extends Member {
    public RedMember(String memberName, int shoppingPrice, int stayHour) {
        super(memberName, shoppingPrice, stayHour);
        memberGrade = "RED";
        bonusRatio = 0.01;
        parkingFee = 3000;
    }



}
