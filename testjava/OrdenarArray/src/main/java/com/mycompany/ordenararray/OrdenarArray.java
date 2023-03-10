package com.mycompany.ordenararray;

import java.util.Arrays;

/**
 *
 * @author elias
 */
public class OrdenarArray {

    public static void main(String[] args) {
        int arr [] = {5, 9, 0, 11, 22, 7, 0, 0, 8, 9};
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j++] = arr[i];
            }
        }
        while (j < arr.length) {
            arr[j++] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
