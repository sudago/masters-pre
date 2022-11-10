package week2.algorism;

import java.util.ArrayList;
import java.util.Arrays;


// 시간 복잡도 O(n log n)생각해서 퀵정렬로 푼 풀이.
public class Divisor {
    private static int[] checkElements(int[] arr, int divisor){ // 나누어 떨어지는 수 확인
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i : arr) {
            if (i % divisor == 0) {
                list.add(i);
            }
        }

        if (list.size() == 0) list.add(-1);
        return arraylistToArray(list);
    }

    private static int[] arraylistToArray(ArrayList<Integer>list){ // arraylist를 array로 바꾸기
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    private static void quickSort(int[] arr) { // 분할정복(퀵정렬)로 정렬하기. 시작.
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr,int start, int end) { // 재귀 호출로 문제 해결.
        int part2 = partition(arr, start, end); // start 값을 return 한다.
        if (start < part2 - 1) {
            quickSort(arr, start, part2 - 1);
        }
        if (part2 < end) {
            quickSort(arr, part2, end);
        }
    }

    private static int partition(int[] arr, int start, int end){ // start index를 return 한다.
        int pivot = arr[(start+end) / 2];
        while (start <= end) {
            while (arr[start] < pivot) start++;
            while (pivot < arr[end]) end--;
            if (start <= end) {
                swap(arr, start, end);
                start++;
                end--;
            }
        }
        return start;
    }

    private static void swap(int[] arr, int start, int end) {
         int tmp = arr[start];
         arr[start] = arr[end];
         arr[end] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = {2, 36, 1, 3};
        int divisor = 1;

        // 1. 임시로 넣어 놓을 배열을 설정한다.
        // 2. arraylist로 만든 배열을 array로 변경한다.
        int[] answerArr = checkElements(arr, divisor);

        if (1 < answerArr.length) {
            // 정렬 함수 실행
            quickSort(answerArr);
        }

        // Arrays 클래스의 메서드를 이용해서 배열 출력.
        System.out.println(Arrays.toString(answerArr)); // [10, 20, 30]

    }
}
