package week1.first_mission.star_patterns;

// 2438번 별찍기 - 1

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Star1 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int n = Integer.parseInt(st.nextToken());
        String tmp = "";

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++)
                tmp += "*";
            System.out.println(tmp);
            tmp = "";
        }
    }
}