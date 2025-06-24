import java.util.Arrays;

public class mainapp {
    public static void main(String[] args){
        //task1 - reverse array
        int [] arr1 = {1,2,3,4,5,6,7};
        int[] arr2 = new int[arr1.length];
        for(int i = 0; i < arr1.length; i++){
            arr2[i] = arr1[arr1.length - 1 - i];
        }

        System.out.println(Arrays.toString(arr2));

        //task2 - delete middle element in array
        int[] array1 = {1,2,3,4,5,6,7,8,9,10};
        int[] array2 = new int[array1.length-1];
        int middle = array1.length/2;
        int newIndex = 0;
        for(int i = 0; i < array1.length; i++){
            if(i != middle){

            array2[newIndex]=array1[i];
            newIndex++;
            }
        }
        System.out.println(Arrays.toString(array2));


    }
}
