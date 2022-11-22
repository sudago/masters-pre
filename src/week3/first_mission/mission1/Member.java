package week3.first_mission.mission1;

public class Member {
    protected int memberId; // 4주차 미션 추가 구현
    protected String memberName;
    protected String memberGrade;
    int stayHour;
    int bonusPoint;
    double bonusRatio;
    int parkingFee;
    double discountRatio;

    public Member() {
        initMember();
    }

    public Member(String memberName, int stayHour) {
        this.memberName = memberName;
        this.stayHour = stayHour;
        initMember();
    }
    public Member (int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }
    private void initMember(){
        memberGrade = "None";
        bonusRatio = 0;
        parkingFee = 3000; // 그냥 멤버에는 주차요금 어카징..
    }
    // 4주차 미션 추가 구현
    public int getMemberId(){
        return memberId;
    }

    @Override
    public String toString(){
        return memberName + "님의 아이디는 " + Integer.toString(memberId) + "이고 등급은 " + memberGrade + "입니다.";
    }

    public int calcPrice(int shoppingPrice) {
        bonusPoint += shoppingPrice * bonusRatio; // 보너스 포인트 계산
        parkingFee *= stayHour; // 주차요금 계산
        return (shoppingPrice - (int)(shoppingPrice * discountRatio)); // 결제금액 계산
    }

    public String showMemberInfo(int shoppingPrice){
        return memberName + "님의 지불 금액은 " + calcPrice(shoppingPrice) + " 원 이고, 적립 포인트는 "
                + bonusPoint + "점 입니다.\n주차 요금은 " + parkingFee + "원 입니다.\n";
    }
}
