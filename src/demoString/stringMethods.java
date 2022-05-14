package demoString;

import java.util.Scanner;

public class stringMethods {
    public static void main(String[] args) {
        int length = "hddojfgjd".length();
        System.out.println("string length is " +length);

        String original = "Hellofgfgllosfdhdj";
        String str = "llo";


        System.out.println("The second position is: " + searchStr(original, str));

        char[] chars = original.toCharArray();
        int col = 0;
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
            col++;
            if( col%5 == 0)
                System.out.println();
        }

        System.out.println("=============================");
        countCharNumber();
    }
    //search a special chars "llo" at the second location in the given string
    public static int searchStr(String original, String str){
        int l1 = original.indexOf(str);
        l1 = l1 + str.length();
        System.out.println("firt str is: " + original.substring(0, l1));
        int result = original.indexOf(str,l1);
        System.out.println("second str is: " + original.substring(result));
        return result;
    }

    //Count a string char number
    public static  void countCharNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please key some chars: ");
        String input = sc.next();

        int countUpper = 0;
        int countLower = 0;
        int countNumber = 0;
        int countOther = 0;
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if(('A' <= ch) && (ch <= 'Z')){
                countUpper++;
            }else if ('a' <= ch && ch <= 'z'){
                countLower++;
            }else if ('0' <= ch && ch <= '9'){
                countNumber++;
            }else {
                countOther++;
            }

        }
        System.out.println("the input string Upper char is: " + countUpper);
        System.out.println("the input string Lower char is: " + countLower);
        System.out.println("the input string Number char is: " + countNumber);
        System.out.println("the input string Other char is: " + countOther);
    }
}
