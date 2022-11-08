package week1.second_mission.mission2;// 2번 미션

public class Person {
    String name;
    int age;
    String gender;
    String maritalStatus;
    int numberOfChildren;

    public Person(String name) {
        this.name = name;
    }

    public String personInformation() {
        return "이름은 " + name + "이고 나이는 " + Integer.toString(age) + "살 입니다. "
                + "성별은 " + gender + "이며, " + maritalStatus + " 입니다. "
                + "자녀는 " + Integer.toString(numberOfChildren) + "명이 있습니다.";
    }

}

