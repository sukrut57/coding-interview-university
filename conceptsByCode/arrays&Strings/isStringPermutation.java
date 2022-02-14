import java.util.*;

/*Check Permutation: Given two strings, write a method to decide if one is a permutation of the
other*/
public class isStringPermutation{
    public static void main(String[] args){
        
        String s1="dog";
        String s2="god";
        if(s1.length() !=s2.length()) System.out.println("false");
        if(s1 == null && s2!=null || s1!=null && s2==null) System.out.println("false");
        if(checkPermutation(s1).equals(checkPermutation(s2))) System.out.println("true");
        
        String result = checkPermutation2(s1, s2);
        System.out.println(result);


    }
    public static String checkPermutation(String s){
        //case sensitive and whitespace signitifact
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        return new String(charArr);   
    }

    public static String checkPermutation2(String s1,String s2){
        char[] charArr1=s1.toCharArray();
        int count=0;
        for(char c:charArr1){
            count+=(int) c;
        }

        for(int i=0;i<s2.length();i++){
            count-=(int) s2.charAt(i);
        }
        if(count!=0) return "fasle";

        return "true";
    }

}