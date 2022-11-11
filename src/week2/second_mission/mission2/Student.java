package week2.second_mission.mission2;

public class Student {
    String studentName;
    String majorSubject;
    int studentID;
    Subject subject = new Subject();

    public Student(String studentName, String studentID, String majorSubject) {
        this.studentName = studentName;
        this.majorSubject = majorSubject;
        this.studentID = studentID.equals(" ") ? -1 : Integer.parseInt(studentID);
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void addKoreanScore(int score) {
        subject.setKoreanScore(score);
    }
    public void addMathScore(int score) {
        subject.setMathScore(score);
    }
    public void addEnglishScore(int score){
        subject.setEnglishScore(score);
        subject.setScore(); // 마지막 성적까지 입력이 완료되면 평균 구하기.
    }

    public void showInfo(){
        System.out.println(studentName + " 학생은 " + subject.getN() + "과목을 수강했습니다.");
        System.out.println("총점은 " + subject.getTotalScore() + "점이고 평균은 " + subject.getAverageScore() + "점 입니다.");
    }


}
