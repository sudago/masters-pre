package study.baseball;

import java.util.Scanner;
/*
1. 컴퓨터가 서로 다른 임의의 수 3개 선택.
2. 내가 숫자를 제시하면 strike, ball 을 출력하고, 틀렸다면 다시 시도.
3. 무한히 시도하다가, 맞추면 종료하기.
 */

public class BaseballGameTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BaseballGame baseballGame = new BaseballGame();
        // scanner로 입력 받을 때 마다, answerNumber가 바뀌지 않게 하기.
        String[] answerArray = baseballGame.setGameNumber();
        baseballGame.startGame(); // 안내 메세지 출력.

        // 정답을 맞출 때 까지 입력 받기.
        while(scanner.hasNext()) {
            String input = scanner.next();
//            System.out.println(input);
            String[] inputArray = input.split(""); // 입력받은 문자열 -> 배열로 바꾸기.

            // 룰 적용하기.
            int strike = 0;
            int ball = 0;
            // 1. 스트라이크 카운트 하기
            for (int i = 0; i < 3; i++) {
                if (answerArray[i].equals(inputArray[i])) {
                    strike++;
                }
                // 2. ball 카운트 하기
                ball += baseballGame.countBall(answerArray, inputArray, i);
            }
            ball -= strike;

            // 정답 출력하기.
            baseballGame.showStrikeAndBallInfo(strike, ball);
            if (baseballGame.showResult(answerArray, inputArray)) {
                break;
            }
//            System.out.println("정답: " + String.join("", answerArray));
        } // while - end

        scanner.close();
    }
}
