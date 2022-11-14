package week2.second_mission.mission2;

import java.io.*;


public class ScoreInput {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedOutputStream bs = null;
        try {
            bs = new BufferedOutputStream(new FileOutputStream("src/week2/second_mission/mission2/input.txt"));


            // 이름, 학번, 전공과목, 점수 (국어, 수학, 영어)
            // kim 시작
            String inputString = br.readLine();
            String[] inputArr = inputString.split(" ");
            Student kim = new Student(inputArr[0], inputArr[1]);
            kim.addScore(inputArr[2],inputArr[3],inputArr[4]);

            // lee 시작
            inputString = br.readLine();
            inputArr = inputString.split(" ");
            Student lee = new Student(inputArr[0], inputArr[1]);
            lee.addScore(inputArr[2],inputArr[3],inputArr[4]);

            // 콘솔에 출력
            kim.showStudentInfo();
            lee.showStudentInfo();

            // txt 파일에 입력
            String str = "이름\t학번\t전공과목\t국어\t수학\t영어\n" + kim.getStudentInfo() + lee.getStudentInfo();
            bs.write(str.getBytes());
        } catch (Exception e) {
            e.getStackTrace();
            // TODO: handle exception
        } finally {
            bs.close();
        }
    }
}
