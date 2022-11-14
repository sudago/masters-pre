package week2.second_mission;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String str = "하이 헬로";
        String[] strArr = {"바이", "굿바이"};

        System.out.println(str);
        System.out.println(Arrays.toString(strArr));

        str = "오늘 하루도 고생 많았다. 수고했어. 잘 해냈어.";
        strArr = new String[] {"앞으로도", "기죽지말고", "열심히 하자"};
        System.out.println(str);
        System.out.println(Arrays.toString(strArr));
    }
}
