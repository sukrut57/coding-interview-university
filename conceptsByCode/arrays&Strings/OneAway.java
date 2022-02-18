import java.util.HashMap;
import java.util.Map;

/*One Away: There are three types of edits that can be performed on strings: insert a character,
remove a character, or replace a character. Given two strings, write a function to check if they are
one edit (or zero edits) away.
EXAMPLE
pale, ple -> true
pales, pale -> true
pale, bale -> true
pale, bake -> false*/
public class OneAway {
    public static void main(String[] args){
        boolean result=isOneAway("palle", "palle");
        System.out.println(result);
    }

    public static boolean isOneAway(String s1, String s2){
        int count=0;
        HashMap<Character,Integer> map=new HashMap<>();
        
        for(int i=0;i<s1.length();i++){
            if(map.containsKey(s1.charAt(i))){
                map.put(s1.charAt(i),map.get(s1.charAt(i))+1);
            }
            else map.put(s1.charAt(i),1);
        }

        for(int i=0;i<s2.length();i++){
            if(!map.containsKey(s2.charAt(i))) count++;
        }
        if(count >1) return false;    
        return true;
    }
}
