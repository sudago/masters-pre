package week4.first_mission.mission1;

import week4.first_mission.GRADE;

public class MemberShipManagementListTest {
    public static void main(String[] args) {
        MemberShipManagementList management = new MemberShipManagementList();
        management.addMemberShip(1001, "Hong", GRADE.RED);
        management.addMemberShip(1002, "Park", GRADE.PLATINUM);
        management.addMemberShip(1003, "Kim", GRADE.DIAMOND);

        System.out.println("모든 멤버 보여주기: ");
        management.showAllMember();

        System.out.println("존재 하는 아이디를 지웠을때 :");
        if(management.removeMember(1001)) {
            management.showAllMember();
        }

        System.out.println("존재 하지 않는 아이디를 지우려 할때:");
        if(management.removeMember(1005)) {
            management.showAllMember();
        }
    }
}
