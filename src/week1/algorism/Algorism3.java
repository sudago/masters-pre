package week1.algorism;

// 2920번 음계
import java.io.*;
// import java.util.StringTokenizer;

public class Algorism3 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 방법 2 - 진솔님 짱짱 방법
        String ascending = "1 2 3 4 5 6 7 8";
        // reverse 메서드가 있다면 그걸 사용하면 되지 않을까 했지만, 배열이 아닌 문자열이라 불가.
        String descending = "8 7 6 5 4 3 2 1";
        String input = br.readLine();
//        또틀림ㅠㅠ 알고보니 ==을 쓰면 주소값을 비교하게 되는것이라고 한다..
//        System.out.println(input == ascending ? "ascending" : input == descending ? "descending" : "mixed");
//      새로운 equals메서드를 알게 되었다.
        System.out.println(input.equals(ascending) ? "ascending" : input.equals(descending) ? "descending" : "mixed");

//        // 방법 1 - 내가 짠 방법 = 틀림 ㅠㅠㅠ '뇌피셜 flag'를 사용해보고 싶었지만 실패...
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int note = Integer.parseInt(st.nextToken());
//        String answer = "descending";
//
//        if (note == 1) answer = "ascending";
//        note = Integer.parseInt(st.nextToken());
//
//        for (int i = 2; i <= 8; i++) {
//            if (i == note) {
//                if (answer != "ascending") answer = "mixed";
//            } else if (i == (9 - note)) {
//                if (answer != "descending") answer = "mixed";
//            } else {
//                answer = "mixed";
//            }
//
//            // mixed면 출력.
//            if (answer == "mixed") {
//                System.out.println(answer);
//                System.out.println(i);
//                return;
//            }
//            // note 리셋
//            note = Integer.parseInt(st.nextToken());
//        }
//        System.out.println(answer);

//        // 방법 1-1 - 내가 짠 방법 수정 = 틀림... 이 문제에 거의 3시간 썼으니까 이제 그만하자!
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int note = Integer.parseInt(st.nextToken());
//        int i = 1;
//
//        while(i <= 8) {
//            if(i != note || i != (9 - note)) break;
//            note = Integer.parseInt(st.nextToken());
//            i++;
//        }
//        String answer = (i-1) == note ? "ascending" : (i-1) == (9-note) ? "descending" : "mixed";
//        System.out.println(answer);

    }
}