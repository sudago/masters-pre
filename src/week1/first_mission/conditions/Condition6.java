package week1.first_mission.conditions;

// 2525번 오븐시계
import java.io.*;
import java.util.StringTokenizer;

public class Condition6 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(br.readLine());

        int H = 0;
        int M = (A * 60) + B + C;

        H = M / 60;
        M = M % 60;

        if (H >= 24) H -= 24;

        System.out.println(H + " " + M);
    }
}