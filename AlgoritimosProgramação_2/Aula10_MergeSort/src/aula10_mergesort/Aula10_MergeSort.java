
package aula10_mergesort;

public class Aula10_MergeSort {

    public static void main(String[] args) {
        // TODO code application logic here
          //int[] v = {3, 5, 9, 7};
          int[] v = {5, 8, 2, 1, 7, 4}; // exercicio 1 da ADO2
    mergeSort(0, v.length, v);
    for (int i = 0; i < v.length; i++) {
      System.out.print(v[i] + " ");
    }
  }

  public static void mergeSort(int p, int n, int[] v) {
    if (p < n - 1) {
      int q = (p + n) / 2;
      mergeSort(p, q, v);
      mergeSort(q, n, v);
      intercala(p, q, n, v);
    }
  }

  public static void intercala(int p, int q, int n, int[] v) {
    int[] w = new int[n - p];
    int i = p;
    int j = q;
    int k = 0;
    while (i < q && j < n) {
      if (v[i] <= v[j]) {
        w[k] = v[i];
        i++;
      }
      else {
        w[k] = v[j];
        j++;
      }
      k++;
    }
    while (i < q) {
      w[k] = v[i];
      i++;
      k++;
    }
    while (j < n) {
      w[k] = v[j];
      j++;
      k++;
    }
    for (int x = p, y = 0; x < n; x++, y++) {
      v[x] = w[y];
    }
  }
    }
    

