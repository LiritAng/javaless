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

        System.out.println("----7----");

        int[] array_in =  {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        boolean resultArr7 = getArrayTrue(array_in);
        System.out.println(resultArr7);

        int[] array_in2 =  {2, 2, 2, 1, 2, 2, 10, 1};
        boolean resultArr7_2 = getArrayTrue(array_in2);
        System.out.println(resultArr7_2);

        System.out.println("----8----");
        int[] array_in3 =  {1, 5, 3, 2, 11, 4};
        int chnge = -3;
        System.out.println(Arrays.toString(array_in3));
        int[] resultArr8 = arrayMove(chnge,array_in3);
        System.out.println(Arrays.toString(resultArr8));

    }

    public static int[] getArray(int len, int initialVAlue) {
        int[] array_data5 = new int[len];
        for (int k=0; k< array_data5.length; k++){
            array_data5[k]=initialVAlue;
        }
        return array_data5;
    }


    public static boolean getArrayTrue(int[] startArray) {
        boolean result = false;
        for (int k=0; k< startArray.length; k++){
            int sumLeft = 0;
            int sumRight = 0;

            for (int i=0; i < k; i++){
                sumLeft +=startArray[i];
            }
            System.out.println(sumLeft);

            for (int j=k; j < startArray.length; j++){
                sumRight +=startArray[j];
            }
            System.out.println(sumRight);

            if (sumLeft == sumRight) {
                result = true;
            }
        }
        return result;
    }

    public static int[] arrayMove(int change, int[] startArray) {

        if (change >=0) {
            for (int i=0; i < change; i++){
                int a;
                int pr_ind;

                for (int j=startArray.length-1; j>=0; j--){
                    pr_ind=j-1;
                    a=startArray[j];

                    if (pr_ind<0) {
                        pr_ind=0;
                    }

                    startArray[j]=startArray[pr_ind];
                    startArray[pr_ind]=a;
                }
            }
        }
        else {
            /*до длины смещения но положительное*/
            for (int i=0; i <-1*change; i++){
                int a;
                int n_ind;

                for (int j=0; j < startArray.length-1; j++){
                    n_ind=j+1;
                    a=startArray[j];

//                    System.out.println(n_ind);

                    if (n_ind> startArray.length-1) {
                        n_ind=0;
                    }

                    startArray[j]=startArray[n_ind];
                    startArray[n_ind]=a;
//                    System.out.println(startArray[n_ind]);
                }

            }
        }
        return startArray;
    }
}
