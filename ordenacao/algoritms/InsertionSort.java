package ordenacao.algoritms;

import ordenacao.Sorter;

public class InsertionSort implements Sorter{

    @Override
    public int[] sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i<n; i++){
            int chave = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]>chave){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = chave;
        }
        return arr;
    }

    @Override
    public String getName() {
        return "InsertionSort";
    }

}
