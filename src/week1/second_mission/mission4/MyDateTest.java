package week1.second_mission.mission4;

public class MyDateTest {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(30, 2, 2000);
        System.out.println(date1.isValid());
        MyDate date2 = new MyDate(2, 10, 2006);
        System.out.println(date2.isValid());

//        에러
//        date1.day = 10;
//        date1.month = 3;
//        date1.year = 2020;
    }
}
