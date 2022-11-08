package week1.algorism;

// 1008번 A/B
import java.io.*;
import java.util.StringTokenizer;

public class Algorism2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 계속 써 왔던 int로 사용하면 정수 값만 처리해주기 때문에
        // 실수 값을 처리 할 수 있는 double로 사용해준다.
        // Java에서 실수의 기본 자료형은 float보다 정밀도가 더 큰 double형 이다.
        double A = Double.parseDouble(st.nextToken());
        double B = Double.parseDouble(st.nextToken());

        System.out.println(A/B);
    }
}