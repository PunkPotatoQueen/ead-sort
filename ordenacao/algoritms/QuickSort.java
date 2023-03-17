package ordenacao.algoritms;

import ordenacao.Sorter;

public class QuickSort implements Sorter {

    @Override
    public int[] sort(int[] elements) {
        int inicio = 0;
        quickSort(arr,inicio, arr.length-1);
        return arr;
    }
    
    private static void quickSort (int[] arr, int inicio, int fim){
        if (inicio<fim){
            int pivo = particao (arr, inicio, fim);
            quickSort(arr, inicio, pivo);
            quickSort(arr, pivo+1, fim);
        }
       // return arr;
    }

    private static int particao(int [] arr, int inicio, int fim){
        int pivo = arr [ ( inicio + fim ) /2 ];
        int i =  inicio - 1;
        int j =  fim + 1;
        while (true){
            do{
                i++;
            }while(arr[i]<pivo);
           
            do{
                j--;
            }while (arr[j]>pivo);

            if(i>=j){
                return j;
            }
            int troca = arr[i];
            arr[i] = arr[j];
            arr[j] = troca;
        }

    }

    @Override
    public String getName() {
        return "QuickSort";
    }

}
