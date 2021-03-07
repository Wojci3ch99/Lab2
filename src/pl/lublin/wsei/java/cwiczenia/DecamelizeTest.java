package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.StringFun;

import java.util.Scanner;

public class DecamelizeTest {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        do {
            System.out.print("Podaj tekst do sprawdzenia (0, jak Ci się znudzi): ");
            String tekst2 = scn.nextLine();
            if (tekst2.equals("0")) break;
            System.out.println("Tekst: " + tekst2 + ", tekst zdekamelizowany: " +
                    StringFun.decamelize(tekst2));
        } while(true);
    }
}