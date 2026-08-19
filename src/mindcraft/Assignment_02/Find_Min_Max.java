package mindcraft.Assignment_02;

public class Find_Min_Max {
    public void FinMax(int[] arr){
        int NUM_MAX=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (NUM_MAX < arr[i]){
                NUM_MAX =arr[i];
            }
        }
        System.out.println("max number is:  "+ NUM_MAX);
    }

    public void FinMin(int[] arr){
        int NUM_MIN=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (NUM_MIN > arr[i]){
                NUM_MIN = arr[i];
            }
        }
        System.out.println("min number is:  "+ NUM_MIN);
    }
}
