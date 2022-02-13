package conceptsByCode.sorting;

//O(n2) time complexity, stable sort since we dont swap elements when values are equal.
public class BubbleSort{
    public static void main(String[] args){
        BubbleSort bubbleSort=new BubbleSort();
        bubbleSort.bubbleSort(new int[] {1,2,4,5,6});
    }

    public void bubbleSort(int[] arr){
        int arraySize=arr.length;
        for(int i=arraySize-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(arr[j] > arr[j+1]){
                    int temp=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i:arr) System.out.println(i);
    }
}   
