package week3.first_mission.mission1;

public class RedMember extends Member {
    public RedMember(String memberName, int stayHour) {
        super(memberName, stayHour);
        memberGrade = "RED";
        bonusRatio = 0.01;
        parkingFee = 3000;
    }



}
