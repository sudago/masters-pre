package week3.first_mission.mission1;

public class PlatinumMember extends Member{
    public PlatinumMember(String memberName, int stayHour) {
        super(memberName, stayHour);
        memberGrade = "PLATINUM";
        bonusRatio = 0.05;
        parkingFee = 1000;
        discountRatio = 0.05;
    }
    // 4주차 미션 1-1을 위한 추가 구현
    public PlatinumMember(int memberId, String memberName) {
        super(memberId, memberName);
        memberGrade = "PLATINUM";
    }
}