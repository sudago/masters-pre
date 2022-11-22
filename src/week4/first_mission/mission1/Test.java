package week4.first_mission.mission1;

import week3.first_mission.mission1.Member;

public class Test {
    public static void main(String[] args) {
        Member member = new Member(1001, "지안");
        Member member2 = new Member(1002, "지연");
        System.out.println(member.toString());
        System.out.println(member2.toString());
    }
}
