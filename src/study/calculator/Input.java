package study.calculator;

import java.util.Scanner;

public class Input {
    static int getFirstValue(Scanner scanner) {
        System.out.println("첫 번째 입력 값 : ");
        int first = scanner.nextInt();
        System.out.println(first);
        return first;
    }

    static String getSymbol(Scanner scanner) {
        System.out.println("사칙 연산 기호 : ");
        String symbol = scanner.next();
        System.out.println(symbol);
        return symbol;
    }

    static int getSecondValue(Scanner scanner) {
        System.out.println("두 번째 입력 값 : ");
        int second = scanner.nextInt();
        System.out.println(second);
        return second;
    }
}
