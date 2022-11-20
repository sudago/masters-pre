package week2.algorism;

import java.util.ArrayList;
import java.util.Arrays;

public class MockExam {
    public static void main(String[] args) {
        int[] answers = {1,3,2,4,2};
        System.out.println(Arrays.toString(solution(answers)));
    }
    public static int[] solution(int[] answers) {
        int[] answer = {};
        int[] student1 = {1, 2, 3, 4, 5};
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int student1Count = 0;
        int student2Count = 0;
        int student3Count = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == student1[i % student1.length]) {
                student1Count++;
            }
            if (answers[i] == student2[i % student2.length]) {
                student2Count++;
            }
            if (answers[i] == student3[i % student3.length]) {
                student3Count++;
            }
        }
        // 제일 큰 수를 구하기.
        int max = Math.max(student1Count, Math.max(student2Count, student3Count));

        ArrayList<Integer> list = new ArrayList<>();
        // sort 사용하지 않음. max와 같은 값을 가진 학생의 번호순 대로 넣기.
        if (student1Count == max) {
            list.add(1);
        }
        if (student2Count == max) {
            list.add(2);
        }
        if (student3Count == max) {
            list.add(3);
        }

        // for문으로 arraylist -> array에 넣는게 빠름.
        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
