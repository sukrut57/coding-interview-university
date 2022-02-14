import java.util.HashSet;

/*Given an integer array nums, return true if any value appears at least twice in the array, 
and return false if every element is distinct.

 */
public class ContainsDuplicateLeetCode{

    public static void main(String[] args){
        int[] arr=new int[] {1,2,3,1};
        String result="fasle";
        HashSet<Integer> hashSet=new HashSet<Integer>();
        for(int i=0;i<arr.length;i++){
            if(hashSet.contains(arr[i])){
                result="true";
                break;
            }
            else{
                hashSet.add(arr[i]);
            }
        }
        System.out.println(result);
    }
}