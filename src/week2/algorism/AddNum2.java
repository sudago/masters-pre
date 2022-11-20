package week2.algorism;

import java.util.ArrayList;
import java.util.Arrays;

public class AddNum2 {
    public static void main(String[] args) {
        int[] numbers = {5,0,2,7};
    ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                if (!arrayList.contains(sum)) {
                    arrayList.add(sum);
                }
            }
        }
        // 방법 1. 반복문을 이용해서 배열에 넣기
        int[] answer = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
        }
        // 방법 2. stream 을 사용.
//        int[] answer = arrayList.stream()
//                                .mapToInt(Integer::intValue)
//                                .toArray();
        Arrays.sort(answer);
        System.out.println(Arrays.toString(answer));
    }
}
