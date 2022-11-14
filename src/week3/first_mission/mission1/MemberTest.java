package week3.first_mission.mission1;

public class MemberTest {
    public static void main(String[] args) {
        RedMember james = new RedMember("James", 10000, 2);
        RedMember tomas = new RedMember("Tomas", 30000, 2);
        PlatinumMember edward = new PlatinumMember("Edward", 10000, 2);
        PlatinumMember percy = new PlatinumMember("Percy", 30000, 2);
        DiamondMember elizabet = new DiamondMember("Elizabet", 30000, 2);
        System.out.println(james.showMemberInfo());
        System.out.println(tomas.showMemberInfo());
        System.out.println(edward.showMemberInfo());
        System.out.println(percy.showMemberInfo());
        System.out.println(elizabet.showMemberInfo());
    }
}
