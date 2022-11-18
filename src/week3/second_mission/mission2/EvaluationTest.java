
package week3.second_mission.mission2;

import java.util.ArrayList;

public class EvaluationTest {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();

        Student gang = new Student("강감찬", 211213, "국어국문학과",
                "국어", 95, 56);
        Student kim = new Student("김유신", 212330, "컴퓨터공학과",
                "수학", 95, 98);
        Student shin = new Student("신사임당", 201518, "국어국문학과",
                "국어", 100, 88);
        Student lee = new Student("이순신", 202360, "국어국문학과",
                "국어", 89, 95);
        Student hong = new Student("홍길동", 201290,"컴퓨터공학과",
                "수학", 83, 56);
        arrayList.add(gang);
        arrayList.add(kim);
        arrayList.add(shin);
        arrayList.add(lee);
        arrayList.add(hong);

        // 국어 시험 점수 호출
        System.out.println("\n국어 과목 결과");
        getHeader("국어");
        for (Student student : arrayList) {
            student.getKoreanGrade();
        }

        // 수학 시험 호출
        System.out.println("\n수학 과목 결과");
        getHeader("수학");
        for (Student student : arrayList) {
            student.getMathGrade();
        }
    }

    public static void getHeader(String subject) {
        System.out.println("-----------------------------------");
        System.out.println("\t\t"+subject+" 수강생 학점\t\t");
        System.out.println("이름\t|\t학번\t |\t중점과목\t|  점수 |");
        System.out.println("-----------------------------------");
    }
}

