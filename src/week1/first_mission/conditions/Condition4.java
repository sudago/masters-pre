package week1.first_mission.conditions;

// 14681번 사분면 고르기
import java.io.*;

public class Condition4 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int answer = 0;

        // 테스트 해보니까 else if 말고 그냥 if문 4개로 만드는게 조금 더 빨리 실행되었다.
        if (x > 0 && y > 0) answer = 1;
        else if (x < 0 && y > 0) answer = 2;
        else if (x < 0 && y < 0) answer = 3;
        else if (x > 0 && y < 0) answer = 4;
        System.out.println(answer);
    }
}