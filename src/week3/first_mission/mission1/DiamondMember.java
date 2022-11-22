package week3.first_mission.mission1;

public class DiamondMember extends Member{
    boolean adviser = true;
    public DiamondMember(String memberName, int stayHour) {
        super(memberName, stayHour);
        memberGrade = "DIAMOND";
        bonusRatio = 0.1;
        parkingFee = 0;
        discountRatio = 0.1;
    }

    public DiamondMember(){memberGrade = "DIAMOND";};
}
