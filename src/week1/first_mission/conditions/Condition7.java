package week1.first_mission.conditions;

// 2480번 주사위 세개
import java.io.*;
import java.util.StringTokenizer;

public class Condition7 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int sum = 0;

        // 첫번째 조건 - 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
        if (A == B && B == C) sum += 10000 + (A * 1000);
            // 두번째 조건 - 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
        else if (A == B || B == C) sum += 1000 + (B * 100);
        else if (A == C) sum += 1000 + (A * 100);
            // 세번째 조건 - 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
            // 그냥 else 로만 적어도 되지만, else if로 적는게 직관성을 위해 좋다고 해서 적었다.
        else if (A != B && B != C && A != C) sum += Math.max(A,Math.max(B,C)) * 100;

        System.out.println(sum);
    }
}
