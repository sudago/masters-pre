package week1.first_mission.conditions;
// 9498번 시험 성적
import java.io.*;

public class Condition2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        System.out.println((n>=90)?"A":(n>=80)?"B":(n>=70)?"C":(n>=60)?"D":"F");
    }
}
