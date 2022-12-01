package study.baseball;

import java.util.Arrays;
import java.util.HashSet;

public class BaseballGame {
    static HashSet<Integer> answerSet = new HashSet<>();
    static String[] answerArray = new String[3];
    String[] inputArray = new String[3];
    int strike = 0;
    int ball = 0;

    public BaseballGame(){}

    // 랜덤하게 3자리 수 정하기.
    // 1. set을 사용해서 중복 숫자 제거하기.
    public static void setGameNumber(){
        while (answerSet.size() < 3) {
            answerSet.add(((int)(Math.random()*9 + 1)));
        }
        setToArray();
    }
    // 2. set -> array에 담기.
    public static void setToArray(){
        int i = 0;
        for (int number : answerSet) {
            answerArray[i] = Integer.toString(number);
            i++;
        }
    }

    // 안내하기
    public void startGame(){
        System.out.print("숫자를 입력해 주세요 ex) 123 : ");
    }

    // 문자열로 받은 input을 배열로 나누기.
    public void setInputNumber(String input) {
        System.out.println(input);
        inputArray = input.split("");
    }

    // 룰 적용하기.
    // 1. 스트라이크 비교하기
    public void compareToAnswerNumber(){ // ✅한가지 일만 하도록 어떻게 하지??
        for (int i = 0; i < 3; i++) {
            if (answerArray[i].equals(inputArray[i])) {
                strike++;
            }
            // ball 카운트는 다른 메서드로 빼 줌 (제약사항)
            countBall(i);
        }
        // strike된 숫자도 ball에 count되서, strike를 센 만큼 빼준다.
        ball -= strike;
    }

    // 2. 볼 세주기.
    public void countBall(int i) {
        for (int j = 0; j < 3; j++) {
            if (answerArray[i].equals(inputArray[j])) {
                ball++;
            }
        }
    }

    // 정답 보여주기.
    // 1. 정답을 맞췄을 때
    public Boolean showResult() {
        if (Arrays.toString(answerArray).equals(Arrays.toString(inputArray))) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            return true;
        } else {
            showStrikeAndBallInfo();
            return false;
        }
    }

    // 2. 정답이 아닐 때.
    public void showStrikeAndBallInfo(){
        if (strike == 0 && ball == 0) {
            System.out.println("낫싱");
        } else if (strike > 0 && ball > 0) {
            System.out.println(strike + "스트라이크 " + ball + "볼");
        } else if (strike > 0 && ball == 0) {
            System.out.println(strike + "스트라이크");
        } else if (strike == 0 && ball > 0) {
            System.out.println(ball + "볼");
        }
        System.out.println("정답: " + String.join("", answerArray)); // 랜덤 숫자 출력
    }
}
