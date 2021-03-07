package pl.lublin.wsei.java.cwiczenia.mylib;

public class StrongPasswordGenerator{
    private static int dlugosc = 8;
    private static boolean maleLitery, wielkieLitery, cyfry, znakiSpecjalne;
    private static String dozwoloneZnakiSpecjalne;
    private String zbior;
    private int iloscZnakow;

    //zbior malych liter
    private String zbiorMalychLiter = "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,y,z,";
    //zbior wielkich liter
    private String zbiorWielkichLiter = "A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,Y,Z,";
    //zbior znakow specjalnych
    private String zbiorZnakowSpecjalnych = "!,@,#,$,%,^,&,*,";
    //zbior cyfr
    private String zbiorCyfr = "1,2,3,4,5,6,7,8,9,0,";

    public StrongPasswordGenerator(){
        setDlugosc(8);
        setMaleLitery(true);
        setWielkieLitery(true);
        setCyfry(true);
        setZnakiSpecjalne(true);
        setDozwoloneZnakiSpecjalne("*@!");

    }
    public StrongPasswordGenerator(int dlugosc, boolean maleLitery
            , boolean wielkieLitery, boolean cyfry
            , boolean znakiSpecjalne, String dozwoloneZnakiSpecjalne){

        setDlugosc(dlugosc);
        setMaleLitery(maleLitery);
        setWielkieLitery(wielkieLitery);
        setCyfry(cyfry);
        setZnakiSpecjalne(znakiSpecjalne);
        setDozwoloneZnakiSpecjalne(dozwoloneZnakiSpecjalne);




    }
    public String generate() {
        String password = "";

        if(maleLitery == true) this.zbior += this.zbiorMalychLiter;
        if(wielkieLitery == true) this.zbior += this.zbiorWielkichLiter;
        if(cyfry == true) this.zbior += this.zbiorCyfr;
        if(znakiSpecjalne== true) this.zbior += this.zbiorZnakowSpecjalnych;

        //usuwanie przecinka
        this.zbior = this.zbior.substring(0, (this.zbior.lastIndexOf(",")));

        String[] tablicaZnakow = this.zbior.split(",");
        this.iloscZnakow = tablicaZnakow.length;


        for (int i = 0; i < getDlugosc(); i++){
            int count = (int) ((iloscZnakow) * Math.random());
            password += tablicaZnakow[count];
        }

        return password;
    }

    public static int getDlugosc() {
        return dlugosc;
    }

    public static void setDlugosc(int dlugosc) {
        StrongPasswordGenerator.dlugosc = dlugosc;
    }

    public static boolean isMaleLitery() {
        return maleLitery;
    }

    public static void setMaleLitery(boolean maleLitery) {
        StrongPasswordGenerator.maleLitery = maleLitery;
    }

    public static boolean isWielkieLitery() {
        return wielkieLitery;
    }

    public static void setWielkieLitery(boolean wielkieLitery) {
        StrongPasswordGenerator.wielkieLitery = wielkieLitery;
    }

    public static boolean isCyfry() {
        return cyfry;
    }

    public static void setCyfry(boolean cyfry) {
        StrongPasswordGenerator.cyfry = cyfry;
    }

    public static boolean isZnakiSpecjalne() {
        return znakiSpecjalne;
    }

    public static void setZnakiSpecjalne(boolean znakiSpecjalne) {
        StrongPasswordGenerator.znakiSpecjalne = znakiSpecjalne;
    }

    public static String getDozwoloneZnakiSpecjalne() {
        return dozwoloneZnakiSpecjalne;
    }

    public static void setDozwoloneZnakiSpecjalne(String dozwoloneZnakiSpecjalne) {
        StrongPasswordGenerator.dozwoloneZnakiSpecjalne = dozwoloneZnakiSpecjalne;
    }


}
