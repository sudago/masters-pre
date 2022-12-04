package study.calculator;

import java.util.Scanner;

public class StringCalculator { // Calculator, Output 클래스 사용.
    public static void main(String[] args) { // 한 줄을 입력받고 그 줄에 대한 계산 결과 출력 후 프로그램 종료.
        Scanner scanner = new Scanner(System.in); // 입력을 받는다. - Input 클래스 사용X
        System.out.println("계산할 값 입력 : ");

        String value = scanner.nextLine(); // 한 줄을 입력 받는다.
        System.out.println("입력 값 : " + value);

        String[] values = value.split(" ");

        int first = Integer.parseInt(values[0]);
        System.out.println("first : " + first); // 입력 받은 첫번째 숫자를 출력한다.

        int result = first;
        for (int i = 1; i < values.length; i += 2) {
            String symbol = values[i]; // 입력 받은 기호를 출력한다.
            System.out.println("Symbol : " + symbol);

            int second = Integer.parseInt(values[i+1]); // 입력 받은 두번째 숫자를 출력한다.
            System.out.println("second : " + second);

            result = Calculator.calculate(result, symbol, second); // Calculator 클래스의 calculate() 메서드를 활용한다.
        }
        Output.print(result); // 결과를 출력한다. Output 클래스의 print() 메서드 사용.
    }
}
