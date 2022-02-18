/* 1.1 Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
cannot use additional data structures?
Hints: #44, #7 7 7, #732*/
public class IsUniqueString{

   


    public static void main(String[] args){
        boolean isUniqueStr =isUnique("abcdefu");
        System.out.println(isUniqueStr);
        boolean isUniqueStr2 =isUnique("abcd");
        System.out.println(isUniqueStr2);
    }

    //time complexity: o(n2) && space complexity: o(1)
    public static boolean isUnique(String s){
        if(s == null) return true;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length() && j!=i;j++){
                if(s.charAt(i) == s.charAt(j)) return false;
            }
        }
        return true;
    }

    //Using ASCII character represntation
    //time complexity: o(n) && space complexity: o(1)
    public static boolean isUnique2(String s){
        boolean[] char_set=new boolean[128];

        if(s.length() > 128) return false;
        for(int  i=0;i<s.length();i++){
            int val=s.charAt(i);
            if(char_set[val]){
                return false;
            }
           char_set[val]=true;
        }
        return true;
    }


} 
