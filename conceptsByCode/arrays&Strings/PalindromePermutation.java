import java.util.HashMap;
import java.util.Map;

public class PalindromePermutation {
    public static void main(String[] args){
        boolean result=isPalindrome("sts");
        boolean result2=isPalindrone2("taco cat");
        System.out.println(result2);
    }

    public static boolean isPalindrome(String str){
        int left=0;
        int right = str.length()-1;
        while(left<right){
            if(str.charAt(left) == str.charAt(right)) {
                left++; right--;
            }
            else return false;
        }


        return true;
    }

/*Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word or phrase that is the same 
forwards and backwards. A permutation is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.
Input: Tact Coa, Output: True (permutations: "taco cat", "atco eta", etc.)*/


    public static boolean isPalindrone2(String str){
        HashMap<Character,Integer> hashMap=new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(hashMap.containsKey(str.charAt(i))){
                hashMap.put(str.charAt(i),hashMap.get(str.charAt(i))+1);
            } else{
                hashMap.put(str.charAt(i),1);
            }
        }
        int totalOddCharacters=0;
        for(Map.Entry<Character,Integer> entry: hashMap.entrySet()){
            if(entry.getKey() != ' ' && entry.getValue() %2 != 0) totalOddCharacters++;
        }
        if(totalOddCharacters>1) return false;
        
        return true;
    }
}
