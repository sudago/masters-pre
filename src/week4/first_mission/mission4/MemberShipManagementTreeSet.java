package week4.first_mission.mission4;

import week3.first_mission.mission1.DiamondMember;
import week3.first_mission.mission1.Member;
import week3.first_mission.mission1.PlatinumMember;
import week3.first_mission.mission1.RedMember;

import java.util.TreeSet;

public class MemberShipManagementTreeSet {
    private TreeSet<Member> treeSet;
    private Member member;

    public MemberShipManagementTreeSet(){treeSet = new TreeSet<Member>();}

    public void addMemberShip(int memberId, String memberName, String memberShip){

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

        // String 클래스의 compare를 재정의 해야, 내가 원하는 값을 기준으로 정렬할 수 있게 됨.
        if (treeSet.add(member)) { // 일치하는 멤버가 없으면 추가.
            treeSet.add(member);
        } else { // 일치하는 멤버가 있으면 추가 못함.
            System.out.println("이미 있는 아이디 " + memberId + "는 추가할 수 없습니다.");
        }
    }

    public void showAllMember(){
        System.out.println("================================");
        for (Member member : treeSet) {
            System.out.println(member.toString());
        }
        System.out.println("================================");
    }

    public boolean removeMember(int memberId){
  
        for(Member member : treeSet) {
            if (member.getMemberId() == memberId) {
                treeSet.remove(member);
                return true;
            }
        }
        System.out.println(memberId + "에 해당하는 멤버가 없습니다.");
        return false;
    }

}
