package week4.first_mission.mission1.arraylist;

import week3.first_mission.mission1.Member;

import java.util.ArrayList;

public class MemberShipManagementList {
    private ArrayList<Member> arrayList;
    private Member member;

    public MemberShipManagementList() {
        arrayList =  new ArrayList<Member>();
    }

    public void addMemberShip(int memberId, String memberName, Member member) {
        this.member = member;
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

