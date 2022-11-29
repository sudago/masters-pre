package week4.first_mission.mission1;

import week3.first_mission.mission1.DiamondMember;
import week3.first_mission.mission1.Member;
import week3.first_mission.mission1.PlatinumMember;
import week3.first_mission.mission1.RedMember;

import java.util.ArrayList;

public class MemberShipManagementList {
    private ArrayList<Member> arrayList;
    private Member member;

    public MemberShipManagementList() {
        arrayList =  new ArrayList<Member>();
    }

    public void addMemberShip(int memberId, String memberName, String memberShip) {
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
        arrayList.add(member);
    }

    public boolean removeMember(int memberId) {
        for (int i = 0; i < arrayList.size(); i++) {
            Member member = arrayList.get(i);
            int tempId = member.getMemberId();
            if (memberId == tempId) {
                arrayList.remove(i);
                return true;
            }
        } // for 문 end
        System.out.println(memberId + "에 해당하는 멤버가 없습니다.");
        return false;
    }
    public void showAllMember(){
        System.out.println("================================");
        for (Member member : arrayList) {
            System.out.println(member.toString());
        }
        System.out.println("================================");
//        System.out.println(arrayList); vector 의 toString 을 보여준다.
    }
}

