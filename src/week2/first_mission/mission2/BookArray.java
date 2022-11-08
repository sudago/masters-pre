package week2.first_mission.mission2;

import java.util.ArrayList;

public class BookArray {
    public static void main(String[] args) {
        Book[] libraryA = new Book[5];
        libraryA[0] = new Book("태백산맥","조정래");
        libraryA[1] = new Book("이기적 유전자","리처드 도킨즈");
        libraryA[2] = new Book("자전거 도둑","박완서");
        libraryA[3] = new Book("토지","박경리");
        libraryA[4] = new Book("대변동","제레드 다이아몬드");

        // 얕은 복사.
        Book[] libraryA1 = new Book[5];
        System.arraycopy(libraryA, 0, libraryA1, 0, 5);

        /* 주소값이 나옴.
        for (int i = 0; i < 5; i++) {
            System.out.println(libraryA[i]);
            System.out.println(libraryA1[i]);
        }
        */

        // 깊은 복사.
       /* Book[] libraryB = new Book[5];
        for (int i = 0; i < libraryB.length; i++) {
            libraryB[i] = new Book(); // 디폴트 생성자로 배열 인스턴스 생성.
            libraryB[i].setBookName(libraryA[i].getBookName());
            libraryB[i].setAuthor(libraryA[i].getAuthor());
        }
        */
        ArrayList<Book> libraryB = new ArrayList<Book>();
        for (Book b : libraryA) {
            libraryB.add(new Book(b.getBookName(), b.getAuthor()));
        }



        // 3번째 책 목록 변경.
        libraryA[2].setBookName("그 많던 싱아는 누가 다 먹었을까");
        libraryA[2].setAuthor("박완서");

        // ArrayList클래스를 이용해서 마지막 목록 추가
//        libraryB[5] = new Book("사피엔스", "유발 하라리"); // 이거 아니고,
        libraryB.add(new Book("사피엔스", "유발 하라리"));


        System.out.println("=====A=====");
        // 향상된 for문과 배열 사용.
        for (Book b : libraryA) {
            b.showBookInfo();
        }
        System.out.println("=====A1=====");
        for (Book b : libraryA1) {
            b.showBookInfo();
        }
        System.out.println("=====B=====");
        for (Book b : libraryB) {
            b.showBookInfo();
        }
    }
}
