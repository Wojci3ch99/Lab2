package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.StringFun;

import java.util.Scanner;


public class ShuffleTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String tekst;

        System.out.println("Podaj tekst do potasowania: ");
        tekst = scan.nextLine();

        System.out.println("Potoasowany tekst: " + StringFun.Shuffle(tekst));


    }
}