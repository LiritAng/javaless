import jdk.nashorn.internal.runtime.arrays.ArrayData;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class HomeWork3 {

    public static void main(String[] args) {
        int[] array_data = {1, 0,0,0,0,1,1,0};

        for (int i=0; i< array_data.length; i++){
            if (array_data[i] == 1){
                array_data[i] = 0;
            } else {
                array_data[i] = 1;
            }
        }

        int[] array_data2 = new int[100];
        for (int k=0; k< array_data2.length; k++){
            array_data2[k]=k+1;
        }

        int[] array_data3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i=0; i< array_data3.length; i++){
//            System.out.println(array_data3[i]);
            if (array_data3[i] < 6){
                array_data3[i] = array_data3[i]*2;
            }
//            System.out.println(array_data3[i]);
        }

        int[][] array_data4 = new int[5][5];
        for (int i=0; i< array_data4.length; i++){
            for (int j=0; j< array_data4[i].length; j++){
                if (i == j){
                    array_data4[i][j] = 1;
                }
                if (i +j == array_data4.length-1 ){
                    array_data4[i][j] = 1;
                }
//                System.out.println(array_data4[i][j]);
            }
//            System.out.println("-------");
        }

        int[] array_result = getArray(13, 8);
        System.out.println(Arrays.toString(array_result));

        int[] array_maxmin = {1,65, 3, 2, 11, 4, 5, 2, 4, 8, 9, -6};
//        System.out.println(Arrays.toString(array_maxmin));
        sort(array_maxmin);

        System.out.println(Arrays.toString(array_maxmin));

        int ar_min = array_maxmin[0];
        int ar_max = array_maxmin[array_maxmin.length-1];

        System.out.println(ar_min);
        System.out.println(ar_max);

    }

    public static int[] getArray(int len, int initialVAlue) {
        int[] array_data5 = new int[len];
        for (int k=0; k< array_data5.length; k++){
            array_data5[k]=initialVAlue;
        }
        return array_data5;
    }
}
