package week2.second_mission.mission2;

public class Student {
    private static int serialNum = 1000;
    private String studentName;
    private int studentID;
    String majorSubject;
    Subject subject = new Subject();

    public Student() {};
    public Student(String studentName, String majorSubject) {
        this.studentName = studentName;
        this.majorSubject = majorSubject;
        serialNum++;
        this.studentID = serialNum;
    }

    public void addScore(String score1, String score2, String score3) {
//      \t 넣고 저장 했을 때, 파일 안에서 자동으로 삭제가 되서 입력이 되지 않은 성적은 . 로 바꾸었다.
        int changeScore1 = score1.equals(".") ? -1 : Integer.parseInt(score1);
        int changeScore2 = score2.equals(".") ? -1 : Integer.parseInt(score2);
        int changeScore3 = score3.equals(".") ? -1 : Integer.parseInt(score3);
        subject.setScore(changeScore1, changeScore2, changeScore3);
        // 마지막 성적까지 입력이 완료되면 자동으로 평균 구하기.
    }

    public String getStudentInfo() {
        return (studentName + "\t" + studentID + " " + majorSubject + "\t"
                + Integer.toString(subject.getKoreanScore() == -1 ? 0 : subject.getKoreanScore()) + "\t"
                + Integer.toString(subject.getMathScore() == -1 ? 0 : subject.getMathScore()) + "\t"
                + Integer.toString(subject.getEnglishScore() == -1 ? 0 : subject.getEnglishScore())) + "\n";
    }

    public void showStudentInfo(){
        System.out.println("=========================================="); // 학생 구분 선
        System.out.println(studentName + " 학생은 " + subject.getSubjectNum() + "과목을 수강했습니다.");
        System.out.println("총점은 " + subject.getTotalScore() + "점이고 평균은 " + subject.getAverageScore() + "점 입니다.");
    }
}
