package ordenacao.algoritms;

import ordenacao.Sorter;

public class InsertionSort implements Sorter{

    @Override
    public int[] sort(int[] arr) {
        //int [] sorted = arr.clone();
        int chave = 0;
        for (int i = 1 ; i < arr.length; i++){
            chave = arr[i];
            int j = i;
            while (chave > arr[j]){
                int a = sorted[i];
                sorted[i] = sorted[i+1];
                sorted[i+1] = a;
                j--;
            }
        }
        
        return arr;
    }

    @Override
    public String getName() {
        return "InsertionSort";
    }

}
