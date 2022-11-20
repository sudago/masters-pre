package week2.algorism;

import java.util.ArrayList;

public class CraneGame {
    public static void main(String[] args) {
        int[][] board = {
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0}
        };
        int[] moves = {1, 2, 3, 4};
        System.out.println(solution(board, moves));
    }

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < moves.length; i++) {
            int doll = checkDoll(board, moves, i); // 인형 꺼내기
            if ((list.size() == 0) || ((list.get(list.size()-1) != doll) && (doll != 0))) {
                list.add(doll);
                // && (doll != 0) 없을 경우, board가 모두 0일 때, 카운트가 되더라.. (테케 1,2번 실패)
            } else if ((list.get(list.size()-1) == doll) && (doll != 0)) {
                list.remove(list.size()-1); // pop 하기
                answer += 2; // count 하기
            // 인형이 존재했으나 stack 의 맨 마지막 인형과 달랐을 때, stack 의 맨 마지막에 인형 추가.
            }
        }
        return answer;
    }

    public static int checkDoll(int[][]board, int[] moves, int n) {
        int doll = 0;
        for (int[] columnBlock : board) { // 세로줄만 확인한다.
            int i = moves[n] - 1; // -1 해서 index 값으로 변경.
            if (columnBlock[i] != 0) { // 인형이 존재하면
                doll = columnBlock[i];
                columnBlock[i] = 0;
                break;
            }
        }
        // 크레인이 내려갔던 세로줄에 인형이 없었다면, doll 의 값은 0.
        return doll;
    }
}
