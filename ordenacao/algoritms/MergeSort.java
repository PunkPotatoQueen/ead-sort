package ordenacao.algoritms;

import ordenacao.Sorter;

public class MergeSort implements Sorter {

    @Override
    public int[] sort(int[] arr) {
        if (arr.length<=1){
            return arr;
        }
    
        int inicio = 0;
        int fim = arr.length-1;
        int [] sorted = new int[arr.length];
        mergeSort(arr, sorted, inicio, fim);
        return arr;
    }
    
    private static void mergeSort (int[] arr, int [] aux, int inicio, int fim){
        if (inicio<fim){
            int metade = (inicio+fim)/2;
            mergeSort(arr, aux, inicio, metade);
            mergeSort(arr, aux, metade+1, fim);
            juntarParticoes(arr, aux, inicio, metade, fim);
        }
    }
    
    private static void juntarParticoes(int[] arr, int [] aux, int inicio, int metade, int fim){
        for (int i = inicio; i <=fim; i++){
            aux[i] = arr[i];
        }
    
        int indexEsq = inicio;
        int indexDir = metade+1;
        
        for (int i = inicio; i<=fim; i++){       
            if (indexEsq>metade){
                arr[i] = aux[indexDir++];
            }
            else if (indexDir>fim){
                arr[i]= aux[indexEsq++];
            }
            else if (aux[indexEsq]<aux[indexDir]){
                arr [i] = aux[indexEsq++];
            }
            else{
                arr[i] = aux[indexDir++];
            }
        }
    }

    @Override
    public String getName() {
        return "MergeSort";
    }

}
