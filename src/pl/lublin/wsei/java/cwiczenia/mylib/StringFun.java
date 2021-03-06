package pl.lublin.wsei.java.cwiczenia.mylib;

public class StringFun {


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

}
