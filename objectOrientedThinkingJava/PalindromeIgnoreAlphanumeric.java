import java.util.Scanner;

public class PalindromeIgnoreAlphanumeric {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        //Prompt the user to enter a string:
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        //Display the result:
        System.out.println("Ignoreing nonalphanumeric characters, \n is "
        + s + " a palindrome? " + isPalindrome(s));

        input.close();
    }

    public static boolean isPalindrome(String s) {
        //Create a new string by eliminating nonalphanumeric chars:
        String s1 = filter(s);

        //Create a new string that is the reversal of s1:
        String s2 = reverse(s1);

        // Check if the reversal is identical to the original string:
        return s2.equals(s1);
    }

    public static String filter(String s){
        //Create a stringbuilder:
        StringBuilder stringBuilder = new StringBuilder();

        //Examine each character in the string to skip 
        //alphanumeric char:
        for(int i = 0; i < s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                stringBuilder.append(s.charAt(i));
            }
        }

        return stringBuilder.toString();
    }

    public static String reverse(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse(); //Invoke reverse method in StringBuilder:
        return stringBuilder.toString();
    }
}
