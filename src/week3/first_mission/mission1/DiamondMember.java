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

    // 4주차 미션 1-1을 위한 추가 구현
    public DiamondMember(int memberId, String memberName) {
        super(memberId, memberName);
        memberGrade = "DIAMOND";
    }
}
