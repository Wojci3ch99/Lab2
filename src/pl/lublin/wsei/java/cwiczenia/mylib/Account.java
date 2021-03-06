package pl.lublin.wsei.java.cwiczenia.mylib;
import org.apache.commons.lang3.StringUtils;

import java.util.Locale;

public class Account {
    private String name;
    private static String ukrAlphabet = "абвгдеєжзиіїйклмнопрстуфхцчшщьюя";
    private static String translitRepl[] = {"a","b","v","g","d","e","je","zh","z","y","i","ji", "j",
            "k","l","m","n","o","p","r","s","t","u","f","h","c", "ch","sh","shh","'","ju","ja"};

    public static String capitalize(String aStr) {
        String[] tokens = StringUtils.split(aStr);
        for(int i = 0; i < tokens.length; i++)
            tokens[i] = StringUtils.capitalize(tokens[i]);
        return StringUtils.join(tokens,' ');
    }

    public void setName(String name) {
        this.name = capitalize(name);
    }


    public String getName() {
        return name;
        }

    public static String translit(String arg){
        String text = arg.toLowerCase(Locale.ROOT);
        String result ="";

           for( int i = 0; i < text.length(); i++)
           {
               char znak = text.charAt(i);
               int index = ukrAlphabet.indexOf(znak);
                   if (index == -1){
                       result = result + znak;
                   }
                   else{
                       result = result + translitRepl[index];
                   }
           }
        return result;
    }
}