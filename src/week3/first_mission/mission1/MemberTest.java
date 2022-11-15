package week3.first_mission.mission1;

public class MemberTest {
    public static void main(String[] args) {
        RedMember james = new RedMember("James", 2);
        RedMember tomas = new RedMember("Tomas", 2);
        PlatinumMember edward = new PlatinumMember("Edward", 2);
        PlatinumMember percy = new PlatinumMember("Percy", 2);
        DiamondMember elizabet = new DiamondMember("Elizabet", 2);
        System.out.println("========================================================");
        System.out.println(james.showMemberInfo(10000));
        System.out.println(tomas.showMemberInfo(30000));
        System.out.println(edward.showMemberInfo(10000));
        System.out.println(percy.showMemberInfo(30000));
        System.out.println(elizabet.showMemberInfo(30000));
    }
}
