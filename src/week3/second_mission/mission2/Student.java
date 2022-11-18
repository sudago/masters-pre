package week3.second_mission.mission2;

public class Student {
    String studentName;
    int studentID;
    String major;
    String majorSubject;
    int koreanScore;
    int mathScore;
    private GradeEvaluation gradeEvaluation;

    public Student(String studentName, int studentID, String major, String majorSubject, int koreanScore, int mathScore){
        this.studentName = studentName;
        this.studentID = studentID;
        this.major = major;
        this.majorSubject = majorSubject;
        this.koreanScore = koreanScore;
        this.mathScore = mathScore;
    }

    public void getKoreanGrade() {
        String grade;
        if (majorSubject.equals("국어")){
            this.gradeEvaluation = new MajorEvaluation();
        } else {
            this.gradeEvaluation = new BasicEvaluation();
        }
        grade = gradeEvaluation.getGrade(koreanScore);
        studentScoreInfo(majorSubject, koreanScore, grade);
    }

    public void getMathGrade() {
        String grade;
        if (majorSubject.equals("수학")){
            this.gradeEvaluation = new MajorEvaluation();
        } else {
            this.gradeEvaluation = new BasicEvaluation();
        }
        grade = gradeEvaluation.getGrade(mathScore);
        studentScoreInfo(majorSubject, mathScore, grade);
    }
    public void studentScoreInfo(String majorSubject, int score, String grade){
        System.out.println(studentName+" | "+Integer.toString(studentID)+" |\t " + majorSubject + " \t| "
                            + Integer.toString(score) + ":" + grade+" | ");
        System.out.println("-----------------------------------");
    }
}
