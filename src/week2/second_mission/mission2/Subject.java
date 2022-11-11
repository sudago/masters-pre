package week2.second_mission.mission2;

public class Subject {
    String korean = "국어";
    String math = "수학";
    String english = "영어";
    int koreanScore;
    int mathScore;
    int englishScore;
    int totalScore;
    double averageScore; // 평균은 소수점이 나올 수 있으니까 double형으로 선언
    int subjectNum; // 수강한 과목 수


    public void setKoreanScore(int score){
        this.koreanScore = score;
    }
    public void setMathScore(int score){
        this.mathScore = score;
    }
    public void setEnglishScore(int score){
        this.englishScore = score;
    }

    public void setScore(){
        if (koreanScore != -1) subjectNum++;
        if (mathScore != -1) subjectNum++;
        if (englishScore != -1) subjectNum++;
        this.totalScore = koreanScore + mathScore + englishScore + (3 - subjectNum);
        this.averageScore = (double)totalScore / subjectNum; // 형변환
    }

    public int getN(){
        return subjectNum;
    }
    public int getTotalScore(){
        return totalScore;
    }
    public double getAverageScore(){
        return averageScore;
    }

}
