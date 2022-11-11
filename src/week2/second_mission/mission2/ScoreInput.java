package week2.second_mission.mission2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ScoreInput {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        Student kim = new Student(arr[0], arr[1], arr[2]);
        kim.addKoreanScore(Integer.parseInt(arr[3]));
        kim.addMathScore(Integer.parseInt(arr[4]));
        kim.addEnglishScore(Integer.parseInt(arr[5]));
        kim.showInfo();

//        st = new StringTokenizer(br.readLine());
//        Student lee = new Student(arr[0], arr[1], arr[2]);
//        lee.addKoreanScore(Integer.parseInt(arr[3]));
//        lee.addMathScore(Integer.parseInt(arr[4]));
//        lee.addEnglishScore(Integer.parseInt(arr[5]));
//        lee.showInfo();

    }
}
