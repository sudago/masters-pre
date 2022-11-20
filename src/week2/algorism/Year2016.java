package week2.algorism;

public class Year2016 {
    public static void main(String[] args) {
        int a = 5;
        int b = 24;
        System.out.println(solution(a, b));
    }

    public static String solution(int a, int b) {
        String answer;
        /* 테스트 케이스 9, 13 실패했었는데, 해당 테케는 목요일이 정답 일 경우였고, "THUR"이라고 적었기 때문에 실패했던 것이었다. */
        String[] day = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int[] lastMonthDay = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int sum = 0;

        for (int i = 2; i <= a; i++) {
            sum += lastMonthDay[i-2]; // 전 달의 날짜 만큼 더해준다.
        }
        sum = (sum + b) % 7;
        answer = day[sum];
        return answer;
    }
}
