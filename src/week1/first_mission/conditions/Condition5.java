package week1.first_mission.conditions;

// 2884번 알람 시계
import java.io.*;
import java.util.StringTokenizer;

public class Condition5 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        M -= 45;

        if (M < 0){
            M += 60;
            H--;
        }
        if (H < 0) H += 24;

        System.out.println(H + " " + M);
    }
}