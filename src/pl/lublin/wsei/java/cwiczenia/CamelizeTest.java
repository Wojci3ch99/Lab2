package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.StringFun;

import java.util.Scanner;

public class CamelizeTest {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        do {
            System.out.print("Podaj tekst do sprawdzenia (0, jak Ci się znudzi): ");
            String tekst = scn.nextLine();
            if (tekst.equals("0")) break;
            System.out.println("Tekst: " + tekst + ", tekst skamelizowany: " +
                    StringFun.camelize(tekst));
        } while(true);
    }
}
