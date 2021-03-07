package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.StrongPasswordGenerator;

public class StrongPasswordGeneratorTest {
    public static void main(String[] args) {

    String passwd = new StrongPasswordGenerator(10, true, true, true, true
            ,"!@#$%^&").generate();


    System.out.println("To jest Twoje wygenerowane hasło: "+ passwd);

    }

    public StrongPasswordGeneratorTest(int dlugosc, boolean maleLitery, boolean wielkieLitery
    , boolean cyfry, boolean znakiSpecjalne, String dozwoloneZnakiSpecjalne){

    }
}
