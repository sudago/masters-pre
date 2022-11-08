package week1.second_mission.mission2;

public class MakePerson {
    public static void main(String[] args) {
        Person jane = new Person("제인");
        jane.age = 30;
        jane.gender = "여성";
        jane.maritalStatus = "기혼자";
        jane.numberOfChildren = 1;
        System.out.println(jane.personInformation());
    }
}
