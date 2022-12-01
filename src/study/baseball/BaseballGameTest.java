package study.baseball;

import java.util.Scanner;// 컴퓨터가 서로 다른 임의의 수 3개 선택.
// 내가 숫자를 제시하면 메세지를 출력하고 다시 시도.
// 내가 무한히 시도하다가, 맞추면 종료하는 방법.

public class BaseballGameTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // scanner로 입력 받을 때 마다, answerNumber가 바뀌지 않게 하기.
        BaseballGame.setGameNumber();
        // 정답을 맞출 때 까지 입력을 받기.
        while(scanner.hasNext()) {
            BaseballGame game = new BaseballGame();
            game.startGame();

            String input = scanner.next();
            // 입력받은 문자열 -> 배열로 바꾸기.
            game.setInputNumber(input);

            // 룰 적용하기.
            game.compareToAnswerNumber();

            // 정답 출력하기.
            if (game.showResult()) {
                break;
            }
        } // while - end

        scanner.close();
    }
}
