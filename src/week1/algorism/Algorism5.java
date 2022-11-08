package week1.algorism;

// 11654번 아스키 코드
import java.io.*;

public class Algorism5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        char c = s.charAt(0);
        System.out.println((int)c);
    }
}
