package week4.first_mission.mission1.arraylist;

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

    public void addMemberShip(int memberId, String memberName, String gradeName) {
        if (gradeName.equals("GRADE.RED")) {
            this.member = new RedMember(memberId, memberName);
        } else if (gradeName.equals("GRADE.PLATINUM")) {
            this.member = new PlatinumMember(memberId, memberName);
        } else if (gradeName.equals("GRADE.DIAMOND")) {
            this.member = new DiamondMember(memberId, memberName);
        }
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

