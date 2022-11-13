package week2.second_mission.mission2;

import java.io.*;


public class ScoreInput {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedOutputStream bs = null;
        try {
            bs = new BufferedOutputStream(new FileOutputStream("src/week2/second_mission/mission2/input.txt"));


            // 이름, 학번, 전공과목, 점수 (국어, 수학, 영어)
            String inputString = br.readLine();
            String[] inputArr = inputString.split(" ");
            Student kim = new Student(inputArr[0], inputArr[1]);
            kim.addScore(inputArr[2],inputArr[3],inputArr[4]);

            inputString = br.readLine();
            inputArr = inputString.split(" ");
            Student lee = new Student(inputArr[0], inputArr[1]);
            lee.addScore(inputArr[2],inputArr[3],inputArr[4]);

            // 콘솔에 출력
            kim.showStudentInfo();
            lee.showStudentInfo();

            // txt 파일에 입선
            String str = "이름\t학번\t전공과목\t국어\t수학\t영어\n" + kim.getStudentInfo() + lee.getStudentInfo();
            bs.write(str.getBytes());
        } catch (Exception e) {
            e.getStackTrace();
            // TODO: handle exception
        } finally {
            bs.close();
        }


//        String[] header = {"이름", "학번", "전공과목", "국어", "수학", "영어"};
//        // arraylist로 하기
//        String[][] contents = new String[2][6];
//        // 받은 txtFile을 분해하기.
//        for (int i = 0; i < txtFile.size() - 1; i++) {
//            String[] arr = txtFile.get(i + 1).split(" ");
//            // 새로운 학생 생성.
//            contents[i][0] = arr[0]; // 이름
//            contents[i][1] = "1001"; // 학번. 이거 고쳐야 함.
//            for (int j = 1; j <= 4; j++) {
//                if (arr[j].equals(".")) arr[j] = " "; // .을 공백으로 바꿔주기.
//                contents[i][j+1] = arr[j]; // 전공과목, 성적(국어, 수학, 영어)
//            }
//        }

    }
}
