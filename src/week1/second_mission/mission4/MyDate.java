package week1.second_mission.mission4;

public class MyDate {
    private int day;
    private int month;
    private int year;
    public MyDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String isValid() {
        String valid = checkValid(day, month, year);
        return year + "년 " + month + "월 " + day + "일은 "
                + valid + " 날짜입니다.";
    }

    public String checkValid(int d, int m, int y) {
        String notValid = "유효하지 않은";
        String valid = "유효한";
        int[] lastDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (0 > d || 0 > m || 0 > y) { // 음수면
            return notValid;
        }

        if (m == 2 && d == 29) { // 2월이면
            if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) { // 윤년 계산
                lastDay[1] = 29;
            }
        }

        if (lastDay[m-1] < d) {
            return notValid;
        }

        return valid;
    }
}
