package week4.first_mission.mission2;

import week3.first_mission.mission1.DiamondMember;
import week3.first_mission.mission1.Member;
import week3.first_mission.mission1.PlatinumMember;
import week3.first_mission.mission1.RedMember;

import java.util.HashSet;

public class MemberShipManagementSet {
    private HashSet<Member> hashSet;
    private Member member;

    public MemberShipManagementSet(){this.hashSet = new HashSet<Member>();}

    public void addMemberShip(int memberId, String memberName, String memberShip){
        /* GRADE 클래스의 인스턴스 변수에 new 생성자 사용시.
        public void addMemberShip(int memberId, String memberName, String memberShip){
        member = memberShip; // GRADE 안에 new 생성자 있음.
        */
        // 인스턴스 추가를 위한 코드 수정. 아래의 코드는 GRADE 클래스 안에 new 생성자를 사용하지 않음.
        if (memberShip.equals("Red")) {
            member = new RedMember();
        } else if (memberShip.equals("Platinum")) {
            member = new PlatinumMember();
        } else if (memberShip.equals("Diamond")) {
            member = new DiamondMember();
        }

        member.setMemberId(memberId);
        member.setMemberName(memberName);

        // 인스턴스를 추가했는데, hashSet으로 아이디, 이름이 완전히 똑같은 Member를 넣어도 추가되는게 문제임.
        // Member 클래스에서 equals()와 hashCode() Override 재정의 했더니 문제 해결.
        hashSet.add(member);

//        if (hashSet.add(member)) { // 일치하는 멤버가 없으면 추가.
//            hashSet.add(member);
//        } else { // 일치하는 멤버가 있으면 추가 못함.
//            System.out.println("이미 있는 아이디 " + memberId + "는 추가할 수 없습니다.");
//        }
    }

    public void showAllMember(){
        System.out.println("================================");
        for (Member member : hashSet) {
            System.out.println(member.toString());
        }
        System.out.println("================================");
    }

    public boolean removeMember(int memberId){
        // iterator를 돌릴 수 있음.
        /*
            Iterator<Member> iterator = hashSet.iterator();
            while(iterator.hashNext()) {
                Member member = iterator.next();
                int tempId = member.getMemberId();
                if (memberId == tempId) {
                    hash.remove(member);
                    return true;
                }
            }
            System.out.println(memberId + "에 해당하는 멤버가 없습니다.");
            return false;
        */
        for(Member member : hashSet) {
            if (member.getMemberId() == memberId) {
                hashSet.remove(member);
                return true;
            }
        }
        System.out.println(memberId + "에 해당하는 멤버가 없습니다.");
        return false;
    }

}
