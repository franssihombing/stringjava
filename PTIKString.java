
package string;

import java.util.Arrays;
import java.util.Locale;

public class PTIKString {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(isUpperCase('A') + " - " + isUpperCase('a'));
        System.out.println(isCapital('B') + " - " + isCapital('b'));
        System.out.println(isNumber('5'));
        System.out.println(toUpper('a'));
        System.out.println(toLower('A'));
        System.out.println("");
        System.out.println(lowerCase("Universitas Negeri Jakarta"));
        System.out.println(titleCase("frans tamVan pemBerAnI"));
        System.out.println(toggleCase("FrAnS KeCe Dari LAHir"));
        System.out.println("");
        System.out.println(reverseString1("Universitas"));
        System.out.println(reverseString2("Jakarta"));
        System.out.println("");
        System.out.println(compareSensitiveString("UNJ", "UNJ"));
        System.out.println(compareInSensitiveString("UNJ", "unj"));
        System.out.println(compareSensitiveString2("PTIKUNJ", "PTIK"));
        System.out.println("");
        System.out.println(left("PTIKFTUNJ",4));
        System.out.println(right("PTIKFTUNJ",3));
        System.out.println(mid("PTIKFTUNJ",4, 2));
        System.out.println("");
        System.out.println(isPalindrome("malam"));
        System.out.println(isPalindrome("makan"));
        System.out.println(isPalindrome("kasur nababan rusak"));
        System.out.println("");
        System.out.println(isAnagram("batu", "tabu"));
        System.out.println(isAnagram("batu", "tabo"));
        System.out.println("");
        System.out.println(isPangram("the quick brown fox jumps over the lazy dog"));
        System.out.println("");
        System.out.println(isIsogram("hombing"));
        System.out.println(isIsogram("himbing"));
        System.out.println("");
        System.out.println(cetakGanjilGenap("1g82012as95120123as526"));
        System.out.println("");
        System.out.println(countString("kuku kaki ku kaya kuku kaki saya"));
        System.out.println("");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Tugas Mandiri AlPro 03");
        System.out.println("Fransiscus Sihombing (1512621024)");
        System.out.println("Pendidikan Teknik Informatika dan Komputer");
        System.out.println("-----------------------------------------------------------------------------");
    }
    
    static boolean isUpperCase(char c){// apakah c adalah huruf besar, jika bernilai false apa otomatis c adalah huruf kecil?
        return ((c>='A') && (c<='Z'));
    }

    public static boolean isCapital(char c){//menentukan apakah sebuah karakter adalah huruf kapital    
        if((int)c>=65&&(int)c<=90)
            return true;
        else
            return false;
    }
    
    static boolean isLowerCase(char c){// apakah c adalah huruf kecil
      return ((c>='a') && (c<='z'));
    }  

    public static boolean isLetter(char c){
        //menentukan apakah sebuah karakter adalah huruf
        return (c>='A' && c<='Z') || (c>='a' && c<='z');        
    }

    // ini tugas yang harus di lengkapi => isNumber
    static boolean isNumber(char c){// apakah c adalah karakter angka
        return (c>='0' && c<='9');
    }

    static char toUpper(char c){// mengembalikan huruf besar dari huruf kecil
        if ((c>='a') && (c<='z')){
             return (char)((int)c-32);
        }
            return c;//mengembalikan karakter asli, jika  bukan huruf kecil
            
//        if((int)c>=97&&(int)c<=122)
//            return (char)((int)c-32);
//        else
//            return c;            
    }

    // ini tugas yang harus di lengkapi => toLower
    public static char toLower(char c){//mengembalikan huruf kecil dari sebuah karakter huruf besar
        if ((c>='A') && (c<='Z')){
            return (char)((int)c+32);
        }
        return c;
    }
    
    static String lowerCase (String s){// mengembalikan string s dalam bentuk lowercase
        char[] temp = s.toCharArray();  
        for(int i = 0;i<temp.length ;i++){
            temp[i]=toLower(s.charAt(i));
        }
        return String.valueOf(temp);
    }

    // ini tugas yang harus di lengkapi => titleCase
    static String titleCase (String s){  // mengembalikan string s dalam bentuk titleCase
        char[] temp = s.toCharArray();
        for(int i = 0;i<temp.length ;i++){
            temp[i]=toLower(s.charAt(i));
            temp[0]=toUpper(s.charAt(0));
            if (temp[i] == ' ') {
                i+=1;
                temp[i]=toUpper(s.charAt(i));
            }
        }
        System.out.print("frans tamVan pemBerAnI (Title Case) = ");
        return String.valueOf(temp);
    }

    // ini tugas yang harus di lengkapi => toggleCase
    static String toggleCase (String s){  // mengembalikan string s dengan mengubah huruf kecil menjadi huruf desar dan sebaliknya
        char[] temp = s.toCharArray();
        for(int i = 0;i<temp.length ;i++){
            if (isUpperCase(temp[i])) {
                temp[i]=toLower(s.charAt(i));
            }
            else
                temp[i]=toUpper(s.charAt(i));
        }
        System.out.print("FrAnS KeCe Dari LAHir (Toggle Case) = ");
        return String.valueOf(temp);
    }

    public static String upperCase(String s){
    //mengembalikan sebuah string  kapital dari sebuah string
        String tempS="";
        for(int i=0;i<s.length();i++){
            tempS+=toUpper(s.charAt(i));
        }
        return tempS;
    }


    public static boolean compareSensitiveString(String s1, String s2){
    //menentukan apakah 2 buah string sama atau tidak, memperhatikan huruf besar/kecil, mengembalikan true/false
        if(s1.length()!=s2.length()) return false;       
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)) return false;
        }
        return true;
    }
    public static int compareSensitiveString2(String s1, String s2){
    //menentukan apakah 2 buah string sama atau tidak, memperhatikan huruf besar/kecil, mengembalikan, 1,0,-1
        //if(s1.length()!=s2.length()) return false;  
        int panjang=s1.length();        
        if(s1.length()>s2.length()) panjang = s2.length();
        
        int i;
        for(i=0;i<panjang;i++){
            if(s1.charAt(i)>s2.charAt(i)) return 1;
            if(s1.charAt(i)<s2.charAt(i)) return -1;
        }
        if(i<s1.length()) 
            return 1;
        else if(i<s2.length())
            return -1;
        else
            return 0;
    }    
    public static boolean compareInSensitiveString(String s1, String s2){
    //menentukan apakah 2 buah string sama atau tidak, mengabaikan huruf besar/kecil    
        if(s1.length()!=s2.length()) return false;  
        //s1 = upperCase(s1);
        //s2 = upperCase(s2);
        for(int i=0;i<s1.length();i++){
            if(toUpper(s1.charAt(i))!=toUpper(s2.charAt(i))) return false;
        }
        return true;
    }
    
    public static String left(String s,int len){
    //mengembalikan sebuah substring dari posisi kiri, sebanyak len karakter dari sebuah string
        String tString="";
        if(len>s.length()) return "";
        for(int i=0;i<len;i++){
            tString+=s.charAt(i);
        }
        return tString;
    }

    // ini tugas yang harus di lengkapi => Right
    public static String right(String s,int len){
    //mengembalikan sebuah substring dari posisi kanan, sebanyak len karakter dari sebuah string
        String tString="";
        if(len>s.length()) return "";
        for(int i = s.length()-len; i<s.length(); i++){
                tString+=s.charAt(i);
        }
        return tString;
    }

    // ini tugas yang harus di lengkapi => Mid
    public static String mid(String s,int start,int len){
    //mengembalikan sebuah substring dari posisi start sepanjang len, dari posisi kiri.
        String tString="";
        if(len>s.length()) return "";
        for(int i = start; i<start+len; i++){
            tString+=s.charAt(i);
        }
        return tString;
    }
 
    
    public static String reverseString1(String s){//mengembalikan hasil balikan string
        String tempS="";
        for(int i= s.length()-1;i>=0;i--){
            tempS+=s.charAt(i);
        }
        return tempS;
    }

    public static void swapElemenCharArray(char[] c,int pos1, int pos2){
        char temp = c[pos1];        
        c[pos1] = c[pos2];      
        c[pos2] = temp;        
    }
    public static String reverseString2(String s){//mengembalikan hasil balikan string
        char[] temp = s.toCharArray();  
        for(int i=0;i<temp.length/2;i++){
            swapElemenCharArray(temp, i, temp.length-i-1);
            //System.out.println(temp);
        }
        return String.valueOf(temp);
    }    
    public static boolean isPalindrome(String s){
    //mengembalikan apakah sebuah string adalah palindrome, case sensitive
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
        }
        return true;
    }
     
    public static String isAnagram(String s1, String s2){
    //mengembalikan apakah dua buah string adalah sebuah anagram
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        if (s1.length() == s2.length()) {
            char[] temp1 = s1.toCharArray();
            char[] temp2 = s2.toCharArray();

            Arrays.sort(temp1);
            Arrays.sort(temp2);

            boolean result = Arrays.equals(temp1, temp2);

            if(result) return s1 + "&" + s2 + " Anagram = " + true;

        }
        return s1 + "&" + s2 + " Anagram = " + false;    }
    
    public static boolean isPangram(String s1){
    //mengembalikan apakah sebuah string adalah sebuah pangram
        s1 = s1.toLowerCase();
        int len = s1.length();
        boolean[] hurufList = new boolean[26];
        int index = 0;
        int flag = 1;

        char arr[] = s1.toCharArray();

        for (int i = 0; i < len ; i++) {
            if (isLetter(arr[i])) {
                index = s1.charAt(i) - 'a';
            }
            hurufList[index] = true;
        }
        for (int i = 0; i <= 25; i++) {
            if (hurufList[i] == false)
                flag = 0;
        }
        System.out.print(s1 + " , Pangram = ");
        if (flag == 1);
        return true;
    }

    public static String isIsogram(String s1){
    //mengembalikan apakah sebuah string adalah sebuah isogram
        s1 = s1.toLowerCase();
        int len = s1.length();

        char arr[] = s1.toCharArray();

        Arrays.sort(arr);
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] == arr[i + 1]) return s1 + " Isogram = " + false;
        }
        return s1 + " Isogram = " + true;
    }

    public static String cetakGanjilGenap(String s1) {
        //memisahkan angka ganjil dan genap
        char arr[] = s1.toCharArray();

        String ganjil ="";
        String genap  ="";
        for(int i = 0; i<s1.length(); i++){
            // kondisi agar hanya angka saja yang di eksekusi
            if (isNumber(arr[i])) {
                if (arr[i] % 2 != 0) {
                    ganjil+=arr[i];
                }
                else{
                    genap+=arr[i];
                }
            }
        }
        return s1 + " | Ganjil = " + ganjil  + " , Genap = " + genap;
    }

    public static String countString(String s1) {
        //menghitung jumlah huruf/angka
        char arr[] = s1.toCharArray();

        int jumlah = 0;
        for(int i = 0; i<s1.length(); i++){
            // kondisi agar tidak ikut menjumlah spasi
            if (arr[i] != ' ') {
                    jumlah += 1;
                }
            }
        return "-> " + s1 + "\nCount String = " + jumlah;
    }

}
