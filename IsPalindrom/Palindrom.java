public class Palindrom {
    public boolean isPalindrom(String testString){

        String[] mas=testString.split("");
        StringBuilder test=new StringBuilder();
        for(int i = testString.length()-1; i>=0 ; i--){

            test.append(mas[i]);            //reverse the testString

        }
        return testString.equals(test.toString());
    }
}
