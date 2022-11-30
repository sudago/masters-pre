package week4.first_mission.mission3;

import week3.first_mission.mission1.DiamondMember;
import week3.first_mission.mission1.Member;
import week3.first_mission.mission1.PlatinumMember;
import week3.first_mission.mission1.RedMember;

import java.util.HashMap;
import java.util.Iterator;

public class MemberShipManagementMap {
    private HashMap<Integer, Member> hashMap;
    private Member member;

    public MemberShipManagementMap(){
        hashMap = new HashMap<Integer, Member>();
    }

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

        // key값이 이미 들어있는지 확인
        if(hashMap.containsKey(memberId)) {
            System.out.println("이미 있는 아이디 " + memberId + "의 값이 변경됩니다.");
        }
        hashMap.put(memberId, member);

    }

    public void showAllMember(){
        System.out.println("================================");
        Iterator<Integer> ir = hashMap.keySet().iterator();

        while(ir.hasNext()) {
            int key = ir.next();

            Member member = hashMap.get(key);
            System.out.println(member);
        }
        System.out.println("================================");
    }

    public boolean removeMember(int memberId){
  
        if(hashMap.containsKey(memberId)) {
            hashMap.remove(memberId);
            return true;
        }
        System.out.println(memberId + "에 해당하는 멤버가 없습니다.");
        return false;
    }

}
