/*String Compression: Implement a method to perform basic string compression using the counts
of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the
"compressed" string would not become smaller than the original string, your method should return
the original string. You can assume the string has only uppercase and lowercase letters (a - z).
Hints:#92, #110*/
public class StringCompression {
    public static void main(String[] args){
        String s=compressedString("aabcccccdefgg");
        System.out.println(s);
    }
    public static String compressedString(String s){
        StringBuilder stringBuilder=new StringBuilder();
        int count=1;

        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i) == s.charAt(i+1)){
                count ++;
            }
            else{
                stringBuilder.append(s.charAt(i)).append(count);
                count=1;
            }
        }
        stringBuilder.append(s.charAt(s.length()-1)).append(count);

        return stringBuilder.toString();
    }
}
