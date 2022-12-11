package DS;

import java.util.Arrays;

public class Ds_tester {
    public static void main(String[] args) {
        int [][] arr={
            {1,2,3,4,5},
            {5,6,7,8,9},
            {11,12,13,14,15}
        };
        for (int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
    public static void print(int ... i){ //varargs , variable arguments java 
        for (int j : i) {
            System.out.print(j+" , ");
        }
    }
}
