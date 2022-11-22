package week3.first_mission.mission1;

public class RedMember extends Member {
    public RedMember(String memberName, int stayHour) {
        super(memberName, stayHour);
        memberGrade = "RED";
        bonusRatio = 0.01;
        parkingFee = 3000;
    }
    // 4주차 미션 1-1을 위한 추가 구현
    public RedMember(int memberId, String memberName) {
        super(memberId, memberName);
        memberGrade = "RED";
    }
}
