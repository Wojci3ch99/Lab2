package pl.lublin.wsei.java.cwiczenia.mylib;

import org.apache.commons.lang3.StringUtils;

import java.util.Locale;

public class StringFun {

    public static boolean isPalindrome(String word){
        return false;
    }

    public static String anarchize(String text){
        String result = "";
        boolean male = Character.isLowerCase(text.charAt(0));
        for  (int i = 0; i < text.length(); i++ ){

            if (male){
                result += Character.toUpperCase(text.charAt(i));
            }
            else{
                result += Character.toLowerCase(text.charAt(i));
            }
            male=!male;
        }
    return result;
    }

    public static String camelize(String tekst){
        String[] tokens = StringUtils.split(StringUtils.normalizeSpace(tekst));
        if (tokens.length == 0) return "";
        String result = tokens[0].toLowerCase();
        for (int i = 1; i < tokens.length; i++){
            result  +=  StringUtils.capitalize(tokens[i].toUpperCase());
        }
        return result;
    }

}
