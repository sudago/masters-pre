package week1.second_mission.mission1;

// 1번 미션
public class Number {
    int a = 10;
    int b = 2;

    public int addNum() {
        return a + b;
    }
    public int subNum() {
        return a - b;
    }

    public int mulNum() {
        return a * b;
    }

    public int divNum() {
        return a / b;
    }

    public String result () {
        return "덧셈: " + addNum() +"\n뺄셈: " +  subNum() + "\n곱셈 : "
                + mulNum() + "\n나눗셈: " + divNum();
    }

    public static void main(String[] args) {
        Number number = new Number();
        System.out.println(number.result());
    }
}
