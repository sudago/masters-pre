package study.calculator;

import java.util.Scanner;

public class Calculator { // Input, Output 클래스 사용.
    static int calculate(int first, String symbol, int second) {
        int result = 0;
        if (symbol.equals("+")) {
            result = first + second;
            System.out.println("덧셈 : " + result);
        } else if (symbol.equals("-")) {
            result = first - second;
            System.out.println("뺄셈 : " + result);
        } else if (symbol.equals("*")) {
            result = first * second;
            System.out.println("곱셈 : " + result);
        } else if (symbol.equals("/")) {
            result = first / second;
            System.out.println("나눗셈 : " + result);
        } else {
            System.out.println("사칙연산 기호가 아닙니다.");
        }
        return result;
    }

    /*
    사용자가 종료 할 때 까지 숫자를 입력받아 계산 결과를 출력한다.
    첫번째 숫자, 기호, 두번째 숫자, 기호, 세번째 숫자...를 하나씩 입력 받는다.
    quit 을 입력하면 최종 결과 값을 출력하고 프로그램을 종료한다.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Input.getFirstValue(scanner); // 첫번째 숫자를 입력받는다.

        int result = first; // 첫번째 숫자를 result 에 저장한다.
        while(true) {
            String symbol = Input.getSymbol(scanner); // 사칙연산 기호를 입력받는다.

            if (symbol.equals("quit")) { // quit을 입력받으면
                Output.print(result); //  Output 클래스의 print() 메서드로 결과를 출력하고
                break; // while 문을 빠져나와서 입력 받는 것을 종료한다.
            }

            int second = Input.getSecondValue(scanner); // 두번째 숫자를 입력받는다.

            result = calculate(result, symbol, second); // Calculator 클래스의 calculate() 메서드를 사용한다.
        }
    }
}
