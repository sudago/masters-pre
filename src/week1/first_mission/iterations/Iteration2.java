package week1.first_mission.iterations;

// 11720번 숫자의 합
import java.io.*;

public class Iteration2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int sum = 0;

        String splitN[] = br.readLine().split("");
        for (String stringN : splitN) {
            sum += Integer.parseInt(stringN);
        }
        bw.write(sum + "");
        bw.flush();
        bw.close();
    }
}