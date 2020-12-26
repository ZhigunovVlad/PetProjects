public class Main {
    public static void main(String[] args) {
    Palindrom palindrom=new Palindrom();
        System.out.println(palindrom.isPalindrom("ababa")); //true
        System.out.println(palindrom.isPalindrom("hello")); //false
        System.out.println(palindrom.isPalindrom("12321")); //true
        System.out.println(palindrom.isPalindrom("Sqllqs"));  //false
    }
}
