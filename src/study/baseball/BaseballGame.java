package study.baseball;

import java.util.ArrayList;
import java.util.Arrays;

public class BaseballGame {

    public BaseballGame(){}

    // 랜덤하게 3자리 수 정하기.
    // 1. 중복 숫자 제거하기.
    public String[] setGameNumber(){
        ArrayList<Integer> answerList = new ArrayList<>();
        answerList.add((int)(Math.random()*9 + 1));
        while (answerList.size() < 3) { // 서로 다른 수를 넣기 위한 while 문
            int temp = (int)(Math.random()*9 + 1);
            if (!answerList.contains(temp)) { // answerList 가 temp 를 갖고 있지 않으면
                answerList.add(temp); // 랜덤한 수를 추가하기.
            }
        }
        return setToArray(answerList);
    }

    // 2. ArrayList -> Array 에 담기.
    public String[] setToArray(ArrayList<Integer> answerList){
        String[] answerArray = new String[3];
        for (int i = 0; i < 3; i++) {
            answerArray[i] = Integer.toString(answerList.get(i));
        }
        return answerArray;
    }

    // 안내하기
    public void startGame(){
        System.out.print("숫자를 입력해 주세요 ex) 123 : ");
    }

    // 룰 적용하기.
    public int countBall(String[] answerList, String[] inputArray, int i) {
        int count = 0;
        for (int j = 0; j < 3; j++) {
            if (answerList[i].equals(inputArray[j])) {
                count++;
            }
        }
        return count;
    }

    // 정답 보여주기.
    // 1. 정답을 맞췄을 때
    public Boolean showResult(String[] answerList, String[] inputArray) {
        if (Arrays.toString(answerList).equals(Arrays.toString(inputArray))) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            return true;
        }
        return false;
    }

    // 2. 정답이 아닐 때.
    public void showStrikeAndBallInfo(int strike, int ball){
        if (strike == 0 && ball == 0) {
            System.out.println("낫싱");
        } else if (strike > 0 && ball > 0) {
            System.out.println(strike + "스트라이크 " + ball + "볼");
        } else if (strike > 0 && ball == 0) {
            System.out.println(strike + "스트라이크");
        } else if (strike == 0 && ball > 0) {
            System.out.println(ball + "볼");
        }
    }
}
