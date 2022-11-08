package week1.first_mission.conditions;

// 2753번 윤년
import java.io.*;

public class Condition3 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // 방법 1 - 삼항 연산자의 중첩
        System.out.println((n % 400 == 0) ? 1 : (n % 100 == 0) ? 0 : (n % 4 == 0) ? 1 : 0);

//        // 방법 2 - if문에 여러개의 논리 연산자 사용
//        String answer = "0";
//        if ((n % 4 == 0 && n % 100 != 0) || n % 400 == 0)
//           answer = "1";
//        System.out.println(answer);
    }
}