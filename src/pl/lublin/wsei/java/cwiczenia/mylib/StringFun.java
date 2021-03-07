package pl.lublin.wsei.java.cwiczenia.mylib;

import org.apache.commons.lang3.StringUtils;

import java.util.Locale;
import java.util.Random;

public class StringFun {

    public static boolean isPalindrome(String tekst) {
        boolean result = false;
        tekst = tekst.toLowerCase();
        tekst = tekst.replace(" ", "");

        String spr = "";

        char[] charList = tekst.toCharArray();
        for (int i = tekst.length() - 1; i >= 0; i--) {
            spr += charList[i];
        }
        if (tekst.equals(spr)) {
            result = true;
        }
        return result;
    }

    public static String anarchize(String text) {
        String result = "";
        boolean male = Character.isLowerCase(text.charAt(0));
        for (int i = 0; i < text.length(); i++) {

            if (male) {
                result += Character.toUpperCase(text.charAt(i));
            } else {
                result += Character.toLowerCase(text.charAt(i));
            }
            male = !male;
        }
        return result;
    }

    public static String camelize(String tekst) {
        String[] tokens = StringUtils.split(StringUtils.normalizeSpace(tekst));
        if (tokens.length == 0) return "";
        String result = tokens[0].toLowerCase();
        for (int i = 1; i < tokens.length; i++) {
            result += StringUtils.capitalize(tokens[i]);
        }
        return result;
    }

    public static String decamelize(String tekst2) {
        String[] tokens = StringUtils.split(StringUtils.normalizeSpace(tekst2));
        String result = "";
        for (int i = 0; i < tokens.length; i++) {
            result += StringUtils.uncapitalize(tokens[i].toUpperCase());
        }
        return result;
    }

    public static String Shuffle(String tekst) {
        String oryginal = tekst;
        String nowy = "";
        char znak;
        int rozmiar;
        Random random = new Random();
        while (oryginal.length() > 0) {
            rozmiar = oryginal.length();
            int i = random.nextInt(rozmiar);
            znak = oryginal.charAt(i);
            oryginal = oryginal.substring(0, i) + oryginal.substring(i + 1);
            nowy += znak;

        }
        return nowy;
    }


}










