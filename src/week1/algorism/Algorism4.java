package week1.algorism;

// 8958번 OX퀴즈
import java.io.*;

public class Algorism4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int cnt = 0;
            int sum = 0;
            String str = br.readLine();
            String[] arr = str.split("");
            for (int j = 0; j < str.length(); j++) {
                if (arr[j].equals("O")) {
                    cnt++;
                    sum += cnt;
                } else {
                    cnt = 0;
                }
            }
            System.out.println(sum);
        }
    }
}