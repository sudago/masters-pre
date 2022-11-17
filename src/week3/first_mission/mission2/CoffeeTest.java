package week3.first_mission.mission2;

public class CoffeeTest {

    public static void main(String[] args) {

        Coffee ethiopiaAmericano = new EthiopiaAmericano();
        ethiopiaAmericano.brewing(); // 에티오피아 아메리카노 출력
        System.out.println();

        Coffee kenyaAmericano = new KenyaAmericano();
        kenyaAmericano.brewing(); // 케냐 아메리카노 출력
        System.out.println();

        Coffee kenyaLatte = new Latte(kenyaAmericano);
        kenyaLatte.brewing(); //  케냐 아메리카노, adding milk 출력
        System.out.println();

        Coffee brazilMocha = new Mocha(new Latte(new BrazilAmericano()));
        brazilMocha.brewing();// 브라질 아메리카노, adding milk, adding mocha syrup 출력
        System.out.println();

        Coffee hawaiiWhippedMocha =
                new WhippedCream(new Mocha(new Latte( new HawaiiAmericano())));
        hawaiiWhippedMocha.brewing(); // 하와이안 아메리카노, adding milk, adding mocha syrup, adding whippedCream 출력
        System.out.println();

    }
}

