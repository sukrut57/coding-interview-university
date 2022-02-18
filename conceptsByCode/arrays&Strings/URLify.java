/*URLify: Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient space at the end to hold the additional 
characters, and that you are given the "true" length of the string. (Note: If implementing in Java, please use a character array so that you can
perform this operation in place.) */

public class URLify {
    public static void main(String[] args){

        String input="Mr John Smith ";
        input = input.trim();
        input = input.replaceAll("\\s", "%20");
        System.out.println(input);
    
    }
}
