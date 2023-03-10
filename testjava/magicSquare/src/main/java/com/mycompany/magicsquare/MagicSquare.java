package com.mycompany.magicsquare;

/**
 *
 * @author elias
 */
public class MagicSquare {

    public static void main(String[] args) {
      int n = 3; // tamaño de la matriz
      int[][] matrizMagica = new int[n][n];
      
      int fila = n-1;
      int col = n/2;
      matrizMagica[fila][col] = 1;
      
      for (int i = 2; i <= n*n; i++) {
         if (matrizMagica[(fila + 1) % n][(col + 1) % n] == 0) {
            fila = (fila + 1) % n;
            col = (col + 1) % n;
         }
         else {
            fila = (fila - 1 + n) % n;
         }
         matrizMagica[fila][col] = i;
      }
      
      // imprimir la matriz
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
            System.out.print(matrizMagica[i][j] + " ");
         }
         System.out.println();
      }
   }
}
