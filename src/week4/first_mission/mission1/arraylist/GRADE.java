package week4.first_mission.mission1.arraylist;

import week3.first_mission.mission1.DiamondMember;
import week3.first_mission.mission1.Member;
import week3.first_mission.mission1.PlatinumMember;
import week3.first_mission.mission1.RedMember;

public class GRADE {
    // static 으로 선언해야 메모리 윗쪽에 존재해서 생성자로 생성하지 않고 .RED 이런식으로 사용할 수 있다.
    public static final Member RED = new RedMember();
    public static final Member PLATINUM = new PlatinumMember();
    public static final Member DIAMOND = new DiamondMember();
    public GRADE(){}; // new 생성자 없이 멤버변수 호출.
}
