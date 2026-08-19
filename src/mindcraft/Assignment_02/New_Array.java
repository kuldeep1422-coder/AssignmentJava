package mindcraft.Assignment_02;

import java.util.Arrays;

public class New_Array {



    public void newarray(int[] arr) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i] * 5;
        }
        System.out.println(Arrays.toString(result));
    }
}
