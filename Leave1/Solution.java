package Leave1;

public class Solution {
    
    public static int[] goole_order_count(int[] arr, int n) {

        int[] fresult = new int[arr.length];
        if (n <= 0) {
            return new int[0];
        }
        if (n > 0) {
            int index = 0;
            for (int i = 0; i < arr.length; i++) {
                int count_number = 0;
                for (int j = 0; j < arr.length; j++) {
                    if (i != j) {

                        if (arr[i] == arr[j]) {
                            count_number += 1;
                        }
                    }
                }
                if (count_number < n) {
                    fresult[index] = arr[i];
                    index += 1;
                }

            }

        }
        return fresult;
    }


    public static void main(String[] args) {
        int[] gg = { 1, 2, 2, 3, 3, 3, 4, 5, 5 };
        int n = 1;
        int[] value = goole_order_count(gg, n);

        for(int i = 0;i < value.length; i++){
        System.out.print(value[i] + " ");
        }
    }
}
