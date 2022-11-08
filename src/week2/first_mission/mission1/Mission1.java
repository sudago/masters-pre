package week2.first_mission.mission1;

public class Mission1 {
    public static void main(String[] args) {
        char[] alphabets = new char[26];
        char a = 'A';

        for (int i = 0; i < alphabets.length; i++) {
            alphabets[i] = a;
            System.out.println(alphabets[i]);
        }
    }
}
